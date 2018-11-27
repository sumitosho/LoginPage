package com.example.apple.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    RadioGroup genderRadioGroup;
    EditText name;
    EditText age;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViewsId();

        button.setOnClickListener(this);
    }
    private void findAllViewsId() {
        button = (Button) findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        genderRadioGroup = (RadioGroup) findViewById(R.id.gender);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        //Create a bundle object
        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle
        b.putString("name", name.getText().toString());
        b.putString("age", age.getText().toString());
        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        b.putString("gender", radioButton.getText().toString());

        //Add the bundle to the intent.
        intent.putExtras(b);

        //start the DisplayActivity
        startActivity(intent);
    }
}
