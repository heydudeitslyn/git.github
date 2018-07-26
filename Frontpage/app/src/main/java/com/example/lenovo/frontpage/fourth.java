package com.example.lenovo.frontpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.util.*;
public class fourth extends AppCompatActivity {

    private ImageButton pbtn, nbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fourth);

        pbtn = (ImageButton) findViewById(R.id.previousButton4);
        nbtn = (ImageButton) findViewById(R.id.nextButton4);

        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThird();
            }
        });
        nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMiddle();
            }
        });
    }

    public void openThird() {
        Intent intent = new Intent(this, third.class);
        startActivity(intent);
    }
    public void openMiddle()
    {
        Intent intent = new Intent(this, Middle.class);
        startActivity(intent);
    }
}
