package com.example.fragmentstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        LifecycleLogUtil.log("SecondActivity onRestart");
    }


    @Override
    protected void onStart() {
        super.onStart();
        LifecycleLogUtil.log("SecondActivity onStart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleLogUtil.log("SecondActivity onCreate");

        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        LifecycleLogUtil.log("SecondActivity onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        LifecycleLogUtil.log("SecondActivity onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        LifecycleLogUtil.log("SecondActivity onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LifecycleLogUtil.log("SecondActivity onDestroy");

    }

}