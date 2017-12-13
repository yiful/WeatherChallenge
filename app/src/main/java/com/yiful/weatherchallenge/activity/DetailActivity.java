package com.yiful.weatherchallenge.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.yiful.weatherchallenge.R;
import com.yiful.weatherchallenge.model.WeatherDetail;

public class DetailActivity extends AppCompatActivity {
    private TextView tvDate, tvHigh, tvLow, tvWeather, tvHumidity, tvWind, tvPressure;
    private ImageView imageView;
    private WeatherDetail weatherDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvHigh = findViewById(R.id.tvHigh);
        tvLow = findViewById(R.id.tvLow);
        tvDate = findViewById(R.id.tvDate);
        tvWeather = findViewById(R.id.tvWeather);
        imageView = findViewById(R.id.imageView);
        tvHumidity = findViewById(R.id.tvHumidity);
        tvWind = findViewById(R.id.tvWind);
        tvPressure = findViewById(R.id.tvPressure);
        weatherDetail = getIntent().getParcelableExtra("weatherDetail");

        tvHigh.setText("Low: "+weatherDetail.getHigh()+"°F");
        tvLow.setText("High: "+weatherDetail.getLow() + "°F");
        tvWeather.setText(weatherDetail.getWeather());
        imageView.setImageResource(weatherDetail.getImgRes());
        tvDate.setText(weatherDetail.getDate());
        tvWind.setText("Wind: "+weatherDetail.getWindSpeed()+" km/h, "+weatherDetail.getWindDegree()+" degree");
        tvHumidity.setText("Humidity: " + weatherDetail.getHumidity()+"%");
        tvPressure.setText("Pressure: " + weatherDetail.getPressure()+" hPa");
    }
}
