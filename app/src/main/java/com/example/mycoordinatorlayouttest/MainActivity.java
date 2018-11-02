package com.example.mycoordinatorlayouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycoordinatorlayouttest.BottomSheet.BottomSheetActivity;
import com.example.mycoordinatorlayouttest.CustomBehavior.CustomBehaviorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSample(View view){
        startActivity(new Intent(this, SampleActivity.class));
    }

    public void onSample1(View view){
        startActivity(new Intent(this, Sample1Activity.class));
    }

    public void onSample2(View view){
        startActivity(new Intent(this, Sample2Activity.class));
    }

    public void onSample3(View view){
        startActivity(new Intent(this, CustomBehaviorActivity.class));
    }

    public void onSample4(View view){
        startActivity(new Intent(this, BottomSheetActivity.class));
    }
}
