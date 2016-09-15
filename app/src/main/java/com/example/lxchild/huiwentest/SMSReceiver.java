package com.example.lxchild.huiwentest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * Created by LXChild on 8/13/16.
 * 监听收到短信的广播
 */
public class SMSReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("LXChild", "收到广播了");
        MainActivity.tv.setText("收到广播了");

        Bundle bundle = intent.getExtras();
        Object[] objs = (Object[]) bundle.get("pdus");
        /**
         * 遍历数组短信
         * */
        assert objs != null;
        for (Object obj : objs) {
            SmsMessage msg = SmsMessage.createFromPdu((byte[]) obj);
            String address = msg.getOriginatingAddress();
            String body = msg.getMessageBody();
            Log.d("LXChild", "address:" + address + ",body" + body);

        }
    }
}
