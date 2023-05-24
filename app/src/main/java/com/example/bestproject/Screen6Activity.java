package com.example.bestproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen6Activity extends AppCompatActivity {
    Button lenta;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen6);

        ImageButton YourAccount = (findViewById(R.id.Account));
        TextView YourName = (findViewById(R.id.Name));

        YourAccount.setImageResource(R.drawable.img_2);
        YourName.setText("пчёлка");

        imageButton = findViewById(R.id.back);
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
        lenta = findViewById(R.id.lenta);
        lenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdToFive = new Intent(Screen6Activity.this, Screen4Activity.class);
                startActivity(thirdToFive);
            }
        });
    }
}
