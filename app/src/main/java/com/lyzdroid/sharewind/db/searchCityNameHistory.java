package com.lyzdroid.sharewind.db;

import org.litepal.crud.DataSupport;

/**
 * 用来存储提交过的城市搜索记录
 */
public class searchCityNameHistory extends DataSupport {

    // 地区/城市名称
    private String locationName;

    // 地区/城市ID
    private String locationId;

    // 该地区/城市的上级行政区划名称
    private String locationAdm2;

    // 该地区/城市所属一级行政区域
    private String locationAdm1;

    // 该地区/城市所属国家名称
    private String locationCountry;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationAdm2() {
        return locationAdm2;
    }

    public void setLocationAdm2(String locationAdm2) {
        this.locationAdm2 = locationAdm2;
    }

    public String getLocationAdm1() {
        return locationAdm1;
    }

    public void setLocationAdm1(String locationAdm1) {
        this.locationAdm1 = locationAdm1;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }
}
