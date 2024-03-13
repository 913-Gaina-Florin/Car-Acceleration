package com.example.car.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.car.MyApplication;
import com.example.car.R;
import com.example.car.controller.ResultsActivityController;

public class ResultsActivity extends AppCompatActivity {

    private Button exitButton;

    private CardView cardView;
    private TextView totalTimeTextView;
    private TextView averageSpeedTextView;
    private TextView maxSpeedTextView;

    private ResultsActivityController controller;

    private void initialise(){
        MyApplication applicationClass = (MyApplication) getApplicationContext();
        controller = new ResultsActivityController(applicationClass.getResultsRepository(), this);
    }

    public void updateTotalTimeTextView(String newText){
        totalTimeTextView.setText(newText);
    }

    public void updateAverageSpeedTextView(String newText){
        averageSpeedTextView.setText(newText);
    }

    public void updateMaxSpeedTextView(String newText){
        maxSpeedTextView.setText(newText);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        exitButton = findViewById(R.id.exitButton);
        cardView = findViewById(R.id.cardView);
        totalTimeTextView = cardView.findViewById(R.id.totalTimeTextView);
        averageSpeedTextView = cardView.findViewById(R.id.averageSpeedTextView);
        maxSpeedTextView = cardView.findViewById(R.id.maxSpeedTextView);
        initialise();

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}