package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiOneTwo extends AppCompatActivity {

    public static String strMarkArch12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_one_two);
    }

    public void archi12(View v) {
        try {

            EditText arc12zero = (EditText) findViewById(R.id.arc12IDread);

            EditText arc12ses = (EditText) findViewById(R.id.arc12Session);
            String ARC12SES=arc12ses.getText().toString();


            EditText arc12one = (EditText) findViewById(R.id.arc1203read);
            EditText arc12two = (EditText) findViewById(R.id.arc1255read);
            EditText arc12three = (EditText) findViewById(R.id.arc1223read);
            EditText arc12four = (EditText) findViewById(R.id.arc1231read);
            EditText arc12five = (EditText) findViewById(R.id.arc1227read);
            EditText arc12six = (EditText) findViewById(R.id.arc1230read);
            EditText arc12seven = (EditText) findViewById(R.id.arc1202read);
            EditText arc12eight = (EditText) findViewById(R.id.arc1204read);

            double dv = 0 ,ARC12ONE = 0 , ARC12TWO = 0 , ARC12THREE = 0 , ARC12FOUR = 0,
                    ARC12FIVE = 0 , ARC12SIX = 0 , ARC12SEVEN = 0 , ARC12EIGHT = 0;

            if(arc12one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12ONE = Double.parseDouble(arc12one.getText().toString());
                dv = dv + 2;
            }

            if(arc12two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12TWO = Double.parseDouble(arc12two.getText().toString());
                dv = dv + 2;
            }

            if(arc12three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12THREE = Double.parseDouble(arc12three.getText().toString());
                dv = dv + 2;
            }

            if(arc12four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12FOUR = Double.parseDouble(arc12four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc12five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12FIVE = Double.parseDouble(arc12five.getText().toString());
                dv = dv + 2 ;
            }

            if(arc12six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12SIX = Double.parseDouble(arc12six.getText().toString());
                dv = dv + 1.5 ;
            }

            if(arc12seven.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12SEVEN = Double.parseDouble(arc12seven.getText().toString());
                dv = dv + 3.0;
            }

            if(arc12eight.getText().toString().equals(""))
            {

            }
            else
            {
                ARC12EIGHT = Double.parseDouble(arc12eight.getText().toString());
                dv = dv + 6.0;
            }


            double res = gradeCheck(ARC12ONE) * 2.0 + gradeCheck(ARC12TWO) * 2.0 +
                    gradeCheck(ARC12THREE) * 2.0 + gradeCheck(ARC12FOUR) * 2.0 +
                    gradeCheck(ARC12FIVE) * 2.0 + gradeCheck(ARC12SIX) * 1.5 +
                    gradeCheck(ARC12SEVEN) * 3.0 + gradeCheck(ARC12EIGHT) * 6.0;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc12zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester Two Year One\nSession : "+
                    ARC12SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiOneTwo.this, GpaArch12.class);
            intent.putExtra(strMarkArch12, pass);
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
