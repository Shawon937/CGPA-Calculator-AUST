package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BBAOneOne extends AppCompatActivity {

    public static String strMarkBBA11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbaone_one);
    }

    public void BBA11(View v) {
        try {

            EditText BBA11zero = (EditText) findViewById(R.id.BBA11IDread);

            EditText BBA11ses = (EditText) findViewById(R.id.BBA11Session);
            String BBA11SES=BBA11ses.getText().toString();


            EditText BBA11one = (EditText) findViewById(R.id.BBA101read);
            EditText BBA11two = (EditText) findViewById(R.id.BBA102read);
            EditText BBA11three = (EditText) findViewById(R.id.BBA103read);
            EditText BBA11four = (EditText) findViewById(R.id.BBA105read);
            EditText BBA11five = (EditText) findViewById(R.id.BBA107read);
            EditText BBA11six = (EditText) findViewById(R.id.BBA109read);
           ;

            double dv = 0 ,BBA11ONE = 0 , BBA11TWO = 0 , BBA11THREE = 0 , BBA11FOUR = 0,
                    BBA11FIVE = 0 , BBA11SIX = 0;

            if(BBA11one.getText().toString().equals(""))
            {

            }
            else
            {
                BBA11ONE = Double.parseDouble(BBA11one.getText().toString());
                dv = dv + 2;
            }

            if(BBA11two.getText().toString().equals(""))
            {

            }
            else
            {
                BBA11TWO = Double.parseDouble(BBA11two.getText().toString());
                dv = dv + 2;
            }

            if(BBA11three.getText().toString().equals(""))
            {

            }
            else
            {
                BBA11THREE = Double.parseDouble(BBA11three.getText().toString());
                dv = dv + 3;
            }

            if(BBA11four.getText().toString().equals(""))
            {

            }
            else
            {
                BBA11FOUR = Double.parseDouble(BBA11four.getText().toString());
                dv = dv + 3 ;
            }

            if(BBA11five.getText().toString().equals(""))
            {

            }
            else
            {
                BBA11FIVE = Double.parseDouble(BBA11five.getText().toString());
                dv = dv + 3 ;
            }

            if(BBA11six.getText().toString().equals(""))
            {

            }
            else
            {
                BBA11SIX = Double.parseDouble(BBA11six.getText().toString());
                dv = dv + 3 ;
            }




            double res = gradeCheck(BBA11ONE) * 2.0 + gradeCheck(BBA11TWO) * 2.0 +
                    gradeCheck(BBA11THREE) * 3.0 + gradeCheck(BBA11FOUR) * 3.0 +
                    gradeCheck(BBA11FIVE) * 3.0 + gradeCheck(BBA11SIX) * 3.0 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=BBA11zero.getText().toString();

            String pass="ID : " + passID + "\nDept:BBA\nSemester One Year One\nSession : "+
                    BBA11SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(BBAOneOne.this, GpaBBA11.class);
            intent.putExtra(strMarkBBA11, pass);
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
