package com.nadhirr.latihan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private Button belajar;
    private Button bermain;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        belajar = (Button) findViewById(R.id.belajar);
        belajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, Belajar.class);
                startActivity(i);
            }
        });
        bermain = (Button) findViewById(R.id.bermain);
        bermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent (MainActivity.this, Bermain.class);
                startActivity(j);
            }
        });
        help = (Button) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent (MainActivity.this, Help.class);
                startActivity(k);
            }
        });
    }


    public void exit(View v) {
        finish();
    }
}
