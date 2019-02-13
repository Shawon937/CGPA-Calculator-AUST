package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IPEThreeOne extends AppCompatActivity {

    public static String strMarkIPE31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipethree_one);
    }

    public void IPE31(View v) {
        try {

            EditText IPEzero = (EditText) findViewById(R.id.IPE31IDread);

            EditText IPEses = (EditText) findViewById(R.id.IPE31Session);
            String IPESES=IPEses.getText().toString();


            EditText IPEone = (EditText) findViewById(R.id.IPEME3131read);
            EditText IPEtwo = (EditText) findViewById(R.id.IPE3101read);
            EditText IPEthree = (EditText) findViewById(R.id.IPE3103read);
            EditText IPEfour = (EditText) findViewById(R.id.IPE3105read);
            EditText IPEfive = (EditText) findViewById(R.id.IPE3107read);
            EditText IPEsix = (EditText) findViewById(R.id.IPEME3132read);
            EditText IPEseven = (EditText) findViewById(R.id.IPE3102read);
            EditText IPEeight = (EditText) findViewById(R.id.IPE3104read);




            double dv = 0 ,IPEONE = 0 , IPETWO = 0 , IPETHREE = 0 , IPEFOUR = 0,
                    IPEFIVE = 0 , IPESIX = 0 , IPESEVEN = 0 , IPEEIGHT = 0, IPENINE = 0 ;

            if(IPEone.getText().toString().equals(""))
            {

            }
            else
            {
                IPEONE = Double.parseDouble(IPEone.getText().toString());
                dv = dv + 3;
            }

            if(IPEtwo.getText().toString().equals(""))
            {

            }
            else
            {
                IPETWO = Double.parseDouble(IPEtwo.getText().toString());
                dv = dv + 3;
            }

            if(IPEthree.getText().toString().equals(""))
            {

            }
            else
            {
                IPETHREE = Double.parseDouble(IPEthree.getText().toString());
                dv = dv + 3 ;
            }

            if(IPEfour.getText().toString().equals(""))
            {

            }
            else
            {
                IPEFOUR = Double.parseDouble(IPEfour.getText().toString());
                dv = dv + 3 ;
            }

            if(IPEfive.getText().toString().equals(""))
            {

            }
            else
            {
                IPEFIVE = Double.parseDouble(IPEfive.getText().toString());
                dv = dv + 3 ;
            }

            if(IPEsix.getText().toString().equals(""))
            {

            }
            else
            {
                IPESIX = Double.parseDouble(IPEsix.getText().toString());
                dv = dv + 1.5 ;
            }

            if(IPEseven.getText().toString().equals(""))
            {

            }
            else
            {
                IPESEVEN = Double.parseDouble(IPEseven.getText().toString());
                dv = dv + 1.5 ;
            }

            if(IPEeight.getText().toString().equals(""))
            {

            }
            else
            {
                IPEEIGHT = Double.parseDouble(IPEeight.getText().toString());
                dv = dv + 1.5 ;
            }





            double res = gradeCheck(IPEONE) * 3.0 + gradeCheck(IPETWO) * 3.0 +
                    gradeCheck(IPETHREE) * 3.0 + gradeCheck(IPEFOUR) * 3.0 +
                    gradeCheck(IPEFIVE) * 3.0 + gradeCheck(IPESIX) * 1.5 +
                    gradeCheck(IPESEVEN) * 1.5 + gradeCheck(IPEEIGHT) * 1.5 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=IPEzero.getText().toString();

            String pass="ID : " + passID + "\nDept:Industrial & production Engineering\nSemester: 1st\nYear: 3rd\nSession : "+
                    IPESES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(IPEThreeOne.this, GpaIPE31.class);
            intent.putExtra(strMarkIPE31, pass);
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
