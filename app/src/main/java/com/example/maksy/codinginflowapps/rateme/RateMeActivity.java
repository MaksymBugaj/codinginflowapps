package com.example.maksy.codinginflowapps.rateme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maksy.codinginflowapps.R;

import hotchemi.android.rate.AppRate;

public class RateMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_me);

        AppRate.with(this)
                .setInstallDays(1)
                .setLaunchTimes(3)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
        AppRate.with(this).showRateDialog(this);
    }
}
