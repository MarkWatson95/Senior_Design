package com.example.mark.senior_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        ImageView welcomeIcon = (ImageView)findViewById(R.id.welcome_Icon);
        welcomeIcon.setImageResource(R.mipmap.balance_mgn_logo);
        final Button button = findViewById(R.id.welcome_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(WelcomePage.this, MainActivity.class));
            }
        });
    }
}
