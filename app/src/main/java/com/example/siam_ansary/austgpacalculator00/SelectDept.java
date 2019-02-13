package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectDept extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dept);
    }

    public void selectArchi(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),ArchitectureSemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectBBA(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),BBASemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectCivil(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CivilSemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectCSE(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),CSESemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectEEE(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),EEESemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectIPE(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),IPESemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectME(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),MESemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public void selectTEX(View v)
    {

        try{

            startActivity(new Intent(getApplicationContext(),TEXSemesters.class));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
