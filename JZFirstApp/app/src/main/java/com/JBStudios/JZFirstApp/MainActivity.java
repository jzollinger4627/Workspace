package com.JBStudios.JZFirstApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = (TextView) findViewById(R.id.resultTextView); //Broke invalid ID
                result.setText((getNumberOne() + getNumberTwo()) + "");
            }
        });
        Button subtractButton = (Button) findViewById(R.id.subtactButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((getNumberOne() - getNumberTwo()) + "");
            }
        });
        Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((getNumberOne() * getNumberTwo()) + "");
            }
        });
        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((getNumberOne() / getNumberTwo()) + "");
            }
        });
        Button powerButton = (Button) findViewById(R.id.power);
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = (TextView) findViewById(R.id.resultTextView); //Broke invalid ID
                result.setText((Math.pow(getNumberOne(),getNumberTwo())) + "");
            }
        });
        Button rootButton = (Button) findViewById(R.id.root);
        rootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = (TextView) findViewById(R.id.resultTextView); //Broke invalid ID
                result.setText((Math.sqrt(getNumberOne())) + "");
            }
        });
    }

    private double getNumberOne() {
        EditText num1 = (EditText) findViewById(R.id.firstNum);
        return Double.parseDouble(num1.getText().toString());
    }
    private double getNumberTwo() {
        EditText num2 = (EditText) findViewById(R.id.secondNum);
        return Double.parseDouble(num2.getText().toString());
    }
}
