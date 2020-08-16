package com.example.fragmentstudy;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public  class ExampleFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        LifecycleLogUtil.log("ExampleFragment onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleLogUtil.log("ExampleFragment onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LifecycleLogUtil.log("ExampleFragment onCreateView");
        return inflater.inflate(R.layout.example_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LifecycleLogUtil.log("ExampleFragment onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        LifecycleLogUtil.log("ExampleFragment onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        LifecycleLogUtil.log("ExampleFragment onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        LifecycleLogUtil.log("ExampleFragment onPause");

    }

    @Override
    public void onStop() {
        super.onStop();
        LifecycleLogUtil.log("ExampleFragment onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LifecycleLogUtil.log("ExampleFragment onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LifecycleLogUtil.log("ExampleFragment onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        LifecycleLogUtil.log("ExampleFragment onDetach");

    }
}
