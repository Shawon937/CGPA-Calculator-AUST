package com.example.siam_ansary.austgpacalculator00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DeleteRecords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_records);
    }

    public void DelSinRec(View V) {
        try {
            GpaDB ob02 = new GpaDB(this, null, null, 1);
            String[] SS2 = ob02.databaseToString();

            TextView txtv02 = (TextView) findViewById(R.id.not01);

            if (SS2.length == 0) {
                txtv02.setText("List is empty to delete any record.");
            } else {

                EditText etob = (EditText) findViewById(R.id.delRecEntry);
                int ind = Integer.parseInt(etob.getText().toString());

                if (SS2.length < ind) {
                    txtv02.setText("Faulty input");
                } else {
                    ind = ind - 1;
                    ob02.deleteProduct(SS2[ind]);

                    etob.setText("");


                    txtv02.setText("Data cleared");
                }


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DelAllRec(View V) {
        try {
            GpaDB ob01 = new GpaDB(this, null, null, 1);

            String[] SS = ob01.databaseToString();

            for (int i = 0; i < SS.length; i++) {
                ob01.deleteProduct(SS[i]);
            }

            TextView txtv01 = (TextView) findViewById(R.id.not02);
            txtv01.setText("All data cleared");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
