package com.example.ortiz.tipcalculator.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ortiz.tipcalculator.fragments.FragmentDisplayTotal;
import com.example.ortiz.tipcalculator.fragments.FragmentEnterBill;
import com.example.ortiz.tipcalculator.fragments.FragmentSelectTip;

/**
 * Created by ortiz on 1/22/2018.
 *
 * Adapter that will contain the control the view layout of the tab activity
 * once a new tab has been selected an instance of a class will be passed of the appropriate class
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position){
            case 0:
                return new FragmentEnterBill(); //will return an instance of a class that controls the first tab
            case 1:
                return new FragmentSelectTip(); //will return an instance of a class that controls the second tab
            case 2:
                return new FragmentDisplayTotal(); //will return an instance of a class that controls the third tab
            default:
                return null;

        }
        //return PlaceHolderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}
