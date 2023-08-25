package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        // open the intent to get the data when the screen loads
        Intent intent = getIntent();
        String receivedNameText = intent.getStringExtra("NameText");
        // log to see what was received
        Log.i("Angela", "received: " + receivedNameText);

        // get a reference to TextView
        // set the text of TextView

        TextView nameTV = findViewById(R.id.nameTextView);
        nameTV.setText("Hi, " + receivedNameText);

        String receivedAgeText = intent.getStringExtra("AgeText");
        Log.i("Angela", "received: " + receivedAgeText);

        TextView ageTV = findViewById(R.id.ageTextView);
        ageTV.setText("You are " + receivedAgeText + " years old.");

        String receivedHobbyText = intent.getStringExtra("HobbyText");
        Log.i("Angela", "received: " + receivedHobbyText);

        TextView hobbyTV = findViewById(R.id.hobbyTextView);
        hobbyTV.setText("Hobbies: " + receivedHobbyText);

    }
}