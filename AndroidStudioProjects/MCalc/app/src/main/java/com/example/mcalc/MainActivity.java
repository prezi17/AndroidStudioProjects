package com.example.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import static com.example.mcalc.R.id.answer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v)
    {
        EditText pri = (EditText) findViewById(R.id.pri);
        String p = pri.getText().toString();

        EditText avalue = (EditText) findViewById(R.id.avalue);
        String a = avalue.getText().toString();

        EditText ivalue = (EditText) findViewById(R.id.ivalue);
        String i = ivalue.getText().toString();

        Mortgagemodel myModel = new Mortgagemodel(p,a,i);
        String myMortgage = myModel.computePayment();

        ((TextView)findViewById(R.id.answer)).setText(myMortgage);
    }
}
