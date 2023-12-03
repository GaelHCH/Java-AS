package com.example.java_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ComposeMessageActivity extends AppCompatActivity {
    private String personName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);

        //Making it so that the text view in ComposeMessage Activity updates depending on whom you want to respond to
        Intent i = getIntent();
        personName = i.getStringExtra("NAME");

        TextView name = (TextView)findViewById(R.id.replyToName);
        name.setText(personName);
    }

    public void sendReply(View v) {
        TextView replySentMessage = (TextView)findViewById(R.id.replySent);
        replySentMessage.setVisibility(View.VISIBLE);
    }






}