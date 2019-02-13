package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GpaArch51 extends AppCompatActivity {

    String saveStr ;
    GpaDB obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_arch51);

        Intent intent = getIntent();
        String msg1 = intent.getStringExtra(ArchiFiveOne.strMarkArch51);


        TextView tv1 = (TextView) findViewById(R.id.gradArch51);
        saveStr = msg1;
        obj = new GpaDB(this, null, null, 1);

        tv1.setText(msg1);
    }

    public void saveDataArch51(View v) {
        try {
            TextView tv2 = (TextView) findViewById(R.id.saveDoneIndicateArch51);
            tv2.setText("Record Saved");
            GpaProduct p = new GpaProduct(saveStr);
            obj.addProduct(p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}