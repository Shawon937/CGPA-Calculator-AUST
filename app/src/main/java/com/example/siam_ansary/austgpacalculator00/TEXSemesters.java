package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TEXSemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texsemesters);
    }

    public void TEXOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXTwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXTwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXTwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXTwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXThreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXThreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXThreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXThreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void TEXFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
