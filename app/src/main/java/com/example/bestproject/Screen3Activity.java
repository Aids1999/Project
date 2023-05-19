package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Screen3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);

        ImageButton imageButton = findViewById(R.id.back);
        {
            View.OnClickListener goToSecondActivty = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Screen3Activity.this, SecondActivty.class);
                    startActivity(intent);
                }
            };
            imageButton.setOnClickListener(goToSecondActivty);
        }
    }
}