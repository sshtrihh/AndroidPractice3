package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    long dateInMillis = System.currentTimeMillis();
    String format = "yyyy-MM-dd HH:mm:ss";
    final SimpleDateFormat sdf = new SimpleDateFormat(format);
    String dateString = sdf.format(new Date(dateInMillis));

    public void onSendTime(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("time", dateString);

        startActivity(intent);
    }
}