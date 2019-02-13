package com.example.siam_ansary.austgpacalculator00;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecordPrint extends AppCompatActivity {


    GpaDB obj = new GpaDB(this, null, null, 1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_print);


        try {
            String[] SS = obj.databaseToString();

            for (int i = 0; i < SS.length; i++)
            {
                SS[i] = "Record No. " + (i + 1) + " : \n" + SS[i];
            }

            ListAdapter ob = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SS);
            ListView objec = (ListView) findViewById(R.id.showGpas);
            objec.setAdapter(ob);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
