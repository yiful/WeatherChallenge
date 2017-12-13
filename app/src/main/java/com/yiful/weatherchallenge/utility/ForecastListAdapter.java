package com.yiful.weatherchallenge.utility;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yiful.weatherchallenge.R;
import com.yiful.weatherchallenge.model.WeatherDetail;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by Yifu on 12/12/2017.
 */

public class ForecastListAdapter extends ArrayAdapter {
    private TextView tvDate, tvHigh, tvLow, tvWeather;
    private ImageView imageView;
    private Context context;
    private List<WeatherDetail> list;
    //private String[]{"Tomorrow", }
    public ForecastListAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.forecast_list_item,parent,false);
        tvHigh = view.findViewById(R.id.tvHigh);
        tvLow = view.findViewById(R.id.tvLow);
        tvDate = view.findViewById(R.id.tvDate);
        tvWeather = view.findViewById(R.id.tvWeather);
        imageView = view.findViewById(R.id.imageView);

        tvHigh.setText(list.get(position).getHigh()+"°");
        tvLow.setText(list.get(position).getLow()+"°");

        Calendar calendar = Calendar.getInstance();
        if(position == 0){
            calendar.add(Calendar.DAY_OF_WEEK,1);
            tvDate.setText("Tomorrow");
        }else{
            calendar.add(Calendar.DAY_OF_WEEK,1+position);
            String dayLongName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
            Log.i("adapter", "day of week is "+Calendar.DAY_OF_WEEK);
            tvDate.setText(dayLongName);
        }

        tvWeather.setText(list.get(position).getWeather());
        imageView.setImageResource(list.get(position).getImgRes());
        return view;
    }
}
