package com.example.hananurfauziah.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView6);
        TextView textView1 = (TextView) findViewById(R.id.textView8);

        textView.setText(getIntent().getExtras().getString("TextView"));
        textView1.setText(getIntent().getExtras().getString("TextView"));

        textView.setText(message);
    }
}
