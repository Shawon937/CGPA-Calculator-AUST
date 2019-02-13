package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBATwoTwo extends AppCompatActivity {

    public static String strMarkBBA22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbatwo_two);
    }

    public void BBA22(View v) {
        try {

            EditText BBA22zero = (EditText) findViewById(R.id.BBA22IDread);

            EditText BBA22ses = (EditText) findViewById(R.id.BBA22Session);
            String BBA22SES = BBA22ses.getText().toString();


            EditText BBA22one = (EditText) findViewById(R.id.BBA211read);
            EditText BBA22two = (EditText) findViewById(R.id.BBA213read);
            EditText BBA22three = (EditText) findViewById(R.id.BBA215read);
            EditText BBA22four = (EditText) findViewById(R.id.BBA217read);
            EditText BBA22five = (EditText) findViewById(R.id.BBA219read);

            double dv = 0, BBA22ONE = 0, BBA22TWO = 0, BBA22THREE = 0, BBA22FOUR = 0,
                    BBA22FIVE = 0;

            if (BBA22one.getText().toString().equals("")) {

            } else {
                BBA22ONE = Double.parseDouble(BBA22one.getText().toString());
                dv = dv + 3;
            }

            if (BBA22two.getText().toString().equals("")) {

            } else {
                BBA22TWO = Double.parseDouble(BBA22two.getText().toString());
                dv = dv + 3;
            }

            if (BBA22three.getText().toString().equals("")) {

            } else {
                BBA22THREE = Double.parseDouble(BBA22three.getText().toString());
                dv = dv + 3;
            }

            if (BBA22four.getText().toString().equals("")) {

            } else {
                BBA22FOUR = Double.parseDouble(BBA22four.getText().toString());
                dv = dv + 4;
            }

            if (BBA22five.getText().toString().equals("")) {

            } else {
                BBA22FIVE = Double.parseDouble(BBA22five.getText().toString());
                dv = dv + 3;
            }


            double res = gradeCheck(BBA22ONE) * 3.0 + gradeCheck(BBA22TWO) * 3.0 +
                    gradeCheck(BBA22THREE) * 3.0 + gradeCheck(BBA22FOUR) * 4.0 +
                    gradeCheck(BBA22FIVE) * 3.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID = BBA22zero.getText().toString();

            String pass = "ID : " + passID + "\nDept:BBA\nSemester Two Year Two\nSession : " +
                    BBA22SES + "\nGPA : " + passMark + "\n";


            Intent intent = new Intent(BBATwoTwo.this, GpaBBA22.class);
            intent.putExtra(strMarkBBA22, pass);
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
