package com.ericknathan.libri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ericknathan.libri.database.SQLProvider;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        SQLProvider.getInstance(this);


    }
}