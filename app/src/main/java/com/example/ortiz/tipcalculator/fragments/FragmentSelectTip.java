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

public class FragmentSelectTip extends BaseFragment {

    private View rootView;


    public static FragmentSelectTip newInstance() {

        Bundle args = new Bundle();

        FragmentSelectTip fragment = new FragmentSelectTip();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_select_tip,container,false);
        ButterKnife.bind(this,rootView);


        return rootView;
    }

}
