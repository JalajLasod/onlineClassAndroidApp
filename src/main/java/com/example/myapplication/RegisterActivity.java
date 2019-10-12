package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button signin;
    private EditText email;
    private EditText password;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        setupUIViews();

        signin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(email.getText().equals("jalajlaosd26@gmail.com") && password.getText().equals("123hj456"))
                {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);

                }
            }
        });
    }

    private void setupUIViews() {
        signin = (Button) findViewById(R.id.btn1);
        email = (EditText) findViewById(R.id.editText);
        username = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText3);
    }
}
