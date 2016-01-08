package com.wordpress.jonyonandroidcraftsmanship.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ", counter + "");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ", counter + "");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ", counter + "");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("counter");
        Log.e("onRestoreInstanceState ", counter + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResumebefroecounter ", counter + "");
        counter++;
        Log.e("onResume ", counter + "");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ", counter + "");
    }

    //won't be called if back button is pressed
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("onSaveInstanceState ", counter + "");
        outState.putInt("counter", counter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ", counter + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ", counter + "");
    }
}
