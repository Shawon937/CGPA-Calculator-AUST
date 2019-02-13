package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBAThreeTwo extends AppCompatActivity {

    public static String strMarkBBA32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbathree_two);
    }

    public void BBA32(View v) {
        try {

            EditText BBA32zero = (EditText) findViewById(R.id.BBA32IDread);

            EditText BBA32ses = (EditText) findViewById(R.id.BBA32Session);
            String BBA32SES = BBA32ses.getText().toString();


            EditText BBA32one = (EditText) findViewById(R.id.BBA311read);
            EditText BBA32two = (EditText) findViewById(R.id.BBA313read);
            EditText BBA32three = (EditText) findViewById(R.id.BBA315read);
            EditText BBA32four = (EditText) findViewById(R.id.BBA317read);
            EditText BBA32five = (EditText) findViewById(R.id.BBA319read);

            double dv = 0, BBA32ONE = 0, BBA32TWO = 0, BBA32THREE = 0, BBA32FOUR = 0,
                    BBA32FIVE = 0;

            if (BBA32one.getText().toString().equals("")) {

            } else {
                BBA32ONE = Double.parseDouble(BBA32one.getText().toString());
                dv = dv + 3;
            }

            if (BBA32two.getText().toString().equals("")) {

            } else {
                BBA32TWO = Double.parseDouble(BBA32two.getText().toString());
                dv = dv + 3;
            }

            if (BBA32three.getText().toString().equals("")) {

            } else {
                BBA32THREE = Double.parseDouble(BBA32three.getText().toString());
                dv = dv + 3;
            }

            if (BBA32four.getText().toString().equals("")) {

            } else {
                BBA32FOUR = Double.parseDouble(BBA32four.getText().toString());
                dv = dv + 3;
            }

            if (BBA32five.getText().toString().equals("")) {

            } else {
                BBA32FIVE = Double.parseDouble(BBA32five.getText().toString());
                dv = dv + 4;
            }


            double res = gradeCheck(BBA32ONE) * 3.0 + gradeCheck(BBA32TWO) * 3.0 +
                    gradeCheck(BBA32THREE) * 3.0 + gradeCheck(BBA32FOUR) * 3.0 +
                    gradeCheck(BBA32FIVE) * 4.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = BBA32zero.getText().toString();

            String pass = "ID : " + passID + "\nDept:BBA\nSemester Two Year Three\nSession : " +
                    BBA32SES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(BBAThreeTwo.this, GpaBBA32.class);
            intent.putExtra(strMarkBBA32, pass);
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
