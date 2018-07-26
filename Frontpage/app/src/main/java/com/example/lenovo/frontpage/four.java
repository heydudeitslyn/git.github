package com.example.lenovo.frontpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.util.*;
public class four extends AppCompatActivity {

    private ImageButton pbtn, nbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_four);

        pbtn = (ImageButton) findViewById(R.id.previousButton8);
        nbtn = (ImageButton) findViewById(R.id.nextButton8);

        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThree();
            }
        });

        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLast();
            }
        });
    }
    public void openThree()
    {
        Intent intent = new Intent(this, three.class);
        startActivity(intent);
    }
    public void openLast()
    {
        Intent intent = new Intent(this, LastPage.class);
        startActivity(intent);
    }
}
