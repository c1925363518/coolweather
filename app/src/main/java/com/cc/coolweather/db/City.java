package com.cc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenchao on 2017/3/5.
 */

public class City extends DataSupport
{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setcityName(String cityName)
    {
        this.cityName=cityName;
    }

    public int getcityCode()
    {
        return cityCode;
    }

    public void setcityCode(int cityCode)
    {
        this.cityCode=cityCode;
    }

    public int getProvinceId()
    {
        return provinceId;
    }

    public void setProvinceId(int provinceId)
    {
        this.provinceId=provinceId;
    }
}
