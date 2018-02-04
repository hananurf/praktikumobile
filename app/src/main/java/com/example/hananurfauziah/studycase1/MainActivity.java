package com.example.hananurfauziah.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText mMessageEditText;
    private EditText mMessageEditText1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE="com.example.hananurfauziah.studycase1.extra.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = (EditText) findViewById(R.id.editText);
        mMessageEditText1 = (EditText) findViewById(R.id.editText2);
    }

    public void ABNORMAL(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Main2Activity.class);
        String message = mMessageEditText.getText().toString();
        String message1 = mMessageEditText1.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void EATBUS(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Main2Activity.class);
        String message = mMessageEditText.getText().toString();
        String message1 = mMessageEditText1.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
