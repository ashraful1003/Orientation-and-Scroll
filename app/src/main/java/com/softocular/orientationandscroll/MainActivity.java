package com.softocular.orientationandscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// if you want to relative layout just remove the comment from the below line
//        startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));

/// if you want to table layout just remove the comment from the below line
//        startActivity(new Intent(MainActivity.this, TableLayoutActivity.class));

        /// if you want to frame layout just remove the comment from the below line
//        startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
    }
}