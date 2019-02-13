package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBAFourTwo extends AppCompatActivity {

    public static String strMarkBBA42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbafour_two);
    }

    public void BBA42(View v) {
        try {

            EditText BBA42zero = (EditText) findViewById(R.id.BBA42IDread);

            EditText BBA42ses = (EditText) findViewById(R.id.BBA42Session);
            String BBA42SES = BBA42ses.getText().toString();


            EditText BBA42one = (EditText) findViewById(R.id.BBA411read);
            EditText BBA42two = (EditText) findViewById(R.id.BBA413read);
            EditText BBA42three = (EditText) findViewById(R.id.BBA415read);
            EditText BBA42four = (EditText) findViewById(R.id.BBA417read);
            EditText BBA42five = (EditText) findViewById(R.id.BBA419read);

            double dv = 0, BBA42ONE = 0, BBA42TWO = 0, BBA42THREE = 0, BBA42FOUR = 0,
                    BBA42FIVE = 0;

            if (BBA42one.getText().toString().equals("")) {

            } else {
                BBA42ONE = Double.parseDouble(BBA42one.getText().toString());
                dv = dv + 4;
            }

            if (BBA42two.getText().toString().equals("")) {

            } else {
                BBA42TWO = Double.parseDouble(BBA42two.getText().toString());
                dv = dv + 3;
            }

            if (BBA42three.getText().toString().equals("")) {

            } else {
                BBA42THREE = Double.parseDouble(BBA42three.getText().toString());
                dv = dv + 3;
            }

            if (BBA42four.getText().toString().equals("")) {

            } else {
                BBA42FOUR = Double.parseDouble(BBA42four.getText().toString());
                dv = dv + 3;
            }

            if (BBA42five.getText().toString().equals("")) {

            } else {
                BBA42FIVE = Double.parseDouble(BBA42five.getText().toString());
                dv = dv + 3;
            }


            double res = gradeCheck(BBA42ONE) * 3.0 + gradeCheck(BBA42TWO) * 3.0 +
                    gradeCheck(BBA42THREE) * 3.0 + gradeCheck(BBA42FOUR) * 3.0 +
                    gradeCheck(BBA42FIVE) * 4.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = BBA42zero.getText().toString();

            String pass = "ID : " + passID + "\nDept:BBA\nSemester Two Year Four\nSession : " +
                    BBA42SES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(BBAFourTwo.this, GpaBBA42.class);
            intent.putExtra(strMarkBBA42, pass);
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
