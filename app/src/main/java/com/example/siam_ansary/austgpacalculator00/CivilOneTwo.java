package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CivilOneTwo extends AppCompatActivity {

    public static String strMarkCivil12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_one_two);
    }

    public void Civil12(View v) {
        try {

            EditText Civilzero = (EditText) findViewById(R.id.Civil12IDread);

            EditText Civilses = (EditText) findViewById(R.id.Civil12Session);
            String CivilSES=Civilses.getText().toString();


            EditText Civilone = (EditText) findViewById(R.id.CivilCE101read);
            EditText Civiltwo = (EditText) findViewById(R.id.CivilMath103read);
            EditText Civilthree = (EditText) findViewById(R.id.CivilHum101read);
            EditText Civilfour = (EditText) findViewById(R.id.CivilPhy103read);
            EditText Civilfive = (EditText) findViewById(R.id.CivilCE102read);
            EditText Civilsix = (EditText) findViewById(R.id.CivilPhy102read);



            double dv = 0 ,CivilONE = 0 , CivilTWO = 0 , CivilTHREE = 0 , CivilFOUR = 0,
                    CivilFIVE = 0 , CivilSIX = 0 ;

            if(Civilone.getText().toString().equals(""))
            {

            }
            else
            {
                CivilONE = Double.parseDouble(Civilone.getText().toString());
                dv = dv + 4;
            }

            if(Civiltwo.getText().toString().equals(""))
            {

            }
            else
            {
                CivilTWO = Double.parseDouble(Civiltwo.getText().toString());
                dv = dv + 3;
            }

            if(Civilthree.getText().toString().equals(""))
            {

            }
            else
            {
                CivilTHREE = Double.parseDouble(Civilthree.getText().toString());
                dv = dv + 4;
            }

            if(Civilfour.getText().toString().equals(""))
            {

            }
            else
            {
                CivilFOUR = Double.parseDouble(Civilfour.getText().toString());
                dv = dv + 3 ;
            }

            if(Civilfive.getText().toString().equals(""))
            {

            }
            else
            {
                CivilFIVE = Double.parseDouble(Civilfive.getText().toString());
                dv = dv + 1.5 ;
            }

            if(Civilsix.getText().toString().equals(""))
            {

            }
            else
            {
                CivilSIX = Double.parseDouble(Civilsix.getText().toString());
                dv = dv + 1.5 ;
            }






            double res = gradeCheck(CivilONE) * 4.0 + gradeCheck(CivilTWO) * 3.0 +
                    gradeCheck(CivilTHREE) * 4.0 + gradeCheck(CivilFOUR) * 3.0 +
                    gradeCheck(CivilFIVE) * 1.5 + gradeCheck(CivilSIX) * 1.5  ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=Civilzero.getText().toString();

            String pass="ID : " + passID + "\nDept:Civil Engineering\nSemester Two Year One\nSession : "+
                    CivilSES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(CivilOneTwo.this, GpaCivil12.class);
            intent.putExtra(strMarkCivil12, pass);
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
