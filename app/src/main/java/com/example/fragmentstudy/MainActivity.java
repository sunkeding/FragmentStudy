package com.example.fragmentstudy;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        LifecycleLogUtil.log("MainActivity onRestart");
    }


    @Override
    protected void onStart() {
        super.onStart();
        LifecycleLogUtil.log("MainActivity onStart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleLogUtil.log("MainActivity onCreate");

        setContentView(R.layout.activity_main);
//        initFragment();
        initEvent();
    }

    private void initEvent() {
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Alert message to be shown");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        LifecycleLogUtil.log("MainActivity onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        LifecycleLogUtil.log("MainActivity onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        LifecycleLogUtil.log("MainActivity onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LifecycleLogUtil.log("MainActivity onDestroy");

    }


    private void initFragment() {
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fl_content, new ExampleFragment())
//                .commitAllowingStateLoss();
    }
}