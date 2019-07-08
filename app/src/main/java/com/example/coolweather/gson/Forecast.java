package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：CoolWeather
 * 创建人：lita
 * 创建时间：2019-07-03 21:28
 */
public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
