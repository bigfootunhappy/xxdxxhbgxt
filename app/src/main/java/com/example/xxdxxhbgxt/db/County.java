package com.example.xxdxxhbgxt.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2019/10/23 0023.
 */

public class County extends LitePalSupport {
    private int id;//县的序号
    private String countyName;//县的名称
    private String weatherID;//天气序号
    private  int cityId;//对应城市序号

    public int getId() {
        return id;
    }public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherID() {
        return weatherID;
    }public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public int getCityId() {
        return cityId;
    }public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
