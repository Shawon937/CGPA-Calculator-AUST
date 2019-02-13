package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiFiveOne extends AppCompatActivity {

    public static String strMarkArch51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_five_one);
    }

    public void archi51(View v) {
        try {

            EditText arc51zero = (EditText) findViewById(R.id.arc51IDread);

            EditText arc51ses = (EditText) findViewById(R.id.arc51Session);
            String ARC51SES=arc51ses.getText().toString();


            EditText arc51one = (EditText) findViewById(R.id.arc5109read);
            EditText arc51two = (EditText) findViewById(R.id.arc5125read);
            EditText arc51three = (EditText) findViewById(R.id.arc5157read);
            EditText arc51four = (EditText) findViewById(R.id.arc5104read);
            EditText arc51five = (EditText) findViewById(R.id.arc5160read);




            double dv = 0 ,ARC51ONE = 0 , ARC51TWO = 0 , ARC51THREE = 0 , ARC51FOUR = 0,
                    ARC51FIVE = 0   ;

            if(arc51one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC51ONE = Double.parseDouble(arc51one.getText().toString());
                dv = dv + 2;
            }

            if(arc51two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC51TWO = Double.parseDouble(arc51two.getText().toString());
                dv = dv + 2;
            }

            if(arc51three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC51THREE = Double.parseDouble(arc51three.getText().toString());
                dv = dv + 2;
            }

            if(arc51four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC51FOUR = Double.parseDouble(arc51four.getText().toString());
                dv = dv + 9.0 ;
            }

            if(arc51five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC51FIVE = Double.parseDouble(arc51five.getText().toString());
                dv = dv + 1.5 ;
            }






            double res = gradeCheck(ARC51ONE) * 2.0    + gradeCheck(ARC51TWO) * 2.0 +
                    gradeCheck(ARC51THREE) * 2.0  + gradeCheck(ARC51FOUR) * 9.0 +
                    gradeCheck(ARC51FIVE) * 1.5   ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc51zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester One Year Five\nSession : "+
                    ARC51SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiFiveOne.this, GpaArch51.class);
            intent.putExtra(strMarkArch51, pass);
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
