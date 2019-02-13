package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiTwoTwo extends AppCompatActivity {

    public static String strMarkArch22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_two_two);
    }

    public void archi22(View v) {
        try {

            EditText arc22zero = (EditText) findViewById(R.id.arc22IDread);

            EditText arc22ses = (EditText) findViewById(R.id.arc22Session);
            String ARC22SES=arc22ses.getText().toString();


            EditText arc22one = (EditText) findViewById(R.id.arc2225read);
            EditText arc22two = (EditText) findViewById(R.id.arc2229read);
            EditText arc22three = (EditText) findViewById(R.id.arc2223read);
            EditText arc22four = (EditText) findViewById(R.id.arc2201read);
            EditText arc22five = (EditText) findViewById(R.id.arc2241read);
            EditText arc22six = (EditText) findViewById(R.id.arc2204read);
            EditText arc22seven = (EditText) findViewById(R.id.arc2202read);
            EditText arc22eight = (EditText) findViewById(R.id.arc2226read);

            double dv = 0 ,ARC22ONE = 0 , ARC22TWO = 0 , ARC22THREE = 0 , ARC22FOUR = 0,
                    ARC22FIVE = 0 , ARC22SIX = 0 , ARC22SEVEN = 0 , ARC22EIGHT = 0;

            if(arc22one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22ONE = Double.parseDouble(arc22one.getText().toString());
                dv = dv + 2;
            }

            if(arc22two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22TWO = Double.parseDouble(arc22two.getText().toString());
                dv = dv + 2;
            }

            if(arc22three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22THREE = Double.parseDouble(arc22three.getText().toString());
                dv = dv + 2;
            }

            if(arc22four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22FOUR = Double.parseDouble(arc22four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc22five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22FIVE = Double.parseDouble(arc22five.getText().toString());
                dv = dv + 2 ;
            }

            if(arc22six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22SIX = Double.parseDouble(arc22six.getText().toString());
                dv = dv + 7.5 ;
            }

            if(arc22seven.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22SEVEN = Double.parseDouble(arc22seven.getText().toString());
                dv = dv + 1.5;
            }

            if(arc22eight.getText().toString().equals(""))
            {

            }
            else
            {
                ARC22EIGHT = Double.parseDouble(arc22eight.getText().toString());
                dv = dv + 1.5;
            }


            double res = gradeCheck(ARC22ONE) * 2.0    + gradeCheck(ARC22TWO) * 2.0 +
                    gradeCheck(ARC22THREE) * 2.0  + gradeCheck(ARC22FOUR) * 2.0 +
                    gradeCheck(ARC22FIVE) * 2.0   + gradeCheck(ARC22SIX) * 7.5 +
                    gradeCheck(ARC22SEVEN) * 1.5  + gradeCheck(ARC22EIGHT) * 1.5;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc22zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester Two Year Two\nSession : "+
                    ARC22SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiTwoTwo.this, GpaArch22.class);
            intent.putExtra(strMarkArch22, pass);
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
