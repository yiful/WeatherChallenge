package com.yiful.weatherchallenge.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Yifu on 12/12/2017.
 */

public class WeatherDetail implements Parcelable{
    private String date, weather;
    private double low, high, pressure, windSpeed, windDegree;
    private int imgRes, humidity;

    protected WeatherDetail(Parcel in) {
        date = in.readString();
        weather = in.readString();
        low = in.readDouble();
        high = in.readDouble();
        pressure = in.readDouble();
        windSpeed = in.readDouble();
        windDegree = in.readDouble();
        imgRes = in.readInt();
        humidity = in.readInt();
    }

    public static final Creator<WeatherDetail> CREATOR = new Creator<WeatherDetail>() {
        @Override
        public WeatherDetail createFromParcel(Parcel in) {
            return new WeatherDetail(in);
        }

        @Override
        public WeatherDetail[] newArray(int size) {
            return new WeatherDetail[size];
        }
    };

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(double windDegree) {
        this.windDegree = windDegree;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public WeatherDetail(String date, double low, double high, int imgRes, String weather, int humidity, double windDegree, double windSpeed, double pressure) {
        this.date = date;
        this.low = low;
        this.high = high;
        this.imgRes = imgRes;
        this.weather = weather;
        this.humidity = humidity;
        this.windDegree = windDegree;
        this.windSpeed = windSpeed;
        this.pressure = pressure;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(date);
        parcel.writeString(weather);
        parcel.writeDouble(low);
        parcel.writeDouble(high);
        parcel.writeDouble(pressure);
        parcel.writeDouble(windSpeed);
        parcel.writeDouble(windDegree);
        parcel.writeInt(imgRes);
        parcel.writeInt(humidity);
    }
}
