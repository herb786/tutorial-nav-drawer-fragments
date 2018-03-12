package com.hacaller.navstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends NavActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_main,null);
        FrameLayout frameLayout = findViewById(R.id.mainContent);
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }
}
