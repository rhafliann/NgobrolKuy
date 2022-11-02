package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Chat extends AppCompatActivity {

    private ImageView setting;
    private RelativeLayout roomchat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setting = findViewById(R.id.dot);
        roomchat = findViewById(R.id.RoomChat1);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atur = new Intent(Chat.this, Setting.class);
                startActivity(atur);
            }
        });
        roomchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatting = new Intent(Chat.this, RoomChat.class);
                startActivity(chatting);
            }
        });
    }
}