package com.example.xxdxxhbgxt.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2019/10/23 0023.
 */

public class City  extends LitePalSupport{
    private int id;//序号
    private  String cityName;//城市名称
    private  int cityCode;//城市编号
    private  int provinceId;//当前市所属省的ID

    public int getId() {//取得序号
        return id;
    }
    public void setId(int id) {
        this.id = id;//设置序号
    }

    public String getCityName() {
        return cityName;//取得城市名称
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;//设置城市名称
    }

    public int getCityCode() {
        return cityCode;//取得城市代号
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;//设置城市代号
    }

    public int getProvinceId() {
        return provinceId;//取得该城市所属省ID
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;//设置该城市所属省ID
    }
}
