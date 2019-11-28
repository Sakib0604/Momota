package com.example.rainb.momota;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MonthlyTasks extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;

    public void onBackPressed()
    {
        finish();
        startActivity(new Intent(this,Home.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_tasks);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }


    //call pageview
    private void setUpViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new MonthOne(),"One");
        adapter.addFragments(new MonthTwo(),"Two");
        adapter.addFragments(new MonthThree(),"Three");
        adapter.addFragments(new MonthFour(),"Four");
        adapter.addFragments(new MonthFive(),"Five");
        adapter.addFragments(new MonthSix(),"Six");
        adapter.addFragments(new MonthSeven(),"Seven");
        adapter.addFragments(new MonthEight(),"Eight");
        adapter.addFragments(new MonthNine(),"Nine");
        adapter.addFragments(new MonthTen(),"Ten");
        viewPager.setAdapter(adapter);
    }


}