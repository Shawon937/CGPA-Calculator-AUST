package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CSETwoOne extends AppCompatActivity {

    public static String strMarkCSE21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csetwo_one);
    }

    public void CSE21(View v) {
        try {

            EditText CSEzero = (EditText) findViewById(R.id.CSE21IDread);

            EditText CSEses = (EditText) findViewById(R.id.CSE21Session);
            String CSESES = CSEses.getText().toString();


            EditText CSEone = (EditText) findViewById(R.id.CSEHum2109read);
            EditText CSEtwo = (EditText) findViewById(R.id.CSEMath2101read);
            EditText CSEthree = (EditText) findViewById(R.id.CSEEee2141read);
            EditText CSEfour = (EditText) findViewById(R.id.CSEEee2142read);
            EditText CSEfive = (EditText) findViewById(R.id.CSE2100read);
            EditText CSEsix = (EditText) findViewById(R.id.CSE2103read);
            EditText CSEseven = (EditText) findViewById(R.id.CSE2104read);
            EditText CSEeight = (EditText) findViewById(R.id.CSE2105read);
            EditText CSEnine = (EditText) findViewById(R.id.CSE2106read);


            double dv = 0, CSEONE = 0, CSETWO = 0, CSETHREE = 0, CSEFOUR = 0,
                    CSEFIVE = 0, CSESIX = 0, CSESEVEN = 0, CSEEIGHT = 0, CSENINE = 0;

            if (CSEone.getText().toString().equals("")) {

            } else {
                CSEONE = Double.parseDouble(CSEone.getText().toString());
                dv = dv + 3;
            }

            if (CSEtwo.getText().toString().equals("")) {

            } else {
                CSETWO = Double.parseDouble(CSEtwo.getText().toString());
                dv = dv + 3;
            }

            if (CSEthree.getText().toString().equals("")) {

            } else {
                CSETHREE = Double.parseDouble(CSEthree.getText().toString());
                dv = dv + 3;
            }

            if (CSEfour.getText().toString().equals("")) {

            } else {
                CSEFOUR = Double.parseDouble(CSEfour.getText().toString());
                dv = dv + 1.5;
            }

            if (CSEfive.getText().toString().equals("")) {

            } else {
                CSEFIVE = Double.parseDouble(CSEfive.getText().toString());
                dv = dv + 0.75;
            }

            if (CSEsix.getText().toString().equals("")) {

            } else {
                CSESIX = Double.parseDouble(CSEsix.getText().toString());
                dv = dv + 3;
            }

            if (CSEseven.getText().toString().equals("")) {

            } else {
                CSESEVEN = Double.parseDouble(CSEseven.getText().toString());
                dv = dv + 1.5;
            }

            if (CSEeight.getText().toString().equals("")) {

            } else {
                CSEEIGHT = Double.parseDouble(CSEeight.getText().toString());
                dv = dv + 3;
            }

            if (CSEnine.getText().toString().equals("")) {

            } else {
                CSENINE = Double.parseDouble(CSEnine.getText().toString());
                dv = dv + 1.5;
            }


            double res = gradeCheck(CSEONE) * 3.0 + gradeCheck(CSETWO) * 3 +
                    gradeCheck(CSETHREE) * 3.0 + gradeCheck(CSEFOUR) * 1.5 +
                    gradeCheck(CSEFIVE) * 0.75 + gradeCheck(CSESIX) * 3 +
                    gradeCheck(CSESEVEN) * 1.5 + gradeCheck(CSEEIGHT) * 3 +
                    gradeCheck(CSENINE) * 1.5;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = CSEzero.getText().toString();

            String pass = "ID : " + passID + "\nDept:Computer Science & Engineering\nSemester: 1st\nYear: 2nd\nSession : " +
                    CSESES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(CSETwoOne.this, GpaCSE21.class);
            intent.putExtra(strMarkCSE21, pass);
            startActivity(intent);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    public double gradeCheck(double x) {

        double res = 0;

        try {


            if (x >= 80 && x <= 100)
                res = 4.0;
            else if (x >= 75 && x < 80)
                res = 3.75;
            else if (x >= 70 && x < 75)
                res = 3.5;
            else if (x >= 65 && x < 70)
                res = 3.25;
            else if (x >= 60 && x < 65)
                res = 3.0;
            else if (x >= 55 && x < 60)
                res = 2.75;
            else if (x >= 50 && x < 55)
                res = 2.50;
            else if (x >= 45 && x < 50)
                res = 2.25;
            else if (x >= 40 && x < 45)
                res = 2.0;
            else if (x >= 0 && x < 40)
                res = 0;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
