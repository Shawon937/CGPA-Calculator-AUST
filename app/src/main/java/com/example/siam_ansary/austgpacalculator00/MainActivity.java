package com.example.siam_ansary.austgpacalculator00;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.Window;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Handler h = new Handler();
        h.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                startActivity(new Intent(getApplicationContext(), MainMenu.class));
                finish();
            }
        },1000L);
    }
}
