import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup MyRadioGroup2;
    RadioButton MyRadioButton2;
   int marks=0;

    public static String ExtraData2="Iam come from 1st Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyRadioGroup2=findViewById(R.id.RadioGroupID2);

    }

    public void SubmitFunction(View view) {
        Intent FirstOutput=getIntent();
        int j =0;
        int FirstoutputMarks=FirstOutput.getIntExtra(MainActivity.ExtraData,j);

        int SelectedRadioButtonId2 = MyRadioGroup2.getCheckedRadioButtonId();
        MyRadioButton2 = findViewById(SelectedRadioButtonId2);
        if (MyRadioButton2.getText().toString().equals("Google")) {
            marks = FirstoutputMarks+5;
        }
        Intent MyIntent2=new Intent(MainActivity2.this,MainActivity3.class);
        MyIntent2.putExtra(ExtraData2,marks);
        startActivity(MyIntent2);
        }
    }
