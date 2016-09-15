package com.example.lxchild.huiwentest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by LXChild on 8/12/16.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String phoneNum = getResultData();
        Log.d("Test", phoneNum +  ">>>>>>>>>>>>>>>>>>>>>>>");
        setResultData("179521" + phoneNum);
    }
}
