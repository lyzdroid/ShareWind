package com.lyzdroid.sharewind.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CityInfo {

    public String status;

    @SerializedName("location")
    public List<Location> locationList;
}
