package com.example.xxdxxhbgxt.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2019/10/23 0023.
 */

public class HttpUtil {
public static void sendokHttpRequest(String address,okhttp3.Callback callback){//重构sendokHttpRequest方法
    OkHttpClient client= new OkHttpClient();
    Request request = new  Request.Builder().url(address).build();
    client.newCall(request).enqueue(callback);
}
}
