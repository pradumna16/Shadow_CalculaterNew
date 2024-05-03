package com.thestart.shadow_calculater;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator_Co extends AppCompatActivity implements View.OnClickListener {

    Button btnadd, btnsub, btnmul, btndiv, btnclr;
    TextView textViewresult;
    EditText input1, input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator_co);

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnclr = findViewById(R.id.btnclr);
        textViewresult = findViewById(R.id.textViewresult);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        // Set click listeners for all buttons using the same interface
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnclr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (input1.getText().length() > 0 && input2.getText().length() > 0) {
            double num1 = Double.parseDouble(input1.getText().toString());
            double num2 = Double.parseDouble(input2.getText().toString());

            double result = 0.0;
            if (v.getId() == R.id.btnadd) {
                result = num1 + num2;
            } else if (v.getId() == R.id.btnsub) {
                result = num1 - num2;
            } else if (v.getId() == R.id.btnmul) {
                result = num1 * num2;
            } else if (v.getId() == R.id.btndiv) {
                result = num1 / num2;
            }

            textViewresult.setText(Double.toString(result));
        } else {
            Toast.makeText(this, "Input Field cannot be empty", Toast.LENGTH_SHORT).show();
        }
    }
}
