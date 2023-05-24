package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Screen3Activity extends AppCompatActivity {

    ImageButton imageButton;
    Button comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);

        ImageButton YourAccount = (findViewById(R.id.YourAccount));
        TextView YourName = (findViewById(R.id.YourName));

        YourAccount.setImageResource(R.drawable.img_5);
        YourName.setText("Портретодел");

        imageButton = findViewById(R.id.back);
        View.OnClickListener goToSecondActivty = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Screen3Activity.this, SecondActivty.class);
                    startActivity(intent);
                }
            };
        imageButton.setOnClickListener(goToSecondActivty);

        comments = findViewById(R.id.otzave);
        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdToFive = new Intent(Screen3Activity.this, Screen5Activity.class);
                startActivity(thirdToFive);
            }
        });
    }
}