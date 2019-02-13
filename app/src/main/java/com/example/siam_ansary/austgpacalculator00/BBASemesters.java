package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BBASemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbasemesters);
    }

    public void BBAOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBAOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBAOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBAOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBATwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBATwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBATwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBATwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBAThreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBAThreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBAThreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBAThreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBAFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBAFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void BBAFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBAFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


    



}
