package com.lyzdroid.sharewind.gson;

public class Location {

    // 地区/城市名称
    public String name;

    // 地区/城市ID
    public String id;

    // 地区/城市纬度
    public String lat;

    // 地区/城市经度
    public String lon;

    // 该地区/城市的上级行政区划名称
    public String adm2;

    // 该地区/城市所属一级行政区域
    public String adm1;

    // 该地区/城市所属国家名称
    public String country;

    // 该地区/城市所在时区
    public String tz;

    // 该地区/城市目前与UTC时间偏移的小时数
    public String utcOffset;

    // 该地区/城市是否当前处于夏令时:1，表示当前处于夏令时；0，表示当前不是夏令时
    public int isDst;

    // 该地区/城市的属性
    public String type;

    // 地区评分
    public int rank;

    // 该地区的天气预报网页链接
    public String fxLink;
}
