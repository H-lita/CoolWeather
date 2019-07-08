package com.example.coolweather.gson;
import com.google.gson.annotations.SerializedName;

/**
 * 项目名称：CoolWeather
 * 创建人：lita
 * 创建时间：2019-07-03 21:27
 */
public class Basic {
    /**
     * 由于JSON中的一些字段不太适合直接作为Java字段命名，这里使用@SerializedName朱姐的方式让JSON字段和java字段建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
