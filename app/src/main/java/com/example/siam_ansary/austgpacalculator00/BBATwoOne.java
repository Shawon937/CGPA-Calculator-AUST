package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBATwoOne extends AppCompatActivity {

    public static String strMarkBBA21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbatwo_one);
    }

    public void BBA21(View v) {
        try {

            EditText BBA21zero = (EditText) findViewById(R.id.BBA21IDread);

            EditText BBA21ses = (EditText) findViewById(R.id.BBA21Session);
            String BBA21SES = BBA21ses.getText().toString();


            EditText BBA21one = (EditText) findViewById(R.id.BBA201read);
            EditText BBA21two = (EditText) findViewById(R.id.BBA203read);
            EditText BBA21three = (EditText) findViewById(R.id.BBA205read);
            EditText BBA21four = (EditText) findViewById(R.id.BBA207read);
            EditText BBA21five = (EditText) findViewById(R.id.BBA209read);

            double dv = 0, BBA21ONE = 0, BBA21TWO = 0, BBA21THREE = 0, BBA21FOUR = 0,
                    BBA21FIVE = 0;

            if (BBA21one.getText().toString().equals("")) {

            } else {
                BBA21ONE = Double.parseDouble(BBA21one.getText().toString());
                dv = dv + 3;
            }

            if (BBA21two.getText().toString().equals("")) {

            } else {
                BBA21TWO = Double.parseDouble(BBA21two.getText().toString());
                dv = dv + 4;
            }

            if (BBA21three.getText().toString().equals("")) {

            } else {
                BBA21THREE = Double.parseDouble(BBA21three.getText().toString());
                dv = dv + 3;
            }

            if (BBA21four.getText().toString().equals("")) {

            } else {
                BBA21FOUR = Double.parseDouble(BBA21four.getText().toString());
                dv = dv + 3;
            }

            if (BBA21five.getText().toString().equals("")) {

            } else {
                BBA21FIVE = Double.parseDouble(BBA21five.getText().toString());
                dv = dv + 3;
            }


            double res = gradeCheck(BBA21ONE) * 3.0 + gradeCheck(BBA21TWO) * 4.0 +
                    gradeCheck(BBA21THREE) * 3.0 + gradeCheck(BBA21FOUR) * 3.0 +
                    gradeCheck(BBA21FIVE) * 3.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = BBA21zero.getText().toString();

            String pass = "ID : " + passID + "\nDept:BBA\nSemester One Year Two\nSession : " +
                    BBA21SES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(BBATwoOne.this, GpaBBA21.class);
            intent.putExtra(strMarkBBA21, pass);
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
