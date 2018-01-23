package com.example.ortiz.tipcalculator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ortiz.tipcalculator.R;

import butterknife.ButterKnife;

/**
 * Created by ortiz on 1/18/2018.
 */

public class FragmentDisplayTotal extends BaseFragment {

    private View rootView;


    public static FragmentDisplayTotal newInstance() {

        Bundle args = new Bundle();

        FragmentDisplayTotal fragment = new FragmentDisplayTotal();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_display_total,container,false);
        ButterKnife.bind(this,rootView);


        return rootView;
    }

}
