package com.lyzdroid.sharewind.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 网络处理工具集
 */
public class HttpUtil {

    /**
     * 发送网络请求，执行回调方法
     * @param url   网络地址
     * @param callback  回调方法
     */
    public static void sendOkHttpRequest(String url, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
