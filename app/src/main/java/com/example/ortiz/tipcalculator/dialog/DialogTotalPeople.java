package com.example.ortiz.tipcalculator.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ortiz.tipcalculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ortiz on 1/23/2018.
 *
 * Will get the user input on the amount of people
 * that will split the bill.
 *
 * 1) Get user input
 * 2) Send input amount to the last tab's list adapter
 * 3) Close the dialog
 */

public class DialogTotalPeople extends BaseDialog implements View.OnClickListener{



    NumberPicker numberPicker;
    @BindView(R.id.dialog_total_people_tv)
    TextView tvNumberCount;
    String trueValue;
    ViewPager viewPager;

    public static DialogTotalPeople newInstance() {

        Bundle args = new Bundle();

        DialogTotalPeople fragment = new DialogTotalPeople();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View rootView = inflater.inflate(R.layout.dialog_total_people,null);
        ButterKnife.bind(this,rootView);

        viewPager = (ViewPager) getActivity().findViewById(R.id.container); // on create will set out view page

        numberPicker = (NumberPicker) rootView.findViewById(R.id.numberPicker); //inflate our numberPickerView
        final String [] values = {"2","3","4","5","6","7","8","9","10"}; //array of values to pick from


        //wheel set up
        numberPicker.setMinValue(0); //give it the first value of the array
        numberPicker.setMaxValue(values.length-1); //give it the last value of the array
        numberPicker.setDisplayedValues(values); //pass in our array
        numberPicker.setWrapSelectorWheel(true); //allow for the wheel to be scrolled

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                tvNumberCount.setText(String.format("Total people splitting: %s", values[newVal]));
                trueValue = values[newVal];

            }
        });


        AlertDialog dialog = new AlertDialog.Builder(getActivity())
                .setView(rootView)
                .setPositiveButton("Done", null)
                .setNegativeButton("Cancel",null)
                .show();

        Button nButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE); //negative button to cancel
        Button pButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE); //positive button to proceed

        pButton.setOnClickListener(this);
        return dialog;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(application,"Total people splitting is: " +trueValue,Toast.LENGTH_LONG).show();
        viewPager.setCurrentItem(1); //pass in the location to be set at the second tab(SelectTip)
        dismiss();
    }
}
