package com.example.ortiz.tipcalculator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ortiz.tipcalculator.R;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *--------FRAGMENT--------------
 * Created by ortiz on 1/18/2018.
 *
 * 1)Will take in a input as a EditText that will contain the users totalBill.
 * 2)The user will then select if the this bill is going to be split
 * 3)If the user selects no then the user will get sent directly to the tipFragment
 * 4)Else the user will be prompted with a alertDialog that will then allow him to select
 *   how many people the bill will be split by.
 *
 */

public class FragmentEnterBill extends BaseFragment {

    private View rootView;
    View mainView;
    ViewPager viewPager;

    CoordinatorLayout coordinatorLayout;

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
        mainView = inflater.inflate(R.layout.activity_main,container,false);
        ButterKnife.bind(this,rootView);

        coordinatorLayout = (CoordinatorLayout) mainView.findViewById(R.id.main_content);
        viewPager = (ViewPager) getActivity().findViewById(R.id.container); // on create will set out view pager


        return rootView;
    }



    @OnClick(R.id.fragment_main_button_no)
    public void setButtonNo(){
        String bill = etBillAmount.getText().toString().trim();

        if(!(bill.isEmpty()) && !(Objects.equals(bill, "00.00")) && etBillAmount != null){
            //condition if the value of the bill is 0 or null
            Log.d("BILL_AMT" , " Value is: " +bill);
            viewPager.setCurrentItem(1); //pass in the location to be set at the second tab(SelectTip)
        }
        else {
            Toast.makeText(getContext(),"Please enter a total bill",Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.fragment_main_button_yes)
    public void setButtonYes(){
        Toast.makeText(getContext(),"Yes button is working",Toast.LENGTH_LONG).show();
    }
}
