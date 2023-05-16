package com.example.bestproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayAccounts arrayAccounts = new ArrayAccounts();

    private String nickname;
    private String phoneNum;
    private String password;

    EditText textNickname;
    EditText textPhoneNum;
    EditText textPassword;

    ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNickname = findViewById(R.id.nickname); //Привязка считывателей к оболочкам
        textPhoneNum = findViewById(R.id.phoneNum);
        textPassword = findViewById(R.id.password);

        startButton = (ImageButton) findViewById(R.id.start); //Привязка функционала кнопки и оболочки

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nickname = textNickname.getText().toString();
                phoneNum = textPhoneNum.getText().toString();
                password = textPassword.getText().toString();


                User newUser = new User(nickname, phoneNum, password);
                if ((Arrays.asList(arrayAccounts.nickArray).contains(nickname)) & (Arrays.asList(arrayAccounts.passwordArray).contains(password)) & (Arrays.asList(arrayAccounts.phoneNumArray).contains(phoneNum))) {
                    Intent intent = new Intent(getApplicationContext(), SecondActivty.class);
                    intent.putExtra("Nick", newUser);
                    startActivity(intent);}
            }
        });
    }
}