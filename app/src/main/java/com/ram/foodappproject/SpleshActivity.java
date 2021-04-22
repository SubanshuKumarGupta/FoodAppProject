package com.ram.foodappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SpleshActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);
        Thread th = new Thread(){
            public void run(){
                try { sleep(3000);

                }catch (Exception ex){
                    ex.printStackTrace();

                }finally {
                    Intent intent = new Intent(SpleshActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };th.start();
    }
}