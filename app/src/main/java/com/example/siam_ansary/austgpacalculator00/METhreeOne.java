package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class METhreeOne extends AppCompatActivity {

    public static String strMarkME31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methree_one);
    }

    public void ME31(View v) {
        try {

            EditText MEzero = (EditText) findViewById(R.id.ME31IDread);

            EditText MEses = (EditText) findViewById(R.id.ME31Session);
            String MESES=MEses.getText().toString();


            EditText MEone = (EditText) findViewById(R.id.ME2201read);
            EditText MEtwo = (EditText) findViewById(R.id.ME3105read);
            EditText MEthree = (EditText) findViewById(R.id.ME3101read);
            EditText MEfour = (EditText) findViewById(R.id.ME3109read);
            EditText MEfive = (EditText) findViewById(R.id.MEMath3107read);
            EditText MEsix = (EditText) findViewById(R.id.ME3106read);
            EditText MEseven = (EditText) findViewById(R.id.ME3102read);
            EditText MEeight = (EditText) findViewById(R.id.ME2202read);
            EditText MEnine = (EditText) findViewById(R.id.ME3110read);




            double dv = 0 ,MEONE = 0 , METWO = 0 , METHREE = 0 , MEFOUR = 0,
                    MEFIVE = 0 , MESIX = 0 , MESEVEN = 0 , MEEIGHT = 0,MENINE = 0 ;

            if(MEone.getText().toString().equals(""))
            {

            }
            else
            {
                MEONE = Double.parseDouble(MEone.getText().toString());
                dv = dv + 3;
            }

            if(MEtwo.getText().toString().equals(""))
            {

            }
            else
            {
                METWO = Double.parseDouble(MEtwo.getText().toString());
                dv = dv + 3;
            }

            if(MEthree.getText().toString().equals(""))
            {

            }
            else
            {
                METHREE = Double.parseDouble(MEthree.getText().toString());
                dv = dv + 3 ;
            }

            if(MEfour.getText().toString().equals(""))
            {

            }
            else
            {
                MEFOUR = Double.parseDouble(MEfour.getText().toString());
                dv = dv + 3 ;
            }

            if(MEfive.getText().toString().equals(""))
            {

            }
            else
            {
                MEFIVE = Double.parseDouble(MEfive.getText().toString());
                dv = dv + 3 ;
            }

            if(MEsix.getText().toString().equals(""))
            {

            }
            else
            {
                MESIX = Double.parseDouble(MEsix.getText().toString());
                dv = dv + 0.75 ;
            }

            if(MEseven.getText().toString().equals(""))
            {

            }
            else
            {
                MESEVEN = Double.parseDouble(MEseven.getText().toString());
                dv = dv + 0.75 ;
            }

            if(MEeight.getText().toString().equals(""))
            {

            }
            else
            {
                MEEIGHT = Double.parseDouble(MEeight.getText().toString());
                dv = dv + 0.75 ;
            }
            if(MEnine.getText().toString().equals(""))
            {

            }
            else
            {
                MENINE = Double.parseDouble(MEnine.getText().toString());
                dv = dv + 1.5 ;
            }





            double res = gradeCheck(MEONE) * 3.0 + gradeCheck(METWO) * 3.0 +
                    gradeCheck(METHREE) * 3.0 + gradeCheck(MEFOUR) * 3.0 +
                    gradeCheck(MEFIVE) * 3.0 + gradeCheck(MESIX) * 0.75 +
                    gradeCheck(MESEVEN) * 0.75 + gradeCheck(MEEIGHT) * 0.75 +
                    gradeCheck(MENINE) * 1.5 ;


            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=MEzero.getText().toString();

            String pass="ID : " + passID + "\nDept:Mechanical & production Engineering\nSemester: 1st\nYear: 3rd\nSession : "+
                    MESES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(METhreeOne.this, GpaME31.class);
            intent.putExtra(strMarkME31, pass);
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
