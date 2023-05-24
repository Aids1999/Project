package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class Screen4Activity extends AppCompatActivity {

    List<UserListItem> userListItems = new ArrayList<UserListItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen4);

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
    }

    private void setInitialData() {
        userListItems.add( new UserListItem(R.drawable.img_2, R.drawable.img_3, "пчёлка"));
        userListItems.add( new UserListItem(R.drawable.img_2, R.drawable.img_4, "пчёлка"));
    }
}