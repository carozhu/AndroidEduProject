package com.caro.edu.androidfourcomponents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity02 extends AppCompatActivity {

    /*onCreate的目的是为了给Activity组件设置显示的布局内容*/
    //第一步
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //第二步
    @Override
    protected void onStart() {
        super.onStart();
    }

    //第三步 最终显示
    @Override
    protected void onResume() {
        super.onResume();
    }

}
