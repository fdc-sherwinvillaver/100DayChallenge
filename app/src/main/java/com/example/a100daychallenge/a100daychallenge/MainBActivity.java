package com.example.a100daychallenge.a100daychallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainBActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.right_out);
            }
        });


        Random r = new Random();

        int minNumber = 1;

        int maxNumber = 1000;

        int randomNumber = r.nextInt((maxNumber - minNumber) + 1) + minNumber;

        TextView tv = (TextView) findViewById(R.id.textView);

        tv.setText(String.valueOf(randomNumber));
    }
}
