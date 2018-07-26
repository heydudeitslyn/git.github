package com.example.lenovo.frontpage;

import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.util.*;
public class first extends AppCompatActivity {

    private ImageButton pbtn, nbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_first);

        pbtn = (ImageButton) findViewById(R.id.previousButton1);
        nbtn = (ImageButton) findViewById(R.id.nextButton1);

        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondPage();
            }
        });
        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecond();
            }
        });
    }
    public void openSecondPage()
    {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }
    public void openSecond()
    {
        Intent intent = new Intent(this, second.class);
        startActivity(intent);
    }
}
