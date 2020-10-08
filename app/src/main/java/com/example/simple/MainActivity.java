package com.example.simple;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView unitconverter,kilograms,showin,pounds;
    EditText number;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unitconverter=findViewById(R.id.textView);
        kilograms=findViewById(R.id.weight);
        showin=findViewById(R.id.showin);
        pounds=findViewById(R.id.pounds);
        number=findViewById(R.id.editTextNumber2);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclicked();

            }
        });
    }
    public  void buttonclicked(){
        String kilograms=number.getText().toString();
        double convert= Double.parseDouble(kilograms);
        double converting=convert*2.20462;
        showin.setText("" + converting);


    }
}