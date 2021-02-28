package com.example.assesment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView ThirdTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ThirdTextView=findViewById(R.id.ThirdTextViewID);
        Intent OutPutIntent=getIntent();
        int i=0;
        int Outmarks=OutPutIntent.getIntExtra(MainActivity2.ExtraData2,i);
        if (Outmarks==5){
            ThirdTextView.setText("Number of Correct answer: 01 You Marks is : "+Outmarks);

        }else if (Outmarks==10){
            ThirdTextView.setText("Number of Correct answer: 02 and You Marks is : "+Outmarks);
        }else{
            ThirdTextView.setText("Number of Correct answer: 00 You Marks is : "+Outmarks);
        }
    }

    public void TryAgainFunction(View view) {
        Intent MyTryIntent=new Intent(MainActivity3.this,MainActivity.class);
        startActivity(MyTryIntent);
    }
}
