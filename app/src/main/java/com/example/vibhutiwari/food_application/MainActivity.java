package com.example.vibhutiwari.food_application;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

import com.ToxicBakery.viewpager.transforms.CubeOutTransformer;

import github.chenupt.springindicator.SpringIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        SpringIndicator springIndicator = (SpringIndicator) findViewById(R.id.indicator);

        FoodPagerAdapter fpa=new FoodPagerAdapter(getSupportFragmentManager(),MainActivity.this);
        viewPager.setAdapter(fpa);
        viewPager.setPageTransformer(true,new CubeOutTransformer());
        springIndicator.setViewPager(viewPager);

    }
}
