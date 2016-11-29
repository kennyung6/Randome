package com.inducesmile.randome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Kenny Dabiri on 11/28/16.
 * Inducesmiles' 100 DAYS ANDROID APP DEVELOPMENT CHALLENGE FOR BEGINNERS
 */

public class BeeActivity extends AppCompatActivity {

    private TextView bTxt;
    private Button bBtn;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Creates Activity B View
        setContentView(R.layout.activity_bee);

        //Binds the TextView to the Activity
        bTxt = (TextView) findViewById(R.id.bTxt);

        //Function to generate random numbers
        Random random = new Random();
        // Gives n such that 0 <= n < 50
        n= random.nextInt(50);

        //Get the data and populate the result into the TextView
        bTxt.setText(String.valueOf(n));

        //Binds the Button to the View
        bBtn = (Button) findViewById(R.id.bBtn);

        //Goto Back to Activity A
        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentional = new Intent(BeeActivity.this, MainActivity.class);
                startActivity(intentional);
            }
        });



    }
}
