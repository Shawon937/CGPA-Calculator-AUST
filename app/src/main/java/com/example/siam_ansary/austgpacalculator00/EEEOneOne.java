package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EEEOneOne extends AppCompatActivity {

    public static String strMarkEEE11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeeone_one);
    }

    public void EEE11(View v) {
        try {

            EditText EEEzero = (EditText) findViewById(R.id.EEE11IDread);

            EditText EEEses = (EditText) findViewById(R.id.EEE11Session);
            String EEESES=EEEses.getText().toString();


            EditText EEEone = (EditText) findViewById(R.id.EEE1101read);
            EditText EEEtwo = (EditText) findViewById(R.id.EEE1102read);
            EditText EEEthree = (EditText) findViewById(R.id.EEEME1101read);
            EditText EEEfour = (EditText) findViewById(R.id.EEEME1102read);
            EditText EEEfive = (EditText) findViewById(R.id.EEEPhy1105read);
            EditText EEEsix = (EditText) findViewById(R.id.EEEPhy1106read);
            EditText EEEseven = (EditText) findViewById(R.id.EEEMath1103read);
            EditText EEEeight = (EditText) findViewById(R.id.EEEChem1107read);
            EditText EEEnine = (EditText) findViewById(R.id.EEEChem1108read);



            double dv = 0 ,EEEONE = 0 , EEETWO = 0 , EEETHREE = 0 , EEEFOUR = 0,
                    EEEFIVE = 0 , EEESIX = 0 , EEESEVEN = 0 , EEEEIGHT = 0, EEENINE = 0 ;

            if(EEEone.getText().toString().equals(""))
            {

            }
            else
            {
                EEEONE = Double.parseDouble(EEEone.getText().toString());
                dv = dv + 3;
            }

            if(EEEtwo.getText().toString().equals(""))
            {

            }
            else
            {
                EEETWO = Double.parseDouble(EEEtwo.getText().toString());
                dv = dv + 1.5;
            }

            if(EEEthree.getText().toString().equals(""))
            {

            }
            else
            {
                EEETHREE = Double.parseDouble(EEEthree.getText().toString());
                dv = dv + 3 ;
            }

            if(EEEfour.getText().toString().equals(""))
            {

            }
            else
            {
                EEEFOUR = Double.parseDouble(EEEfour.getText().toString());
                dv = dv + 1.5 ;
            }

            if(EEEfive.getText().toString().equals(""))
            {

            }
            else
            {
                EEEFIVE = Double.parseDouble(EEEfive.getText().toString());
                dv = dv + 3 ;
            }

            if(EEEsix.getText().toString().equals(""))
            {

            }
            else
            {
                EEESIX = Double.parseDouble(EEEsix.getText().toString());
                dv = dv + 1.5 ;
            }

            if(EEEseven.getText().toString().equals(""))
            {

            }
            else
            {
                EEESEVEN = Double.parseDouble(EEEseven.getText().toString());
                dv = dv + 3 ;
            }

            if(EEEeight.getText().toString().equals(""))
            {

            }
            else
            {
                EEEEIGHT = Double.parseDouble(EEEeight.getText().toString());
                dv = dv + 3 ;
            }
            if(EEEnine.getText().toString().equals(""))
            {

            }
            else
            {
                EEENINE = Double.parseDouble(EEEnine.getText().toString());
                dv = dv + 1.5 ;
            }




            double res = gradeCheck(EEEONE) * 3.0 + gradeCheck(EEETWO) * 1.5 +
                    gradeCheck(EEETHREE) * 3.0 + gradeCheck(EEEFOUR) * 1.5 +
                    gradeCheck(EEEFIVE) * 3.0 + gradeCheck(EEESIX) * 1.5 +
                    gradeCheck(EEESEVEN) * 3.0 + gradeCheck(EEEEIGHT) * 3.0 +
                    gradeCheck(EEENINE) * 1.5;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=EEEzero.getText().toString();

            String pass="ID : " + passID + "\nDept:Electrical Engineering\nSemester: 1st\nYear: 1st\nSession : "+
                    EEESES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(EEEOneOne.this, GpaEEE11.class);
            intent.putExtra(strMarkEEE11, pass);
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
