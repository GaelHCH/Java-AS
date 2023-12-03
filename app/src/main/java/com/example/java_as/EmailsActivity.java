package com.example.java_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailsActivity extends AppCompatActivity {
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emails);
    }

    public void launchComposeMessage(View v) {
        Intent goToComposeMessge = new Intent(this, ComposeMessageActivity.class);
        Button replyTo1 = ((Button)findViewById(R.id.button3));
        Button replyTo2 = ((Button)findViewById(R.id.button4));
        Button replyTo3 = ((Button)findViewById(R.id.button5));
        //The final else statement gives a little bit of hard coding
        if (replyTo1.equals((Button) v)) {
            name = replyTo1.getText().toString();
        }
        else if(replyTo2.equals((Button) v)) {
            name = replyTo2.getText().toString();
        }
        else {
            name = replyTo3.getText().toString();
        }

        goToComposeMessge.putExtra("NAME", name);
        startActivity(goToComposeMessge);
    }

}