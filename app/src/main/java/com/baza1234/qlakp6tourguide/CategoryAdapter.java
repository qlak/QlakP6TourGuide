package com.baza1234.qlakp6tourguide;


import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Adapter to represent the tab menu.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TopSpotsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new FunFragment();
        } else {
            return new HistoryFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.top_spots_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.food_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.fun_fragment);
        } else {
            return mContext.getString(R.string.history_fragment);
        }
    }
}
