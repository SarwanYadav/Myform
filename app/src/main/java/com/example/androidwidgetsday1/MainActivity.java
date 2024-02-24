package com.example.androidwidgetsday1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edName, ed_password, ed_number;

    RadioButton male, Female;

    CheckBox cbAndroid, cdJava, cdC, cbKotlin;

    Spinner sp_cities;
    AppCompatButton clickme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName =(EditText) findViewById(R.id.edName);
        ed_password =(EditText) findViewById(R.id.ed_password);
        ed_number =(EditText) findViewById(R.id.ed_number);
        male =(RadioButton) findViewById(R.id.male);
        Female = (RadioButton)findViewById(R.id.Female);
        cbAndroid =(CheckBox) findViewById(R.id.cbAndroid);
        cdJava =(CheckBox) findViewById(R.id.cdJava);
        cdC = (CheckBox)findViewById(R.id.cdC);
        cbKotlin = (CheckBox)findViewById(R.id.cbKotlin);
        sp_cities = (Spinner)findViewById(R.id.sp_cities);
        clickme =(AppCompatButton) findViewById(R.id.clickme);


    }


    public void getAllValues(View view) {

        // ----------------getvalue from editvaule from edit

        String name = edName.getText().toString();
        String password = ed_password.getText().toString();
        String number=ed_number.getText().toString();


        // get vaule from radio button--------------------------

        String gender ="";
        if (male.isChecked()) {
            gender = male.getText().toString();

        }

        if (Female.isChecked()) {
            gender = Female.getText().toString();

        }
// ----------------------------------------------------------------

        String interst ="";
        if (cbAndroid.isChecked()) {
            interst += cbAndroid.getText().toString() + "\n";
        }

        if (cdJava.isChecked()) {
            interst += cdJava.getText().toString() + "\n";
        }

        if (cbKotlin.isChecked()) {
            interst += cbKotlin.getText().toString() + "\n";

        }


        // find city name

        String city = sp_cities.getSelectedItem().toString();


        // print  all data

        String res = "\n" + name + "\n" + password + "\n" + gender + "\n" + interst + "\n" + city;
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();


    }
}