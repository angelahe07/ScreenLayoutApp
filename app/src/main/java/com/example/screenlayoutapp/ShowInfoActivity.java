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
        String receivedFullText = intent.getStringExtra("FULLTEXT");
        // log to see what was received
        Log.i("Angela", "received: " + receivedFullText);

        // get a reference to TextView
        // set the text of TextView

        TextView infoTV = findViewById(R.id.infoTextView);
        infoTV.setText(receivedFullText);
    }
}