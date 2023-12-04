package com.example.java_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

    }

    //Changes text from input
   public void changeText(View v) {
       EditText text = findViewById(R.id.editTextText);
       TextView newText = findViewById(R.id.boom);

       inputText = text.getText().toString();
       Log.d("input", inputText);

       newText.setText(inputText);


   }

   //Changing button attributes
   public void doSomething(View v) {
//        v.setEnabled(false);
//       Log.d("success", "Button Disable");

       //Disable a button when clicked, it also shows in the text
       View myView = findViewById(R.id.button2);
       myView.setEnabled(false);
       Button butn = (Button) myView;
       butn.setText("Disabled");

   }

   //Getting text from text input
   public void handleText(View v) {
        EditText text = findViewById(R.id.editTextText);
        String input = text.getText().toString();
        Log.d("input", input);

   }

    //Making an alert when clicking a button
   public void giveAlert(View v) {
       //TextView newText = findViewById(R.id.boom);
       EditText text = findViewById(R.id.editTextText);
       String input = text.getText().toString();

       Toast.makeText(this, input, Toast.LENGTH_LONG).show();

   }

   //Creating new activities (screens)
   public void launchSettings(View v) {
        Intent intent = new Intent(this, SettingsActivity.class);
       intent.putExtra("COOL", inputText);
        startActivity(intent);
   }

   public void launchEmails(View v) {
        Intent goToEmails = new Intent(this, EmailsActivity.class);
        startActivity(goToEmails);
   }

   public void newFunction(View v) {
        System.out.println("Do something");
   }





}