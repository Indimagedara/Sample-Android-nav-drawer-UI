package com.nimezzz.androidsidebarui;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout sampleDrawerlayout;
    private ActionBarDrawerToggle sampleToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleDrawerlayout = (DrawerLayout)findViewById(R.id.drawer);
        sampleToggle = new ActionBarDrawerToggle(this,sampleDrawerlayout,R.string.open,R.string.close);
        sampleDrawerlayout.addDrawerListener(sampleToggle);
        sampleToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
