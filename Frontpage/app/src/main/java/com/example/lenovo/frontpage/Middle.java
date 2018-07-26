package com.example.lenovo.frontpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.*;
public class Middle extends AppCompatActivity {

    private Button pbtn, nbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_middle);

        pbtn = (Button) findViewById(R.id.stopButton);
        nbtn = (Button) findViewById(R.id.continueButton);

        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endOfSurvey();
            }
        });

        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOne();
            }
        });
    }
    public void endOfSurvey()
    {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }
    public void openOne()
    {
        Intent intent = new Intent(this, one.class);
        startActivity(intent);
    }
}
