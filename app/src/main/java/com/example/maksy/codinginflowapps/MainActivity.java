package com.example.maksy.codinginflowapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maksy.codinginflowapps.dagger2.MainDagger;
import com.example.maksy.codinginflowapps.gson.GsonExample;
import com.example.maksy.codinginflowapps.mvvmNote.MVVMActivity;
import com.example.maksy.codinginflowapps.pagerview.PagerView;
import com.example.maksy.codinginflowapps.phone.PhoneCall;
import com.example.maksy.codinginflowapps.rateme.RateMeActivity;
import com.example.maksy.codinginflowapps.recyclerjson.JsonTest;

public class MainActivity extends AppCompatActivity {
    private Button buttonRateMe, buttonViewPager, buttonPermissions, buttonPhoneCall, buttonGson,buttonJson, buttonMVVM, buttonDagger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRateMe = (Button) findViewById(R.id.button_rate_me);
        buttonViewPager = (Button) findViewById(R.id.button_view_pager);
        buttonPermissions = (Button) findViewById(R.id.button_permissions);
        buttonPhoneCall = (Button) findViewById(R.id.button_phone_call);
        buttonGson = (Button) findViewById(R.id.button_gson);
        buttonJson = (Button) findViewById(R.id.button_json);
        buttonMVVM = (Button) findViewById(R.id.button_mvvm);
        buttonDagger = (Button) findViewById(R.id.button_dagger);

        buttonRateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RateMeActivity.class));
            }
        });

        buttonViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PagerView.class));
            }
        });

        buttonPermissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Permissions.class));
            }
        });

        buttonPhoneCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PhoneCall.class));
            }
        });

        buttonGson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GsonExample.class));
            }
        });

        buttonJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,JsonTest.class));
            }
        });

        buttonMVVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MVVMActivity.class));
            }
        });

        buttonDagger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainDagger.class));
            }
        });
    }
}
