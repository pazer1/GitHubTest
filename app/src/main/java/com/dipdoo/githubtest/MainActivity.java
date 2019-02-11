package com.dipdoo.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Git Test");
        
        //이거슨 집에서 가져온 문서 입니다.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
