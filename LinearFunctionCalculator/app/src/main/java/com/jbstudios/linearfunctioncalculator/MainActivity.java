package com.jbstudios.linearfunctioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculate = (Button) findViewById(R.id.Calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
    }

    private void calc() {
        double m = (Double.parseDouble(((EditText) findViewById(R.id.Y2)).getText().toString())-Double.parseDouble(((EditText) findViewById(R.id.Y1)).getText().toString()))/
                (Double.parseDouble(((EditText) findViewById(R.id.X2)).getText().toString())-Double.parseDouble(((EditText) findViewById(R.id.X1)).getText().toString()));
        double b = Double.parseDouble(((EditText) findViewById(R.id.Y1)).getText().toString())-(Math.abs(Double.parseDouble(((EditText) findViewById(R.id.X1)).getText().toString()))*m);
        ((TextView) findViewById(R.id.MResult)).setText(m + "");
        ((TextView) findViewById(R.id.BResult)).setText(b + "");
    }
}
