package com.example.bestproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Screen6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen5);

        ImageButton imageButton = findViewById(R.id.back);
        {
            View.OnClickListener goToSecondActivty = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Screen6Activity.this, SecondActivty.class);
                    startActivity(intent);
                }
            };
            imageButton.setOnClickListener(goToSecondActivty);
        }
    }
}
