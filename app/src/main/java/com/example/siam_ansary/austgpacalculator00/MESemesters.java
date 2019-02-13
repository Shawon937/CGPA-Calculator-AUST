package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MESemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesemesters);
    }

    public void MEOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),MEOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void MEOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),MEOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void METwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),METwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void METwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),METwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void METhreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),METhreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void METhreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),METhreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void MEFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),MEFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void MEFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),MEFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
