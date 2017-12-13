package com.yiful.weatherchallenge.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.yiful.weatherchallenge.R;
import com.yiful.weatherchallenge.model.WeatherDetail;
import com.yiful.weatherchallenge.utility.ForecastListAdapter;
import com.yiful.weatherchallenge.utility.HttpHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private TextView tvDate, tvHigh, tvLow, tvWeather;
    private ImageView imageView;
    private ListView listView;

    private WeatherDetail currentWeatherDetail;
    private List<WeatherDetail> forecastItems;
    public static Map<String, Integer> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHigh = findViewById(R.id.tvHigh);
        tvLow = findViewById(R.id.tvLow);
        tvDate = findViewById(R.id.tvDate);
        tvWeather = findViewById(R.id.tvWeather);
        imageView = findViewById(R.id.imageView);
        listView = findViewById(R.id.listView);
        View view = findViewById(R.id.header);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("weatherDetail", currentWeatherDetail);
                Log.i("detail", currentWeatherDetail.getWeather());
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WeatherDetail weatherDetail = forecastItems.get(i);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("weatherDetail", weatherDetail);
                Log.i("detail", weatherDetail.getWeather());
                startActivity(intent);
            }
        });
        //retrieve data from json url and show it on main thread.
        new RetrieveWeatherData().execute();
    }

    private class RetrieveWeatherData extends AsyncTask{
        private ProgressDialog progressDialog;
        private String responseWeather, responseForecast, date;
        private Double high, low, windDegree, windSpeed, pressure;
        private String weather,img;
        private int humidity;

   //     private List<WeatherDetail> forecastItems;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            forecastItems = new ArrayList<>();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Loading result...");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            //construct image map
            map = new WeatherImageTable().getImageTable();
            HttpHandler httpHandler = new HttpHandler();
            responseWeather = httpHandler.getJsonString(HttpHandler.CURRENT_URL);
            responseForecast = httpHandler.getJsonString(HttpHandler.FORECAST_URL);
            try {
                /**
                 * get current weather
                 */
                JSONObject weatherJson = new JSONObject(responseWeather);
                low = weatherJson.getJSONObject("main").getDouble("temp_min");
                high = weatherJson.getJSONObject("main").getDouble("temp_max");
                weather = weatherJson.getJSONArray("weather").getJSONObject(0).getString("main");
                img = weatherJson.getJSONArray("weather").getJSONObject(0).getString("icon");
                humidity = weatherJson.getJSONObject("main").getInt("humidity");
                windDegree = weatherJson.getJSONObject("wind").getDouble("deg");
                windSpeed = weatherJson.getJSONObject("wind").getDouble("speed");
                pressure = weatherJson.getJSONObject("main").getDouble("pressure");
                currentWeatherDetail = new WeatherDetail("Today", low, high, map.get(img), weather, humidity, windDegree, windSpeed, pressure);
                /**
                 * get forecast weather
                 */
                JSONObject forecastJson = new JSONObject(responseForecast);
                JSONArray forecastArray = forecastJson.getJSONArray("list");
                for(int i = 2; i < forecastArray.length(); i += 8){
                    String date = forecastArray.getJSONObject(i).getString("dt_txt");
                    Double low = forecastArray.getJSONObject(i).getJSONObject("main").getDouble("temp_min");
                    Double high = forecastArray.getJSONObject(i).getJSONObject("main").getDouble("temp_max");
                    int imgRes = map.get(forecastArray.getJSONObject(i).getJSONArray("weather").getJSONObject(0).getString("icon"));
                    String weather = forecastArray.getJSONObject(i).getJSONArray("weather").getJSONObject(0).getString("main");
                    int humidity = forecastArray.getJSONObject(i).getJSONObject("main").getInt("humidity");
                    double windDegree = forecastArray.getJSONObject(i).getJSONObject("wind").getDouble("deg");
                    double windSpeed = forecastArray.getJSONObject(i).getJSONObject("wind").getDouble("speed");
                    double pressure = forecastArray.getJSONObject(i).getJSONObject("main").getDouble("pressure");
                    Calendar calendar = Calendar.getInstance(); //get day of week
                    calendar.add(Calendar.DAY_OF_WEEK,1+i%8-2);
                    String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
                    forecastItems.add(new WeatherDetail(dayOfWeek,low,high,imgRes,weather, humidity, windDegree, windSpeed, pressure));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            if(progressDialog.isShowing()){
                progressDialog.dismiss();
            }

            tvHigh.setText("High: "+high+"°");
            tvLow.setText("Low: "+low + "°");
            tvWeather.setText(weather);
            imageView.setImageResource(map.get(img));
            Calendar calendar = Calendar.getInstance();
      //      String currentDate = calendar.getDisplayName(Calendar.DATE, Calendar.LONG, Locale.getDefault());
            Log.i("main", "current date is "+calendar.getTime());
            Log.i("main", "getDateInstance is "+DateFormat.getDateInstance());
            tvDate.setText("Today, "+new SimpleDateFormat("MMM dd", Locale.getDefault()).format(calendar.getTime()));
            listView.setAdapter(new ForecastListAdapter(MainActivity.this, R.id.listView, forecastItems));
        }
    }

    private class WeatherImageTable{
        public Map<String, Integer> getImageTable(){
            Map<String, Integer> map = new HashMap();
            map.put("01d", R.drawable.art_clear);
            map.put("02d", R.drawable.art_light_clouds);
            map.put("03d", R.drawable.art_clouds);
            map.put("04d", R.drawable.art_clouds);
            map.put("09d", R.drawable.art_light_rain);
            map.put("10d", R.drawable.art_rain);
            map.put("11d", R.drawable.art_storm);
            map.put("13d", R.drawable.art_snow);
            map.put("50d", R.drawable.art_fog);

            map.put("01n", R.drawable.ic_clear);
            map.put("02n", R.drawable.ic_light_clouds);
            map.put("03n", R.drawable.ic_cloudy);
            map.put("04n", R.drawable.ic_cloudy);
            map.put("09n", R.drawable.ic_light_rain);
            map.put("10n", R.drawable.ic_rain);
            map.put("11n", R.drawable.ic_storm);
            map.put("13n", R.drawable.ic_snow);
            map.put("50n", R.drawable.ic_fog);
            return map;
        }
    }
}
