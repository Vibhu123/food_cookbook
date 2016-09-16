package com.example.vibhutiwari.food_application;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by vibhutiwari on 15/09/16.
 */
public class FoodPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;//No of different cateogries of food items
    private String tabTitles[] = new String[] { "China", "India", "USA" };//Types of food items
    private Context context;

    public FoodPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt(FoodFragment.ITEMS_COUNT_KEY, position + 1);
        FoodFragment fragment = new FoodFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
