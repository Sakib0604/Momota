package com.example.rainb.momota;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rainb on 18-Nov-17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<android.support.v4.app.Fragment> fragmentList = new ArrayList<>();
    private final List<String> titleList = new ArrayList<>();



    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
    public void addFragments(android.support.v4.app.Fragment fragment, String title){
        fragmentList.add(fragment);
        titleList.add(title);

    }
}
