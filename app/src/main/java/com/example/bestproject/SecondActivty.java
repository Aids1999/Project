package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivty extends AppCompatActivity {

    List<UserListItem> userListItems = new ArrayList<UserListItem>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_item);

        ImageButton imageButton = findViewById(R.id.account);
        {
            View.OnClickListener goToComment = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(SecondActivty.this, Screen3Activity.class);
                    startActivity(intent);
                }
            };
            imageButton.setOnClickListener(goToComment);
        }

        UserListItemAdapter.OnStateClickListener stateClickListener = new UserListItemAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(UserListItem userListItem, int position) {
                ImageButton imageButton = findViewById(R.id.order);//название id не менять, при измене вылетает приложение
                View.OnClickListener goToAccount = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SecondActivty.this, Screen4Activity.class);
                        startActivity(intent);
                    }
                };
                imageButton.setOnClickListener(goToAccount);
            }
        };

        UserListItemAdapter adapter = new UserListItemAdapter(this, userListItems, stateClickListener);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        userListItems.add( new UserListItem(R.drawable.img_2, R.drawable.img_3, "пчёлка"));
        userListItems.add( new UserListItem(R.drawable.img_2, R.drawable.img_4, "пчёлка"));
    }
}