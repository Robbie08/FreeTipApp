package com.example.ortiz.tipcalculator.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.ortiz.tipcalculator.infrastructure.TipCalculatorApplication;
import com.squareup.otto.Bus;

/**
 * Created by ortiz on 1/17/2018.
 */

public class BaseActivity extends AppCompatActivity {
    protected TipCalculatorApplication application;
    protected Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (TipCalculatorApplication) getApplication();
        bus = application.getBus();
        bus.register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
