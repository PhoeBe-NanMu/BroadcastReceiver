package com.example.leiyang.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * IntentFilter : 意图过虑器
         */
        IntentFilter intentFilter = new IntentFilter("BC_one");

        /*同级别动态注册高于静态注册*/
        intentFilter.setPriority(90);

        BC_2 bc_2 = new BC_2();
        registerReceiver(bc_2,intentFilter);

    }


    public void doClick(View v){

        switch (v.getId()) {
            case R.id.fasong :
                Intent intent = new Intent();
                intent.putExtra("msg","这是一条普通广播");
                intent.setAction("BC_one");
                sendBroadcast(intent);
                break;
            case R.id.youxuguangbo :
                Intent intent1 = new Intent();
                intent1.putExtra("msg","这是一条有序广播");
                intent1.setAction("BC_one");
                sendOrderedBroadcast(intent1,null);
                break;
            case R.id.zhiliu :
                Intent intent2 = new Intent();
                intent2.putExtra("msg","这是一条异步(滞留)广播");
                intent2.setAction("BC_one1");
                sendStickyBroadcast(intent2);

                IntentFilter intentFilter = new IntentFilter("BC_one1");
                intentFilter.setPriority(90);
                BC_4 bc_4 = new BC_4();
                registerReceiver(bc_4,intentFilter);
                break;

            default:break;
        }
    }
}
