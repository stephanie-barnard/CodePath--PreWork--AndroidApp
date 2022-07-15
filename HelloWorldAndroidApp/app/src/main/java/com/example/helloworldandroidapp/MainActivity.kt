package com.example.helloworldandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.widget.Button
import android.widget.TextView


//This kt kotlin file is where we will be handling user interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Show the activity_main.xml file
        //Line connects the activity_main file to the kotlin MainActivity file
        setContentView(R.layout.activity_main)

        //Display customized text to show 'Hello from {your name}'
        // findViewById is a method that allows us to connect to a view in the xml file
        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Any code within the brackets will execute when the button is tapped
            //Handles button tap
            Log.i("Stephanie", "tapped on text change button") //Create a log message
            //get a reference to the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_500))
        //set the text color
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            //Any code within the brackets will execute when the button is tapped
            //Handles button tap
            Log.i("Stephanie", "tapped on background change button") //Create a log message
            //get a reference to the background view
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.white))
            //set the background color
        }

    }
}