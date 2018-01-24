package com.example.ortiz.tipcalculator.dialog;

import android.app.DialogFragment;
import android.os.Bundle;

import com.example.ortiz.tipcalculator.infrastructure.TipCalculatorApplication;
import com.squareup.otto.Bus;

/**
 * BASE CLASS FOR ALL DIALOGS
 *
 * Created by ortiz on 1/23/2018.
 *
 */

public class BaseDialog extends DialogFragment {

    protected TipCalculatorApplication application;
    protected Bus bus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (TipCalculatorApplication) getActivity().getApplication();
        bus = application.getBus();
        bus.register(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bus.unregister(this);
    }
}
