package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：CoolWeather
 * 创建人：lita
 * 创建时间：2019-07-03 21:28
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
