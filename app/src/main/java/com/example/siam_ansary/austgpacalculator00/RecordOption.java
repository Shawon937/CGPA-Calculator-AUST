package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RecordOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_option);
    }

    public void RecordShow(View V) {
        try {
            startActivity(new Intent(getApplicationContext(), RecordPrint.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RecordDelete(View V) {
        try {
            startActivity(new Intent(getApplicationContext(), DeleteRecords.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
