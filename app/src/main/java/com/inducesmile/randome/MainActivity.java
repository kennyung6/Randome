package com.inducesmile.randome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by kenny on 11/28/16.
 */

public class MainActivity extends AppCompatActivity {

    private TextView aTxt;
    private Button aBtn;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        //Creates Activity A View
        setContentView(R.layout.activity_main);

        //Binds The TextView to the Activity
        aTxt = (TextView) findViewById(R.id.aTxt);

        //Function to generate random numbers
        Random random = new Random();
        // Gives n such that 0 <= n < 50
        n = random.nextInt(50);

        //Get the data and populate the result into the TextView
        aTxt.setText(String.valueOf(n));


        //Binds The Button to the Activity
        aBtn = (Button) findViewById(R.id.aBtn);

        //Goto Activity B
        aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentional = new Intent(MainActivity.this, BeeActivity.class);
                startActivity(intentional);
            }
        });


    }





}
