package com.example.aminu.ramadanguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class counters extends AppCompatActivity {

    private int counterValue = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counters);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void plus(View view) {
        counterValue++;
        textView.setText(String.valueOf(counterValue));
    }

    public void reset(View view) {
        counterValue = 0;
        textView.setText(String.valueOf(counterValue));
    }
}
