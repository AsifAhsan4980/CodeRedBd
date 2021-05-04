package com.example.codered2020;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;


public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextMobile);
        findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString().trim();

                if(number.isEmpty()){
                    editText.setError("Number id Required");
                    editText.requestFocus();
                    return;
                }
                String phoneNumber = "+88" + number;
                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                intent.putExtra("phonenumber",phoneNumber);
                startActivity(intent);
            }
        });


    }
}
