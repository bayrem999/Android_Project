package com.example.vote.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.vote.R;
import com.example.vote.data.AppDatabase;
import com.example.vote.data.models.User;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private AppDatabase db;
    private ExecutorService executorService;
    private EditText editTextCin, editTextPhoneNumber, editTextAuthCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        db = AppDatabase.getInstance(getApplicationContext());
        executorService = Executors.newSingleThreadExecutor();

      /*  editTextCin = findViewById(R.id.editTextCin);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextAuthCode = findViewById(R.id.editTextAuthCode);

        Button registerButton = findViewById(R.id.buttonRegister);*//*
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve values from EditText fields
                String cin = editTextCin.getText().toString();
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String authCode = editTextAuthCode.getText().toString();

                // Example: Adding a user to the database using Executors
                executorService.execute(() -> {
                    User newUser = new User();
                    newUser.setCin(cin);
                    newUser.setPhoneNumber(phoneNumber);
                    newUser.setAuthCode(authCode);

                    // You can set other properties of the user as needed

                    // Insert the user into the database
                    db.userDao().insertUser(newUser);
                });
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executorService.shutdown();
    }*/
}}
