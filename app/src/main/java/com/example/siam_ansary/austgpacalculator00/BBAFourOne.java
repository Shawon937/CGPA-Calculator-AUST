package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBAFourOne extends AppCompatActivity {

    public static String strMarkBBA41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbafour_one);
    }

    public void BBA41(View v) {
        try {

            EditText BBA41zero = (EditText) findViewById(R.id.BBA41IDread);

            EditText BBA41ses = (EditText) findViewById(R.id.BBA41Session);
            String BBA41SES = BBA41ses.getText().toString();


            EditText BBA41one = (EditText) findViewById(R.id.BBA401read);
            EditText BBA41two = (EditText) findViewById(R.id.BBA403read);
            EditText BBA41three = (EditText) findViewById(R.id.BBA405read);
            EditText BBA41four = (EditText) findViewById(R.id.BBA407read);
            EditText BBA41five = (EditText) findViewById(R.id.BBA409read);

            double dv = 0, BBA41ONE = 0, BBA41TWO = 0, BBA41THREE = 0, BBA41FOUR = 0,
                    BBA41FIVE = 0;

            if (BBA41one.getText().toString().equals("")) {

            } else {
                BBA41ONE = Double.parseDouble(BBA41one.getText().toString());
                dv = dv + 4;
            }

            if (BBA41two.getText().toString().equals("")) {

            } else {
                BBA41TWO = Double.parseDouble(BBA41two.getText().toString());
                dv = dv + 3;
            }

            if (BBA41three.getText().toString().equals("")) {

            } else {
                BBA41THREE = Double.parseDouble(BBA41three.getText().toString());
                dv = dv + 3;
            }

            if (BBA41four.getText().toString().equals("")) {

            } else {
                BBA41FOUR = Double.parseDouble(BBA41four.getText().toString());
                dv = dv + 3;
            }

            if (BBA41five.getText().toString().equals("")) {

            } else {
                BBA41FIVE = Double.parseDouble(BBA41five.getText().toString());
                dv = dv + 3;
            }


            double res = gradeCheck(BBA41ONE) * 4.0 + gradeCheck(BBA41TWO) * 3.0 +
                    gradeCheck(BBA41THREE) * 3.0 + gradeCheck(BBA41FOUR) * 3.0 +
                    gradeCheck(BBA41FIVE) * 3.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = BBA41zero.getText().toString();

            String pass = "ID : " + passID + "\nDept:BBA\nSemester One Year Four\nSession : " +
                    BBA41SES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(BBAFourOne.this, GpaBBA41.class);
            intent.putExtra(strMarkBBA41, pass);
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
