package com.example.cnedujnux2020101369;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class BowlingGame {
        public void roll(int pin) {
        }

        public int score(int score) {
            return 0;
        }
    }
}