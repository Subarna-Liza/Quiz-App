package com.example.assesment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup MyRadioGroup;
    RadioButton MyRadioButton;
    int marks=0;

    public static String ExtraData="Iam come from 1st Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyRadioGroup=findViewById(R.id.RadioGroupID);

    }

    public void NextActivityFunction(View view) {
        int SelectedRadioButtonId =MyRadioGroup.getCheckedRadioButtonId();
        MyRadioButton = findViewById(SelectedRadioButtonId);
        if (MyRadioButton.getText().toString().equals("Coxs Bazar")){
            marks=5;
        }

        Intent MyIntent=new Intent(MainActivity.this,MainActivity2.class);
        MyIntent.putExtra(ExtraData,marks);
        startActivity(MyIntent);

    }
}
