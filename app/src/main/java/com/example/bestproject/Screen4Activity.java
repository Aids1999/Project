package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Screen4Activity extends AppCompatActivity {

    ImageButton imageButton;
    Button comments;

    List<UserListItem> userListItems = new ArrayList<UserListItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen4);

        ImageButton YourAccount = (findViewById(R.id.Account));
        TextView YourName = (findViewById(R.id.Name));

        YourAccount.setImageResource(R.drawable.img_2);
        YourName.setText("пчёлка");

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recycler);

        ImageButton imageButton = findViewById(R.id.back);
        {
            View.OnClickListener goToSecondActivty = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Screen4Activity.this, SecondActivty.class);
                    startActivity(intent);
                }
            };
            imageButton.setOnClickListener(goToSecondActivty);
        }

        UserListItemAdapter.OnStateClickListener stateClickListener = new UserListItemAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(UserListItem userListItem, int position) {
                ImageButton imageButton = findViewById(R.id.Account);//название id не менять, при измене вылетает приложение
                View.OnClickListener goToAccount = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Screen4Activity.this, Screen4Activity.class);
                        startActivity(intent);
                    }
                };
                imageButton.setOnClickListener(goToAccount);
            }
        };

        UserListItemAdapter adapter = new UserListItemAdapter(this, userListItems, stateClickListener);

        recyclerView.setAdapter(adapter);

        comments = findViewById(R.id.otzave);
        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdToFive = new Intent(Screen4Activity.this, Screen6Activity.class);
                startActivity(thirdToFive);
            }
        });
    }

    private void setInitialData() {
        userListItems.add( new UserListItem(R.drawable.img_2, R.drawable.img_3, "пчёлка"));
        userListItems.add( new UserListItem(R.drawable.img_2, R.drawable.img_4, "пчёлка"));
    }

}