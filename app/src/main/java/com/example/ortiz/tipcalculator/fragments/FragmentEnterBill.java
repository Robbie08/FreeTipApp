package com.example.ortiz.tipcalculator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ortiz.tipcalculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ortiz on 1/18/2018.
 */

public class FragmentEnterBill extends BaseFragment {

    private View rootView;

    @BindView(R.id.fragment_main_button_no)
    Button buttonNo;

    @BindView(R.id.fragment_main_button_yes)
    Button buttonYes;

    @BindView(R.id.fragment_main_editText_bill_amount)
    EditText etBillAmount;

    public static FragmentEnterBill newInstance() {

        Bundle args = new Bundle();

        FragmentEnterBill fragment = new FragmentEnterBill();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_enter_bill,container,false);
        ButterKnife.bind(this,rootView);


        return rootView;
    }



    @OnClick(R.id.fragment_main_button_no)
    public void setButtonNo(){
        Toast.makeText(getContext(),"Button working",Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.fragment_main_button_yes)
    public void setButtonYes(){
        Toast.makeText(getContext(),"Button working",Toast.LENGTH_LONG).show();
    }
}
