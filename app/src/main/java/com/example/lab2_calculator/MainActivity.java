package com.example.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.numberOne);
        Integer firstNumber = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.numberTwo);
        Integer secondNumber = Integer.parseInt(myTextField2.getText().toString());
        Integer sum = firstNumber + secondNumber;
        goToActivity2(sum.toString());
    }

    public void subtractFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.numberOne);
        Integer firstNumber = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.numberTwo);
        Integer secondNumber = Integer.parseInt(myTextField2.getText().toString());
        Integer difference = firstNumber - secondNumber;
        goToActivity2(difference.toString());
    }

    public void multiplyFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.numberOne);
        Integer firstNumber = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.numberTwo);
        Integer secondNumber = Integer.parseInt(myTextField2.getText().toString());
        Integer product = firstNumber * secondNumber;
        goToActivity2(product.toString());
    }

    public void divideFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.numberOne);
        Integer firstNumber = Integer.parseInt(myTextField1.getText().toString());
        EditText myTextField2 = (EditText) findViewById(R.id.numberTwo);
        Integer secondNumber = Integer.parseInt(myTextField2.getText().toString());
        Integer quotient = firstNumber / secondNumber;
        goToActivity2(quotient.toString());
    }

    public void goToActivity2(String s1) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s1);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}