package com.example.bestproject;

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

public class Screen6Activity extends AppCompatActivity {
    List<Review> reviews = new ArrayList<Review>();
    Button lenta;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen6);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list_review);
        ReviewAdapter adapter = new ReviewAdapter(this, reviews);
        recyclerView.setAdapter(adapter);

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

    private void setInitialData() {
        reviews.add(new Review("Портретодел", R.drawable.img_5, "Заказываю программу уже не первый раз, работу делает хорошо и качественно, буду заказывать еще и надеюсь не один раз. Если вам нужно написать код, то лучше его никто этого не сделает, так что скорей пишите ему. Просто ПУШКА ЕПШ"));
        reviews.add(new Review("Михаил", R.drawable.hinkali, "Работа хорошо выполнена, но не успел к срокам, если вам нужно к определенному времени то не советую брать работу у него"));
    }
}
