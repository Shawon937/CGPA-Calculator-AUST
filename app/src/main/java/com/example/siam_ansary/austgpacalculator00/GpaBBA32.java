package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GpaBBA32 extends AppCompatActivity {

    String saveStr;
    GpaDB obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_bba32);

        Intent intent = getIntent();
        String msg1 = intent.getStringExtra(BBAThreeTwo.strMarkBBA32);


        TextView tv1 = (TextView) findViewById(R.id.gradBBA32);

        saveStr = msg1;
        obj = new GpaDB(this, null, null, 1);
        tv1.setText(msg1);
    }

    public void saveDataBBA32(View v) {
        try {
            TextView tv2 = (TextView) findViewById(R.id.saveDoneIndicateBBA32);
            tv2.setText("Record Saved");
            GpaProduct p = new GpaProduct(saveStr);
            obj.addProduct(p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
