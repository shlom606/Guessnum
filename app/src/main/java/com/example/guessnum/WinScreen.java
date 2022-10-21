package com.example.guessnum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinScreen extends AppCompatActivity {
    Button btn_restart;
    TextView numgus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen);
        btn_restart=findViewById(R.id.btn_restart);
        numgus=findViewById(R.id.numgus);
        Intent intent=getIntent();
        int scores =intent.getExtras().getInt("scores");
        numgus.setText("your number of guesses is: "+scores);
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WinScreen.this, dialog.class);
                startActivity(intent);
            }
        });
    }
}