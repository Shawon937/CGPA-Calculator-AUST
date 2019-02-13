package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void selectDept(View v) {

        try {

            startActivity(new Intent(getApplicationContext(), SelectDept.class));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void about(View v) {
        try {

            startActivity(new Intent(getApplicationContext(), AboutUS.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void help(View v) {
        try {

            startActivity(new Intent(getApplicationContext(), HelpPage.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showRecord(View v) {
        try {

            startActivity(new Intent(getApplicationContext(), RecordOption.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCalc(View v) {
        try {
            startActivity(new Intent(getApplicationContext(), Calculator.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

