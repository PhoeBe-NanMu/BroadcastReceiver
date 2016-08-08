package com.example.leiyang.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by LeiYang on 2016/8/8 0008.
 */

public class BC_3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String result = intent.getStringExtra("msg");
        Log.i("info","结果3："+ result);

        Bundle bundle = new Bundle();
        bundle.putString("res","广播处理的三好学生");

        setResultExtras(bundle);    //返回的附加的值
//        abortBroadcast();


    }
}
