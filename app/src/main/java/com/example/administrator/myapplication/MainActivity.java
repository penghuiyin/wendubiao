package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.myapplication.view.TemperatureView;

public class MainActivity extends AppCompatActivity {

    private TemperatureView mTemperatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTemperatureView = (TemperatureView) findViewById(R.id.temperature_view);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (float i = 0; i <=40; i ++) {
                    mTemperatureView.setCurrentTemp(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
