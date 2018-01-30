package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNumberOne;
    private EditText etNumberTwo;
    private Button btnPlus;
    private Button btnLop;
    private Button btnKun;
    private Button btnHan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        btnPlus = findViewById(R.id.btnPlus);
        btnLop = findViewById(R.id.btnLop);
        btnKun = findViewById(R.id.btnKun);
        btnHan = findViewById(R.id.btnHan);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Plus(numberOne,numberTwo);
                Toast.makeText(MainActivity.this, String.valueOf(Plus(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });
        btnLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Lop(numberOne,numberTwo);
                Toast.makeText(MainActivity.this, String.valueOf(Lop(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });
        btnKun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Kun(numberOne,numberTwo);
                Toast.makeText(MainActivity.this, String.valueOf(Kun(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });
        btnHan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                Han(numberOne,numberTwo);
                Toast.makeText(MainActivity.this, String.valueOf(Han(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int Plus(int numberOne,int numberTwo){
        return numberOne + numberTwo;
    }
    private int Lop(int numberOne,int numberTwo){
        return numberOne - numberTwo;
    }
    private int Kun(int numberOne,int numberTwo){
        return numberOne * numberTwo;
    }
    private int Han(int numberOne,int numberTwo){
        if(numberTwo == 0){
            return 0;
        }else {
            return numberOne / numberTwo;
        }

    }
}
