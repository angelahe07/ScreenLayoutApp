package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Create a method that can be called when the user clicks on the button.
    - In order for this method to be called, it MUST have a specific method signature
    - must be public void
    - must take ONLY one parameter of type View. */
    public void switchScreens(View v){
        // first we make a reference to the EditText by locating it with its id
        EditText nameET = findViewById(R.id.nameEditText);
        // use that reference to extract the text and save it into a String variable
        // .getText is an Editable, not a String so we call toString so we can save it in a String variable
        String name = nameET.getText().toString();

        EditText ageET = findViewById(R.id.ageEditText);
        String age = ageET.getText().toString();

        EditText hobbyET = findViewById(R.id.hobbyEditText);
        String hobby = hobbyET.getText().toString();

        String nameText = name;
        // first param is a searchable tag, second is what you are logging
        Log.i("angela", "First screen" + nameText);
        /*
        To switch screens, we need to create and Intent, tell it where to go, put data in the intent
        (optional), startActivity to actually launch the Intent (go to other screen).
        (make package, address it, stuff it, mail it
         */
        // coming from this screen, going to ShowInfoActivity
        Intent intent1 = new Intent(this, ShowInfoActivity.class);
        // OPTIONAL - you don't have to put anything in the intent
        intent1.putExtra("NameText", nameText);
        // launch the new screen

        String ageText = age;
        Log.i("angela", "First screen" + ageText);
        intent1.putExtra("AgeText", ageText);

        String hobbyText = hobby;
        Log.i("angela", "First screen" + hobbyText);
        intent1.putExtra("HobbyText", hobbyText);

        startActivity(intent1);

    }


}



