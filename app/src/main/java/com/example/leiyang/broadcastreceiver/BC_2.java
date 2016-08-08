package com.example.leiyang.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by LeiYang on 2016/8/8 0008.
 */

public class BC_2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            String str = intent.getStringExtra("msg");
            Log.i("info","结果2：" + str);
//            abortBroadcast();  //实际无法截断

    }
}
