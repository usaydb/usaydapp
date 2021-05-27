package com.example.usaydsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;


    TextView textViewA;
    TextView textViewB;
    TextView textViewC;
    TextView textViewD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = (Button) findViewById(R.id. button1);
        buttonB = (Button) findViewById(R.id. button2);
        buttonC = (Button) findViewById(R.id. button3);
        buttonD = (Button) findViewById(R.id. button4);

        textViewA = (TextView) findViewById(R.id. textView1);
        textViewB = (TextView) findViewById(R.id. textView2);
        textViewC = (TextView) findViewById(R.id. textView3);
        textViewD = (TextView) findViewById(R.id. textView4);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1) {

            textViewA.setText("STATS -");



        }
        if(v.getId() == R.id.button2) {
            textViewA.setText("INFORMATION ");


        }
        if(v.getId() == R.id.button3) {
            textViewA.setText("HONOURS");


        }
        if(v.getId() == R.id.button4) {
            textViewA.setText("KYLIAN MBAPPE- Golden Boy");



        }
    }
}
