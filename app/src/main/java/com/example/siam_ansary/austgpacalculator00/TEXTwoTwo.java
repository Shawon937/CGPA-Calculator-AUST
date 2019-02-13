package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TEXTwoTwo extends AppCompatActivity {

    public static String strMarkTEX22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textwo_two);
    }

    public void TEX22(View v) {
        try {

            EditText TEXzero = (EditText) findViewById(R.id.TEX22IDread);

            EditText TEXses = (EditText) findViewById(R.id.TEX22Session);
            String TEXSES=TEXses.getText().toString();


            EditText TEXone = (EditText) findViewById(R.id.TEX207read);
            EditText TEXtwo = (EditText) findViewById(R.id.TEX208read);
            EditText TEXthree = (EditText) findViewById(R.id.TEX209read);
            EditText TEXfour = (EditText) findViewById(R.id.TEX210read);
            EditText TEXfive = (EditText) findViewById(R.id.TEX211read);
            EditText TEXsix = (EditText) findViewById(R.id.TEX212read);
            EditText TEXseven = (EditText) findViewById(R.id.TEX219read);
            EditText TEXeight = (EditText) findViewById(R.id.TEXEEE217read);
            EditText TEXnine = (EditText) findViewById(R.id.TEXEEE218read);
            EditText TEXten = (EditText) findViewById(R.id.TEXCSE2186read);





            double dv = 0 ,TEXONE = 0 , TEXTWO = 0 , TEXTHREE = 0 , TEXFOUR = 0,
                    TEXFIVE = 0 , TEXSIX = 0 , TEXSEVEN = 0 , TEXEIGHT = 0,TEXNINE = 0, TEXTEN = 0 ;

            if(TEXone.getText().toString().equals(""))
            {

            }
            else
            {
                TEXONE = Double.parseDouble(TEXone.getText().toString());
                dv = dv + 4;
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
                dv = dv + 4 ;
            }

            if(TEXfour.getText().toString().equals(""))
            {

            }
            else
            {
                TEXFOUR = Double.parseDouble(TEXfour.getText().toString());
                dv = dv + 1.5 ;
            }

            if(TEXfive.getText().toString().equals(""))
            {

            }
            else
            {
                TEXFIVE = Double.parseDouble(TEXfive.getText().toString());
                dv = dv + 3 ;
            }

            if(TEXsix.getText().toString().equals(""))
            {

            }
            else
            {
                TEXSIX = Double.parseDouble(TEXsix.getText().toString());
                dv = dv + 1.5 ;
            }

            if(TEXseven.getText().toString().equals(""))
            {

            }
            else
            {
                TEXSEVEN = Double.parseDouble(TEXseven.getText().toString());
                dv = dv + 3 ;
            }

            if(TEXeight.getText().toString().equals(""))
            {

            }
            else
            {
                TEXEIGHT = Double.parseDouble(TEXeight.getText().toString());
                dv = dv + 3 ;
            }

            if(TEXnine.getText().toString().equals(""))
            {

            }
            else
            {
                TEXNINE = Double.parseDouble(TEXnine.getText().toString());
                dv = dv + 1.5 ;
            }

            if(TEXten.getText().toString().equals(""))
            {

            }
            else
            {
                TEXTEN = Double.parseDouble(TEXten.getText().toString());
                dv = dv + 1.5 ;
            }



            double res = gradeCheck(TEXONE) * 4.0 + gradeCheck(TEXTWO) * 1.5 +
                    gradeCheck(TEXTHREE) * 4.0 + gradeCheck(TEXFOUR) * 1.5 +
                    gradeCheck(TEXFIVE) * 3.0 + gradeCheck(TEXSIX) * 1.5+
                    gradeCheck(TEXSEVEN) * 3.0 + gradeCheck(TEXEIGHT) * 3.0 +
                    gradeCheck(TEXNINE) * 1.5 + gradeCheck(TEXTEN) * 1.5 ;

            double grd = res / dv;
            double newGrd = Math.round(grd * 100.0) / 100.0;
            String passMark = String.valueOf(newGrd);

            String passID=TEXzero.getText().toString();

            String pass="ID : " + passID + "\nDept:Textile Engineering\nSemester: 2nd\nYear: 2nd\nSession : "+
                    TEXSES+"\nGPA : " + passMark +"\n" ;



            Intent intent = new Intent(TEXTwoTwo.this,GpaTEX22.class);
            intent.putExtra(strMarkTEX22, pass);
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
