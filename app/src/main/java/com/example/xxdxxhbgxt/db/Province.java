package com.example.xxdxxhbgxt.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Administrator on 2019/10/16 0016.
 */

public class Province extends LitePalSupport {
    private int id;//省的编号
    private String provinceName;//省的名称
    private  int provinceCode;//省的代号

    public   int getId(){
        return id;//取得ID
    }  public   void setId(){
        this.id=id;//设置ID
    }

    public   String getProvinceName(){
        return provinceName;//取得省的名字
    }  public   void setProvinceName(String name){
        this.provinceName = provinceName;//设置省的名字
    }

    public   int getProvinceCode(){
        return provinceCode;//取得省的代号
    }
    public  void setProvinceCode(int id){
        this.provinceCode=provinceCode;//设置省的代号
    }
}
