package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiThreeOne extends AppCompatActivity {

    public static String strMarkArch31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_three_one);
    }

    public void archi31(View v) {
        try {

            EditText arc31zero = (EditText) findViewById(R.id.arc31IDread);

            EditText arc31ses = (EditText) findViewById(R.id.arc31Session);
            String ARC31SES=arc31ses.getText().toString();


            EditText arc31one = (EditText) findViewById(R.id.arc3125read);
            EditText arc31two = (EditText) findViewById(R.id.arc3157read);
            EditText arc31three = (EditText) findViewById(R.id.arc3101read);
            EditText arc31four = (EditText) findViewById(R.id.arc3129read);
            EditText arc31five = (EditText) findViewById(R.id.arc3103read);
            EditText arc31six = (EditText) findViewById(R.id.arc3158read);
            EditText arc31seven = (EditText) findViewById(R.id.arc3104read);
            EditText arc31eight = (EditText) findViewById(R.id.arc3126read);

            double dv = 0 ,ARC31ONE = 0 , ARC31TWO = 0 , ARC31THREE = 0 , ARC31FOUR = 0,
                    ARC31FIVE = 0 , ARC31SIX = 0 , ARC31SEVEN = 0 , ARC31EIGHT = 0;

            if(arc31one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31ONE = Double.parseDouble(arc31one.getText().toString());
                dv = dv + 2;
            }

            if(arc31two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31TWO = Double.parseDouble(arc31two.getText().toString());
                dv = dv + 2;
            }

            if(arc31three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31THREE = Double.parseDouble(arc31three.getText().toString());
                dv = dv + 2;
            }

            if(arc31four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31FOUR = Double.parseDouble(arc31four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc31five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31FIVE = Double.parseDouble(arc31five.getText().toString());
                dv = dv + 2 ;
            }

            if(arc31six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31SIX = Double.parseDouble(arc31six.getText().toString());
                dv = dv + 1.5 ;
            }

            if(arc31seven.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31SEVEN = Double.parseDouble(arc31seven.getText().toString());
                dv = dv + 7.5;
            }

            if(arc31eight.getText().toString().equals(""))
            {

            }
            else
            {
                ARC31EIGHT = Double.parseDouble(arc31eight.getText().toString());
                dv = dv + 1.5;
            }


            double res = gradeCheck(ARC31ONE) * 2.0    + gradeCheck(ARC31TWO) * 2.0 +
                    gradeCheck(ARC31THREE) * 2.0  + gradeCheck(ARC31FOUR) * 2.0 +
                    gradeCheck(ARC31FIVE) * 2.0   + gradeCheck(ARC31SIX) * 1.5 +
                    gradeCheck(ARC31SEVEN) * 7.5  + gradeCheck(ARC31EIGHT) * 1.5;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc31zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester One Year Three\nSession : "+
                    ARC31SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiThreeOne.this, GpaArch31.class);
            intent.putExtra(strMarkArch31, pass);
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
