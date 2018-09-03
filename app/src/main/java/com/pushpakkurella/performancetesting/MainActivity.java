package com.pushpakkurella.performancetesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        long startTime=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            for(int j=0;j<3000000;j++){

            }
        }
        long endTime=System.currentTimeMillis();
        long diffTime=endTime-startTime;
        textView.setText("the operation took "+diffTime+" amount of time");


    }
}
