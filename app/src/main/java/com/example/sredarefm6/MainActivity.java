package com.example.sredarefm6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int val, sum = 0;
    double average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.button);

    }

    public void addNum(View view) {
        EditText value = (EditText) findViewById(R.id.textView);
        String value2= value.getText().toString();
        val=Integer.parseInt(value2);

        TextView num = (TextView) findViewById(R.id.textView4);
        TextView averageNumbers = (TextView) findViewById(R.id.textView5);

        //добавление
        numbers.add(val);

        //вывод всех чисел
        String num1 = "";
        for (int i = 0; i < numbers.size(); i++) {
            num1 = num1 + numbers.get(i) + ", ";
        }
        num.setText("" + num1);

        //среднее арифметическое
        sum = sum + val;
        average = sum / numbers.size();
        averageNumbers.setText("" + average);
    }
}