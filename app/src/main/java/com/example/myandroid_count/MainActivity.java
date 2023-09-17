package com.example.myandroid_count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = findViewById(R.id.tv_score);

    }

    public void showToast(View view){
        String msg = "The current score is "+tvScore.getText().toString();
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }

    public void increaseCount(View view){
        int score =Integer.parseInt(tvScore.getText().toString());
        ++score;
        tvScore.setText(score+"");
    }
    public void decrementCount(View view){
        int score =Integer.parseInt(tvScore.getText().toString());
        --score;
        tvScore.setText(score+"");
    }

}