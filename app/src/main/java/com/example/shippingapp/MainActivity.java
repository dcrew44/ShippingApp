package com.example.shippingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextView baseCostView;
    private TextView addedCostView;
    private TextView totalCostView;
    private TextInputEditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseCostView = (TextView) findViewById(R.id.baseCostView);
        addedCostView = (TextView) findViewById(R.id.addedCostView);
        totalCostView = (TextView) findViewById(R.id.totalCostView);
        inputEditText = (TextInputEditText) findViewById(R.id.textInputEditText);

        inputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                return false;
            }
        });
    }
}