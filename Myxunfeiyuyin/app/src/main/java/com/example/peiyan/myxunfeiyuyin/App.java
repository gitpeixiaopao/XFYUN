package com.example.peiyan.myxunfeiyuyin;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by peiyan on 2017/7/30.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        //将“12345678”替换成您申请的 APPID，申请地址：http://www.xfyun.cn
        //请勿在“=”与 appid 之间添加任务空字符或者转义符
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=58155541");
        super.onCreate();
    }
}
