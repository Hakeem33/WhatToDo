package com.example.android.whattodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Assignment = 1;
    String restart = "refresh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning member variables to view from layout

        final TextView textView = (TextView) findViewById(R.id.textview);
        final Button topButton = (Button) findViewById(R.id.button_top);
        final Button bottomButton = (Button) findViewById(R.id.button_bottom);

        // listener for top button
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Assignment == 1) {
                    textView.setText(R.string.Story2);
                    topButton.setText(R.string.Story2Ans1);
                    bottomButton.setText(R.string.Story2Ans2);
                    Assignment = 2;
                } else if (Assignment == 2) {
                    textView.setText(R.string.Story4);
                    topButton.setText(restart);
                    bottomButton.setVisibility(View.INVISIBLE);
                    Assignment = 8;
                } else if (Assignment == 3) {
                    textView.setText(R.string.Story6);
                    topButton.setText(restart);
                    bottomButton.setVisibility(View.INVISIBLE);
                    Assignment = 6;
                } else if (Assignment == 8 || Assignment == 6) {
                    textView.setText(R.string.Story1);
                    bottomButton.setVisibility(View.VISIBLE);
                    topButton.setText(R.string.Story1Ans1);
                    bottomButton.setText(R.string.Story1Ans2);
                    Assignment = 1;
                }


            }
        });

        //listener for bottom button
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Assignment == 1) {
                    textView.setText(R.string.Story3);
                    topButton.setText(R.string.Story3Ans1);
                    bottomButton.setText(R.string.Story3Ans2);
                    Assignment = 3;
                } else if (Assignment == 2) {
                    textView.setText(R.string.Story4);
                    topButton.setVisibility(View.INVISIBLE);
                    bottomButton.setText(restart);
                    Assignment = 4;
                } else if (Assignment == 3) {
                    textView.setText(R.string.Story5);
                    topButton.setVisibility(View.INVISIBLE);
                    bottomButton.setText(restart);
                    Assignment = 5;
                } else if (Assignment == 4 || Assignment == 5) {
                    textView.setText(R.string.Story1);
                    topButton.setVisibility(View.VISIBLE);
                    topButton.setText(R.string.Story1Ans1);
                    bottomButton.setText(R.string.Story1Ans2);
                    Assignment = 1;
                }

            }


        });
    }
}
