package com.example.pt03_vizcaino_pau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView onCreateCount, onStartCount, onRestartCount, onResumeCount, onPauseCount, onStopCount, onDestroyCount;
    private int createINT, startINT, restartINT, resumeINT, pauseINT, stopINT, destroyINT;
    private Button destroyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateCount = findViewById(R.id.onCreateCount);
        onStartCount = findViewById(R.id.onStartCount);
        onRestartCount = findViewById(R.id.onRestartCount);
        onResumeCount = findViewById(R.id.onResumeCount);
        onPauseCount = findViewById(R.id.onPauseCount);
        onStopCount = findViewById(R.id.onStopCount);
        onDestroyCount = findViewById(R.id.onDestroyCount);
        destroyButton = findViewById(R.id.destroyButton);

        destroyButton.setOnClickListener(this);

        createINT++;
        onCreateCount.setText(String.valueOf(createINT));


    }

    @Override
    protected void onStart() {
        super.onStart();

        startINT++;
        onStartCount.setText(String.valueOf(startINT));
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        restartINT++;
        onRestartCount.setText(String.valueOf(restartINT));
    }

    @Override
    protected void onResume() {
        super.onResume();

        resumeINT++;
        onResumeCount.setText(String.valueOf(resumeINT));
    }

    @Override
    protected void onPause() {
        super.onPause();

        pauseINT++;
        onPauseCount.setText(String.valueOf(pauseINT));
    }

    @Override
    protected void onStop() {
        super.onStop();

        stopINT++;
        onStopCount.setText(String.valueOf(stopINT));
    }

    @Override
    public void onClick(View v) {

        if(v == destroyButton){
            destroyINT++;
            onDestroyCount.setText(String.valueOf(destroyINT));
            Toast.makeText(this, "onDestroy " + destroyINT, Toast.LENGTH_SHORT).show();
            finish();
        }

    }
}