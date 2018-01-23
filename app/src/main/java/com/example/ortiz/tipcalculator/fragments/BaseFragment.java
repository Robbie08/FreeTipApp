package com.example.ortiz.tipcalculator.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ortiz.tipcalculator.infrastructure.TipCalculatorApplication;
import com.squareup.otto.Bus;

import butterknife.ButterKnife;

/**
 * Created by ortiz on 1/18/2018.
 */

public class BaseFragment extends Fragment {
    protected TipCalculatorApplication application;
    protected Bus bus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getId(),container,false);
        ButterKnife.bind(this,view);
        application = (TipCalculatorApplication) getActivity().getApplication();
        bus = application.getBus();
        bus.register(this);

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //bus.unregister(this);
    }
}
