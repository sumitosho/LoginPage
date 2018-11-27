package com.example.apple.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameValue);
        TextView age = (TextView) findViewById(R.id.ageValue);
        TextView gender = (TextView) findViewById(R.id.genderValue);

        name.setText(b.getCharSequence("name"));
        age.setText(b.getCharSequence("age"));
        gender.setText(b.getCharSequence("gender"));
    }

}
