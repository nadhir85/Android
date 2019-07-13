package com.nadhirr.latihan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bermain extends AppCompatActivity {
    private Button kuis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bermain);
        kuis = (Button) findViewById(R.id.kuis);
        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Bermain.this, kuis.class);
                startActivity(i);
            }
        });
    }
}