package com.example.xxdxxhbgxt.util;

import android.text.TextUtils;

import com.example.xxdxxhbgxt.db.City;
import com.example.xxdxxhbgxt.db.County;
import com.example.xxdxxhbgxt.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.PublicKey;

import okhttp3.Response;

/**
 * Created by Administrator on 2019/10/23 0023.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray aLLProvinces = new JSONArray(response);
                for (int i=0;i <aLLProvinces.length() ;i++){
                    JSONObject provinceObject=aLLProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    return false;
    }
    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId) {
    if (!TextUtils.isEmpty(response)) {
        try {
            JSONArray allCities = new JSONArray(response);
            for (int i = 0; i < allCities.length(); i++) {
                JSONObject cityObject = allCities.getJSONObject(i);
                City city = new City();
                city.setCityName(cityObject.getString("name"));
                city.setCityCode(cityObject.getInt("id"));
                city.setProvinceId(provinceId);
                city.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponce(String responce,int cityId){
    if (!TextUtils.isEmpty(responce)){
        try{
            JSONArray allCounties = new JSONArray(responce);
        for(int i = 0;i<allCounties.length();i++){
            JSONObject countyObject = allCounties.getJSONObject(i);
            County county=new County();
            county.setCountyName(countyObject.getString("name"));
            county.setWeatherID(countyObject.getString("weather_id"));
            county.setCityId(cityId);
            county.save();
        }return true;
    }catch (JSONException e){
            e.printStackTrace();
        }
    }
return false;
}
}

