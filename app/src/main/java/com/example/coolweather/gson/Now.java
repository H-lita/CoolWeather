package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：CoolWeather
 * 创建人：lita
 * 创建时间：2019-07-03 21:28
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
