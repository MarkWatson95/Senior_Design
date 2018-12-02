package com.example.mark.senior_design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignInUpPage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinup);
        final Button signInButton = findViewById(R.id.signin);
        signInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SignInUpPage.this, SignIn.class));
            }
        });
        final Button signUpButton = findViewById(R.id.signup);
        signInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SignInUpPage.this, SignUp.class));
            }
        });

        final Button debugButton = findViewById(R.id.debugButton);
        debugButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(SignInUpPage.this, MainActivity.class));
            }

        });
    }
}

