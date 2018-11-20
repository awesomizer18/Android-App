package com.awesomizer18.github.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupContinueButton();

        setupYoutubeButton();
    }

    private void setupContinueButton() {
        Button btn1 = (Button) findViewById(R.id.buttonContinue);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "This is a log message!");
                Toast.makeText(getApplicationContext(), "Ok", Toast.LENGTH_SHORT)
                        .show();

                Intent startApp = new Intent(MainActivity.this, Start.class);
                startActivity(startApp)
            }
        });
    }
    private void setupYoutubeButton() {
        Button btn1 = (Button) findViewById(R.id.youtube);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thank you!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
