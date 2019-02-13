package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiThreeTwo extends AppCompatActivity {

    public static String strMarkArch32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_three_two);
    }

    public void archi32(View v) {
        try {

            EditText arc32zero = (EditText) findViewById(R.id.arc32IDread);

            EditText arc32ses = (EditText) findViewById(R.id.arc32Session);
            String ARC32SES=arc32ses.getText().toString();


            EditText arc32one = (EditText) findViewById(R.id.arc3229read);
            EditText arc32two = (EditText) findViewById(R.id.arc3241read);
            EditText arc32three = (EditText) findViewById(R.id.arc3257read);
            EditText arc32four = (EditText) findViewById(R.id.arc3225read);
            EditText arc32five = (EditText) findViewById(R.id.arc3201read);
            EditText arc32six = (EditText) findViewById(R.id.arc3226read);
            EditText arc32seven = (EditText) findViewById(R.id.arc3204read);


            double dv = 0 ,ARC32ONE = 0 , ARC32TWO = 0 , ARC32THREE = 0 , ARC32FOUR = 0,
                    ARC32FIVE = 0 , ARC32SIX = 0 , ARC32SEVEN = 0 ;

            if(arc32one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32ONE = Double.parseDouble(arc32one.getText().toString());
                dv = dv + 2;
            }

            if(arc32two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32TWO = Double.parseDouble(arc32two.getText().toString());
                dv = dv + 2;
            }

            if(arc32three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32THREE = Double.parseDouble(arc32three.getText().toString());
                dv = dv + 2;
            }

            if(arc32four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32FOUR = Double.parseDouble(arc32four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc32five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32FIVE = Double.parseDouble(arc32five.getText().toString());
                dv = dv + 2 ;
            }

            if(arc32six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32SIX = Double.parseDouble(arc32six.getText().toString());
                dv = dv + 3 ;
            }

            if(arc32seven.getText().toString().equals(""))
            {

            }
            else
            {
                ARC32SEVEN = Double.parseDouble(arc32seven.getText().toString());
                dv = dv + 7.5;
            }




            double res = gradeCheck(ARC32ONE) * 2.0    + gradeCheck(ARC32TWO) * 2.0 +
                    gradeCheck(ARC32THREE) * 2.0  + gradeCheck(ARC32FOUR) * 2.0 +
                    gradeCheck(ARC32FIVE) * 2.0   + gradeCheck(ARC32SIX) * 3.0 +
                    gradeCheck(ARC32SEVEN) * 7.5 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc32zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester Two Year Three\nSession : "+
                    ARC32SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiThreeTwo.this, GpaArch32.class);
            intent.putExtra(strMarkArch32, pass);
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
