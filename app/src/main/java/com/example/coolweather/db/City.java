package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 格格 on 2017/8/7.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provindeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvindeId() {
        return provindeId;
    }

    public void setProvindeId(int provindeId) {
        this.provindeId = provindeId;
    }
}
