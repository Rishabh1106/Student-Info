package com.example.myapplicationr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText IdNumber;
    Button btnSubmit;
    TextView tvResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdNumber = findViewById(R.id.IdNumber);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResults = findViewById(R.id.tvResults);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idno = IdNumber.getText().toString().trim();

                int branchCheck =  Integer.parseInt( Character.toString( idno.charAt(4)));

                String branch;

                if(branchCheck == 0){
                    branch = "Computer Science";
                }
                else {
                    branch = "Electronics and Communications";
                }

                String year = idno.substring(0,2);

                String roll = idno.substring(6,8);

                tvResults.setText("Year = 20"+year+"\n" +
                                    "Branch = "+branch+"\n" +"Roll No = "+roll+"\n");


;            }
        });


    }
}
