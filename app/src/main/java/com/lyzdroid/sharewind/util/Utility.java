package com.lyzdroid.sharewind.util;

import android.util.Log;

import com.google.gson.Gson;
import com.lyzdroid.sharewind.gson.CityInfo;
import com.lyzdroid.sharewind.gson.WeatherNow;

/**
 * 工具类
 */
public class Utility {

    /**
     * 处理服务器返回的城市信息
     * @param responseData  服务器返回数据的body
     * @return  若解析成功，返回解析后的CityInfo类的对象
     */
    public static CityInfo handleCityInfoResponse(String responseData) {
        LogUtil.i("handleCityInfoResponse", responseData);
        try {
            return new Gson().fromJson(responseData, CityInfo.class);
        } catch (Exception e) {
            LogUtil.e("handleCityInfoResponse", Log.getStackTraceString(e));
        }
        return null;
    }

    /**
     * 处理服务器返回的天气实时信息
     * @param responseData  服务器返回数据的body
     * @return  若解析成功，返回解析后的WeatherNow类的对象
     */
    public static WeatherNow handleWeatherNowResponse(String responseData) {
        LogUtil.i("handleWeatherNowResponse", responseData);
        try {
            return new Gson().fromJson(responseData, WeatherNow.class);
        } catch (Exception e) {
            LogUtil.e("handleWeatherNowResponse", Log.getStackTraceString(e));
        }
        return null;
    }
}
