package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiTwoOne extends AppCompatActivity {

    public static String strMarkArch21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_two_one);
    }

    public void archi21(View v) {
        try {

            EditText arc21zero = (EditText) findViewById(R.id.arc21IDread);

            EditText arc21ses = (EditText) findViewById(R.id.arc21Session);
            String ARC21SES=arc21ses.getText().toString();


            EditText arc21one = (EditText) findViewById(R.id.arc2129read);
            EditText arc21two = (EditText) findViewById(R.id.arc2141read);
            EditText arc21three = (EditText) findViewById(R.id.arc2125read);
            EditText arc21four = (EditText) findViewById(R.id.arc2101read);
            EditText arc21five = (EditText) findViewById(R.id.arc2123read);
            EditText arc21six = (EditText) findViewById(R.id.arc2102read);
            EditText arc21seven = (EditText) findViewById(R.id.arc2104read);
            EditText arc21eight = (EditText) findViewById(R.id.arc2130read);

            double dv = 0 ,ARC21ONE = 0 , ARC21TWO = 0 , ARC21THREE = 0 , ARC21FOUR = 0,
                    ARC21FIVE = 0 , ARC21SIX = 0 , ARC21SEVEN = 0 , ARC21EIGHT = 0;

            if(arc21one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21ONE = Double.parseDouble(arc21one.getText().toString());
                dv = dv + 2;
            }

            if(arc21two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21TWO = Double.parseDouble(arc21two.getText().toString());
                dv = dv + 2;
            }

            if(arc21three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21THREE = Double.parseDouble(arc21three.getText().toString());
                dv = dv + 2;
            }

            if(arc21four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21FOUR = Double.parseDouble(arc21four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc21five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21FIVE = Double.parseDouble(arc21five.getText().toString());
                dv = dv + 2 ;
            }

            if(arc21six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21SIX = Double.parseDouble(arc21six.getText().toString());
                dv = dv + 1.5 ;
            }

            if(arc21seven.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21SEVEN = Double.parseDouble(arc21seven.getText().toString());
                dv = dv + 7.5;
            }

            if(arc21eight.getText().toString().equals(""))
            {

            }
            else
            {
                ARC21EIGHT = Double.parseDouble(arc21eight.getText().toString());
                dv = dv + 1.5;
            }


            double res = gradeCheck(ARC21ONE) * 2.0    + gradeCheck(ARC21TWO) * 2.0 +
                         gradeCheck(ARC21THREE) * 2.0  + gradeCheck(ARC21FOUR) * 2.0 +
                         gradeCheck(ARC21FIVE) * 2.0   + gradeCheck(ARC21SIX) * 1.5 +
                         gradeCheck(ARC21SEVEN) * 7.5  + gradeCheck(ARC21EIGHT) * 1.5;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc21zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester One Year Two\nSession : "+
                    ARC21SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiTwoOne.this, GpaArch21.class);
            intent.putExtra(strMarkArch21, pass);
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
