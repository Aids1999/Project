package com.example.bestproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Screen5Activity extends AppCompatActivity {
    ImageButton imageButton;
    Button lenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen5);

        ImageButton YourAccount = (findViewById(R.id.YourAccount));
        TextView YourName = (findViewById(R.id.YourName));

        YourAccount.setImageResource(R.drawable.img_5);
        YourName.setText("Портретодел");

        imageButton = findViewById(R.id.back);
        {
            View.OnClickListener goToSecondActivty = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Screen5Activity.this, SecondActivty.class);
                    startActivity(intent);
                }
            };
            imageButton.setOnClickListener(goToSecondActivty);
        }

        lenta = findViewById(R.id.lenta);
        lenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdToFive = new Intent(Screen5Activity.this, Screen3Activity.class);
                startActivity(thirdToFive);
            }
        });
    }
}
