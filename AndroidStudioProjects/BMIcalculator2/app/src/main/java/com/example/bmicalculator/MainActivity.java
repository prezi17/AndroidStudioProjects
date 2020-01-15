package com.example.bmicalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        EditText weightView = (EditText) findViewById(R.id.weightbox);
        String weight = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightbox);
        String height = weightView.getText().toString();

        BMIModel myModel = new BMIModel(weight, height);
        String myBMI = myModel.getBMI();
        ((TextView) findViewById(R.id.answer)).setText(myBMI);
    }
}
