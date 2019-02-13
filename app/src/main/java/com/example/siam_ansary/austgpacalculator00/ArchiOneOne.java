package com.example.siam_ansary.austgpacalculator00;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiOneOne extends AppCompatActivity {

    public static String strMarkArch11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_one_one);
    }

    public void archi11(View v) {
        try {

            EditText arc11zero = (EditText) findViewById(R.id.arc11IDread);

            EditText arc11ses = (EditText) findViewById(R.id.arc11Session);
            String ARC11SES=arc11ses.getText().toString();


            EditText arc11one = (EditText) findViewById(R.id.arc1151read);
            EditText arc11two = (EditText) findViewById(R.id.arc1121read);
            EditText arc11three = (EditText) findViewById(R.id.arc1103read);
            EditText arc11four = (EditText) findViewById(R.id.arc1153read);
            EditText arc11five = (EditText) findViewById(R.id.arc1127read);
            EditText arc11six = (EditText) findViewById(R.id.arc1102read);
            EditText arc11seven = (EditText) findViewById(R.id.arc1104read);
            EditText arc11eight = (EditText) findViewById(R.id.arc1130read);

            double dv = 0 ,ARC11ONE = 0 , ARC11TWO = 0 , ARC11THREE = 0 , ARC11FOUR = 0,
                    ARC11FIVE = 0 , ARC11SIX = 0 , ARC11SEVEN = 0 , ARC11EIGHT = 0;

            if(arc11one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11ONE = Double.parseDouble(arc11one.getText().toString());
                dv = dv + 2;
            }

            if(arc11two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11TWO = Double.parseDouble(arc11two.getText().toString());
                dv = dv + 2;
            }

            if(arc11three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11THREE = Double.parseDouble(arc11three.getText().toString());
                dv = dv + 2;
            }

            if(arc11four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11FOUR = Double.parseDouble(arc11four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc11five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11FIVE = Double.parseDouble(arc11five.getText().toString());
                dv = dv + 2 ;
            }

            if(arc11six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11SIX = Double.parseDouble(arc11six.getText().toString());
                dv = dv + 3 ;
            }

            if(arc11seven.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11SEVEN = Double.parseDouble(arc11seven.getText().toString());
                dv = dv + 4.5;
            }

            if(arc11eight.getText().toString().equals(""))
            {

            }
            else
            {
                ARC11EIGHT = Double.parseDouble(arc11eight.getText().toString());
                dv = dv + 1.5;
            }


            double res = gradeCheck(ARC11ONE) * 2.0 + gradeCheck(ARC11TWO) * 2.0 +
                    gradeCheck(ARC11THREE) * 2.0 + gradeCheck(ARC11FOUR) * 2.0 +
                    gradeCheck(ARC11FIVE) * 2.0 + gradeCheck(ARC11SIX) * 3.0 +
                    gradeCheck(ARC11SEVEN) * 4.5 + gradeCheck(ARC11EIGHT) * 1.5;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc11zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester One Year One\nSession : "+
                    ARC11SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiOneOne.this, GpaArch11.class);
            intent.putExtra(strMarkArch11, pass);
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
