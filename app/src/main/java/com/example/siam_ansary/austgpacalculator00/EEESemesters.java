package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EEESemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeesemesters);
    }

    public void EEEOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEEOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEEOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEEOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEETwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEETwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEETwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEETwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEEThreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEEThreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEEThreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEEThreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEEFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEEFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void EEEFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEEFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
