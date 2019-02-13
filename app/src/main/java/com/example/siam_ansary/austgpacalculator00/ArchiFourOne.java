package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiFourOne extends AppCompatActivity {

    public static String strMarkArch41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_four_one);
    }

    public void archi41(View v) {
        try {

            EditText arc41zero = (EditText) findViewById(R.id.arc41IDread);

            EditText arc41ses = (EditText) findViewById(R.id.arc41Session);
            String ARC41SES=arc41ses.getText().toString();


            EditText arc41one = (EditText) findViewById(R.id.arc4129read);
            EditText arc41two = (EditText) findViewById(R.id.arc4145read);
            EditText arc41three = (EditText) findViewById(R.id.arc4143read);
            EditText arc41four = (EditText) findViewById(R.id.arc4107read);
            EditText arc41five = (EditText) findViewById(R.id.arc4104read);
            EditText arc41six = (EditText) findViewById(R.id.arc4128read);



            double dv = 0 ,ARC41ONE = 0 , ARC41TWO = 0 , ARC41THREE = 0 , ARC41FOUR = 0,
                    ARC41FIVE = 0 , ARC41SIX = 0  ;

            if(arc41one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC41ONE = Double.parseDouble(arc41one.getText().toString());
                dv = dv + 2;
            }

            if(arc41two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC41TWO = Double.parseDouble(arc41two.getText().toString());
                dv = dv + 2;
            }

            if(arc41three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC41THREE = Double.parseDouble(arc41three.getText().toString());
                dv = dv + 2;
            }

            if(arc41four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC41FOUR = Double.parseDouble(arc41four.getText().toString());
                dv = dv + 2 ;
            }

            if(arc41five.getText().toString().equals(""))
            {

            }
            else
            {
                ARC41FIVE = Double.parseDouble(arc41five.getText().toString());
                dv = dv + 9 ;
            }

            if(arc41six.getText().toString().equals(""))
            {

            }
            else
            {
                ARC41SIX = Double.parseDouble(arc41six.getText().toString());
                dv = dv + 1.5 ;
            }




            double res = gradeCheck(ARC41ONE) * 2.0    + gradeCheck(ARC41TWO) * 2.0 +
                    gradeCheck(ARC41THREE) * 2.0  + gradeCheck(ARC41FOUR) * 2.0 +
                    gradeCheck(ARC41FIVE) * 9.0   + gradeCheck(ARC41SIX) * 1.5 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc41zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester One Year Four\nSession : "+
                    ARC41SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiFourOne.this, GpaArch41.class);
            intent.putExtra(strMarkArch41, pass);
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
