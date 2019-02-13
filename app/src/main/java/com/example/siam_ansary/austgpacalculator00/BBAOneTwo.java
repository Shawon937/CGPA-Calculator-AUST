package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBAOneTwo extends AppCompatActivity {

    public static String strMarkBBA12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbaone_two);
    }

    public void BBA12(View v) {
        try {

            EditText BBA12zero = (EditText) findViewById(R.id.BBA12IDread);

            EditText BBA12ses = (EditText) findViewById(R.id.BBA12Session);
            String BBA12SES=BBA12ses.getText().toString();


            EditText BBA12one = (EditText) findViewById(R.id.BBA111read);
            EditText BBA12two = (EditText) findViewById(R.id.BBA113read);
            EditText BBA12three = (EditText) findViewById(R.id.BBA115read);
            EditText BBA12four = (EditText) findViewById(R.id.BBA117read);
            EditText BBA12five = (EditText) findViewById(R.id.BBA119read);

            double dv = 0 ,BBA12ONE = 0 , BBA12TWO = 0 , BBA12THREE = 0 , BBA12FOUR = 0,
                    BBA12FIVE = 0;

            if(BBA12one.getText().toString().equals(""))
            {

            }
            else
            {
                BBA12ONE = Double.parseDouble(BBA12one.getText().toString());
                dv = dv + 3;
            }

            if(BBA12two.getText().toString().equals(""))
            {

            }
            else
            {
                BBA12TWO = Double.parseDouble(BBA12two.getText().toString());
                dv = dv + 3;
            }

            if(BBA12three.getText().toString().equals(""))
            {

            }
            else
            {
                BBA12THREE = Double.parseDouble(BBA12three.getText().toString());
                dv = dv + 3;
            }

            if(BBA12four.getText().toString().equals(""))
            {

            }
            else
            {
                BBA12FOUR = Double.parseDouble(BBA12four.getText().toString());
                dv = dv + 4 ;
            }

            if(BBA12five.getText().toString().equals(""))
            {

            }
            else
            {
                BBA12FIVE = Double.parseDouble(BBA12five.getText().toString());
                dv = dv + 3 ;
            }






            double res = gradeCheck(BBA12ONE) * 3.0 + gradeCheck(BBA12TWO) * 3.0 +
                    gradeCheck(BBA12THREE) * 3.0 + gradeCheck(BBA12FOUR) * 4.0 +
                    gradeCheck(BBA12FIVE) * 3.0  ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=BBA12zero.getText().toString();

            String pass="ID : " + passID + "\nDept:BBA\nSemester Two Year One\nSession : "+
                    BBA12SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(BBAOneTwo.this, GpaBBA12.class);
            intent.putExtra(strMarkBBA12, pass);
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
