package com.example.ortiz.tipcalculator.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ortiz.tipcalculator.fragments.FragmentDisplayTotal;
import com.example.ortiz.tipcalculator.fragments.FragmentEnterBill;
import com.example.ortiz.tipcalculator.fragments.FragmentSelectTip;

/**
 * Created by ortiz on 1/22/2018.
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
                FragmentEnterBill tab1 = new FragmentEnterBill();
                return tab1;
            case 1:
                FragmentSelectTip tab2 = new FragmentSelectTip();
                return tab2;
            case 2:
                FragmentDisplayTotal tab3 = new FragmentDisplayTotal();
                return tab3;
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
