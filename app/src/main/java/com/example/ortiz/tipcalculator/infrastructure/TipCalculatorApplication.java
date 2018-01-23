package com.example.ortiz.tipcalculator.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by ortiz on 1/17/2018.
 */

public class TipCalculatorApplication extends Application {
    private Bus bus;

    public TipCalculatorApplication() {
        this.bus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Bus getBus() {
        return bus;
    }
}
