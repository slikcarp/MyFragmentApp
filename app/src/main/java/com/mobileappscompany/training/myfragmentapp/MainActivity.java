package com.mobileappscompany.training.myfragmentapp;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void setTextTo(String text) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment2Interface fragment2 = (Fragment2Interface) fm.findFragmentById(R.id.fragment2);
        fragment2.setTheText(text);
        textView.setText(text);
    }
}
