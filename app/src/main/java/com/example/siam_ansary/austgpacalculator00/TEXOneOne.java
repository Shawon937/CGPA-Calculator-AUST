package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TEXOneOne extends AppCompatActivity {

    public static String strMarkTEX11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texone_one);
    }

    public void TEX11(View v) {
        try {

            EditText TEXzero = (EditText) findViewById(R.id.TEX11IDread);

            EditText TEXses = (EditText) findViewById(R.id.TEX11Session);
            String TEXSES=TEXses.getText().toString();


            EditText TEXone = (EditText) findViewById(R.id.TEX101read);
            EditText TEXtwo = (EditText) findViewById(R.id.TEXME102read);
            EditText TEXthree = (EditText) findViewById(R.id.TEXHum103read);
            EditText TEXfour = (EditText) findViewById(R.id.TEXChem107read);
            EditText TEXfive = (EditText) findViewById(R.id.TEXChem108read);
            EditText TEXsix = (EditText) findViewById(R.id.TEXPhy109read);
            EditText TEXseven = (EditText) findViewById(R.id.TEXPhy110read);
            EditText TEXeight = (EditText) findViewById(R.id.TEXMath111read);




            double dv = 0 ,TEXONE = 0 , TEXTWO = 0 , TEXTHREE = 0 , TEXFOUR = 0,
                    TEXFIVE = 0 , TEXSIX = 0 , TEXSEVEN = 0 , TEXEIGHT = 0 ;

            if(TEXone.getText().toString().equals(""))
            {

            }
            else
            {
                TEXONE = Double.parseDouble(TEXone.getText().toString());
                dv = dv + 3;
            }

            if(TEXtwo.getText().toString().equals(""))
            {

            }
            else
            {
                TEXTWO = Double.parseDouble(TEXtwo.getText().toString());
                dv = dv + 1.5;
            }

            if(TEXthree.getText().toString().equals(""))
            {

            }
            else
            {
                TEXTHREE = Double.parseDouble(TEXthree.getText().toString());
                dv = dv + 3 ;
            }

            if(TEXfour.getText().toString().equals(""))
            {

            }
            else
            {
                TEXFOUR = Double.parseDouble(TEXfour.getText().toString());
                dv = dv + 3 ;
            }

            if(TEXfive.getText().toString().equals(""))
            {

            }
            else
            {
                TEXFIVE = Double.parseDouble(TEXfive.getText().toString());
                dv = dv + 1.5 ;
            }

            if(TEXsix.getText().toString().equals(""))
            {

            }
            else
            {
                TEXSIX = Double.parseDouble(TEXsix.getText().toString());
                dv = dv + 3 ;
            }

            if(TEXseven.getText().toString().equals(""))
            {

            }
            else
            {
                TEXSEVEN = Double.parseDouble(TEXseven.getText().toString());
                dv = dv + 1.5 ;
            }

            if(TEXeight.getText().toString().equals(""))
            {

            }
            else
            {
                TEXEIGHT = Double.parseDouble(TEXeight.getText().toString());
                dv = dv + 3 ;
            }


            double res = gradeCheck(TEXONE) * 3.0 + gradeCheck(TEXTWO) * 1.5 +
                    gradeCheck(TEXTHREE) * 3.0 + gradeCheck(TEXFOUR) * 3.0 +
                    gradeCheck(TEXFIVE) * 1.5 + gradeCheck(TEXSIX) * 3.0 +
                    gradeCheck(TEXSEVEN) * 1.5 + gradeCheck(TEXEIGHT) * 3.0 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=TEXzero.getText().toString();

            String pass="ID : " + passID + "\nDept:Textile Engineering\nSemester: 1st\nYear: 1st\nSession : "+
                    TEXSES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(TEXOneOne.this, GpaTEX11.class);
            intent.putExtra(strMarkTEX11, pass);
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
