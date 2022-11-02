package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Validation extends AppCompatActivity {

    private TextView iya;
    private TextView engga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        iya = findViewById(R.id.ya);
        engga = findViewById(R.id.tidak);
        iya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iyak = new Intent(Validation.this, CekMail.class);
                startActivity(iyak);
            }
        });
        engga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enggak = new Intent(Validation.this, Setting.class);
                startActivity(enggak);
            }
        });
    }
}