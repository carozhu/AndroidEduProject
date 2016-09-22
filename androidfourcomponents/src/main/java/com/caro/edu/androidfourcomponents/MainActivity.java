package com.caro.edu.androidfourcomponents;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * 参考
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    /*activity展示3部曲*/
    /*onCreate的目的是为了给Activity组件设置显示的布局内容*/
    //第一步
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
    }

    //第二步
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    //第三步 最终显示
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    /********以上3个步骤Activity才真正从创建到展示***********/


    /*以下是activity从不可见都销毁的生命周期*/
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }


    /*activty要销毁的生命周期*/
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }


}
