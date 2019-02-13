package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArchiFiveTwo extends AppCompatActivity {

    public static String strMarkArch52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archi_five_two);
    }

    public void archi52(View v) {
        try {

            EditText arc52zero = (EditText) findViewById(R.id.arc52IDread);

            EditText arc52ses = (EditText) findViewById(R.id.arc52Session);
            String ARC52SES=arc52ses.getText().toString();


            EditText arc52one = (EditText) findViewById(R.id.arc5259read);
            EditText arc52two = (EditText) findViewById(R.id.arc5241read);
            EditText arc52three = (EditText) findViewById(R.id.arc5257read);
            EditText arc52four = (EditText) findViewById(R.id.arc5204read);




            double dv = 0 ,ARC52ONE = 0 , ARC52TWO = 0 , ARC52THREE = 0 , ARC52FOUR = 0;

            if(arc52one.getText().toString().equals(""))
            {

            }
            else
            {
                ARC52ONE = Double.parseDouble(arc52one.getText().toString());
                dv = dv + 2;
            }

            if(arc52two.getText().toString().equals(""))
            {

            }
            else
            {
                ARC52TWO = Double.parseDouble(arc52two.getText().toString());
                dv = dv + 2;
            }

            if(arc52three.getText().toString().equals(""))
            {

            }
            else
            {
                ARC52THREE = Double.parseDouble(arc52three.getText().toString());
                dv = dv + 2;
            }

            if(arc52four.getText().toString().equals(""))
            {

            }
            else
            {
                ARC52FOUR = Double.parseDouble(arc52four.getText().toString());
                dv = dv + 9.0 ;
            }







            double res = gradeCheck(ARC52ONE) * 2.0    + gradeCheck(ARC52TWO) * 2.0 +
                    gradeCheck(ARC52THREE) * 2.0  + gradeCheck(ARC52FOUR) * 9.0 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=arc52zero.getText().toString();

            String pass="ID : " + passID + "\nDept:Architecture\nSemester Two Year Five\nSession : "+
                    ARC52SES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(ArchiFiveTwo.this, GpaArch52.class);
            intent.putExtra(strMarkArch52, pass);
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
