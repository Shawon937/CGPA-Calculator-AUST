package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CSESemesters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesemesters);
    }

    public void CSEOneOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSEOneOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSEOneTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSEOneTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSETwoOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSETwoOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSETwoTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSETwoTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSEThreeOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSEThreeOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSEThreeTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSEThreeTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSEFourOne(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSEFourOne.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void CSEFourTwo(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSEFourTwo.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
