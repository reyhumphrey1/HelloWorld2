package com.dope.rey.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //comments
    }

    public void doIt(View v){
        Toast.makeText(getApplicationContext(), "Hello Alc 3.0", Toast.LENGTH_LONG).show();
    }
}
