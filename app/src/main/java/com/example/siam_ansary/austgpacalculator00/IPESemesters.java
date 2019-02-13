package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IPESemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipesemesters);
    }

    public void IPEOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPEOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPEOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPEOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPETwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPETwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPETwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPETwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPEThreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPEThreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPEThreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPEThreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPEFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPEFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void IPEFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPEFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
