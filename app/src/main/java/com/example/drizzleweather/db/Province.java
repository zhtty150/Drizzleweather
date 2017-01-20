package com.example.drizzleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/1/20.
 */

public class Province extends DataSupport{
    private  int Id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return Id;
    }
    public void setId(int id){
        this.Id = Id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
