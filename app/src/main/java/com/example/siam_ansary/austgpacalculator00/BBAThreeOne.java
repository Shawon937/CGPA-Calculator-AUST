package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBAThreeOne extends AppCompatActivity {

    public static String strMarkBBA31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbathree_one);
    }

    public void BBA31(View v) {
        try {

            EditText BBA31zero = (EditText) findViewById(R.id.BBA31IDread);

            EditText BBA31ses = (EditText) findViewById(R.id.BBA31Session);
            String BBA31SES = BBA31ses.getText().toString();


            EditText BBA31one = (EditText) findViewById(R.id.BBA301read);
            EditText BBA31two = (EditText) findViewById(R.id.BBA303read);
            EditText BBA31three = (EditText) findViewById(R.id.BBA305read);
            EditText BBA31four = (EditText) findViewById(R.id.BBA307read);
            EditText BBA31five = (EditText) findViewById(R.id.BBA309read);

            double dv = 0, BBA31ONE = 0, BBA31TWO = 0, BBA31THREE = 0, BBA31FOUR = 0,
                    BBA31FIVE = 0;

            if (BBA31one.getText().toString().equals("")) {

            } else {
                BBA31ONE = Double.parseDouble(BBA31one.getText().toString());
                dv = dv + 3;
            }

            if (BBA31two.getText().toString().equals("")) {

            } else {
                BBA31TWO = Double.parseDouble(BBA31two.getText().toString());
                dv = dv + 3;
            }

            if (BBA31three.getText().toString().equals("")) {

            } else {
                BBA31THREE = Double.parseDouble(BBA31three.getText().toString());
                dv = dv + 3;
            }

            if (BBA31four.getText().toString().equals("")) {

            } else {
                BBA31FOUR = Double.parseDouble(BBA31four.getText().toString());
                dv = dv + 4;
            }

            if (BBA31five.getText().toString().equals("")) {

            } else {
                BBA31FIVE = Double.parseDouble(BBA31five.getText().toString());
                dv = dv + 3;
            }


            double res = gradeCheck(BBA31ONE) * 3.0 + gradeCheck(BBA31TWO) * 3.0 +
                    gradeCheck(BBA31THREE) * 3.0 + gradeCheck(BBA31FOUR) * 4.0 +
                    gradeCheck(BBA31FIVE) * 3.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = BBA31zero.getText().toString();

            String pass = "ID : " + passID + "\nDept:BBA\nSemester One Year Three\nSession : " +
                    BBA31SES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(BBAThreeOne.this, GpaBBA31.class);
            intent.putExtra(strMarkBBA31, pass);
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
