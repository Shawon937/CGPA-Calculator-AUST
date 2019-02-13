package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiFourTwo extends AppCompatActivity {

    public static String strMarkArch42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_four_two);
    }

    public void archi42(View v) {
        try {

            EditText arc42zero = (EditText) findViewById(R.id.arc42IDread);

            EditText arc42ses = (EditText) findViewById(R.id.arc42Session);
            String ARC42SES=arc42ses.getText().toString();


            EditText arc42one = (EditText) findViewById(R.id.arc4229read);
            EditText arc42two = (EditText) findViewById(R.id.arc4257read);
            EditText arc42three = (EditText) findViewById(R.id.arc4205read);
            EditText arc42four = (EditText) findViewById(R.id.arc4207read);
            EditText arc42five = (EditText) findViewById(R.id.arc4204read);
            EditText arc42six = (EditText) findViewById(R.id.arc4206read);



            double dv = 0 ,ARC42ONE = 0 , ARC42TWO = 0 , ARC42THREE = 0 , ARC42FOUR = 0,
                    ARC42FIVE = 0 , ARC42SIX = 0  ;

            if(arc42one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC42ONE = Double.parseDouble(arc42one.getText().toString());
                dv = dv + 2;
            }

            if(arc42two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC42TWO = Double.parseDouble(arc42two.getText().toString());
                dv = dv + 2;
            }

            if(arc42three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC42THREE = Double.parseDouble(arc42three.getText().toString());
                dv = dv + 2;
            }

            if(arc42four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC42FOUR = Double.parseDouble(arc42four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc42five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC42FIVE = Double.parseDouble(arc42five.getText().toString());
                dv = dv + 9 ;
            }

            if(arc42six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC42SIX = Double.parseDouble(arc42six.getText().toString());
                dv = dv + 1.5 ;
            }




            double res = gradeCheck(ARC42ONE) * 2.0    + gradeCheck(ARC42TWO) * 2.0 +
                    gradeCheck(ARC42THREE) * 2.0  + gradeCheck(ARC42FOUR) * 2.0 +
                    gradeCheck(ARC42FIVE) * 9.0   + gradeCheck(ARC42SIX) * 1.5 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc42zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester Two Year Four\nSession : "+
                    ARC42SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiFourTwo.this, GpaArch42.class);
            intent.putExtra(strMarkArch42, pass);
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
