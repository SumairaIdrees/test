package com.crafter.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

public class UserSignUp extends AppCompatActivity {

    Switch OnOffButton;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
        Switch OnOffButton = (Switch) findViewById(R.id.OnOffButton);


    }
}
