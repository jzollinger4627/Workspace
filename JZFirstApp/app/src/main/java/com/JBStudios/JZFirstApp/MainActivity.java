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
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString())) + "");
            }
        });
        Button subtractButton = (Button) findViewById(R.id.subtactButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString())) + "");
            }
        });
        Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString())) + "");
            }
        });
        Button divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = (EditText) findViewById(R.id.firstNum);
                EditText num2 = (EditText) findViewById(R.id.secondNum);
                TextView result = (TextView) findViewById(R.id.resultTextView);
                result.setText((Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString())) + "");
            }
        });
    }
}
