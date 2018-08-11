package com.example.kson.qrcodedemo.app;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/08/11
 * Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
