package com.example.leiyang.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by LeiYang on 2016/8/6 0006.
 */

public class BC_1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getStringExtra("msg");

        Log.i("info","结果1：" + str);

        /*普通广播无法截断和处理广播，此处为处理广播*/
        Bundle bundle1 = getResultExtras(true);
        String result = bundle1.getString("res");
        Log.i("info","附加的值："+result);

        abortBroadcast();
    }
}
