package com.yiful.weatherchallenge.utility;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Yifu on 11/19/2017.
 * HttpHandler class is used to get JSON strings based on the JSON link
 */

public class HttpHandler {
    public static final String CURRENT_URL = "http://api.openweathermap.org/data/2.5/weather?q=chicago&units=imperial&appid=750e4095642e32506aa73856eba627bf";
    public static final String FORECAST_URL = "http://api.openweathermap.org/data/2.5/forecast?q=chicago&units=imperial&appid=750e4095642e32506aa73856eba627bf";
    public HttpHandler(){

    }

    public String getJsonString(String urlString){
        String response = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            //read data
            InputStream inputStream = new BufferedInputStream(connection.getInputStream());
            response = convertStreamToString(inputStream);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private String convertStreamToString(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while((line=reader.readLine())!=null){
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
