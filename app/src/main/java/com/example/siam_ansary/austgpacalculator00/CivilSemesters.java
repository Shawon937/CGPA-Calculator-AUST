package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CivilSemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_semesters);
    }

    public void CivilOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilTwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilTwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilTwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilTwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilThreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilThreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilThreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilThreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CivilFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
