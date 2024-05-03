package com.thestart.shadow_calculater;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                progressBar.setProgress(count);
                if(count==50){
                    Intent intent = new Intent(MainActivity.this, Calculator_Co.class);
                    startActivity(intent);
                }
            }
        };
        timer.schedule(timerTask,0,100);

    }
}