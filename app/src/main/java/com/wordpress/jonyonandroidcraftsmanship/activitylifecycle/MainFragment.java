package com.wordpress.jonyonandroidcraftsmanship.activitylifecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("onAttach ", "onAttach Fragment");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate ", "onCreate Fragment");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("onCreateView ", "onCreateView Fragment");
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("onCreate ", "onCreate Fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart ", "onStart Fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume ", "onResume Fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause ", "onPause Fragment");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("onSaveInstanceState ", "onSaveInstanceState Fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStop ", "onStop Fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("onDestroyView ", "onDestroyView Fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy ", "onDestroy Fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("onDetach ", "onDetach Fragment");
    }
}
