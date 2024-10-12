package com.codecollection.circularprogressbutton;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.codecollection.circularprogress.ProgressButton;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressButton progressButton = findViewById(R.id.sendingBtn);
        progressButton.setOnProgressCompleteListener(() -> Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show());
        
    }
}