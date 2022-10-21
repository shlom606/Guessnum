package com.example.guessnum;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class dialog extends AppCompatActivity {
    SharedPreferences sp;
    String strfname, strlname;
    Dialog d;
    EditText etFname, etLname;
    Button btnEnter;
    TextView textView2, answer;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_num);
        sp = getSharedPreferences("details", 0);
        etFname=findViewById(R.id.etFname);
        etLname=findViewById(R.id.etLname);
        btnEnter=findViewById(R.id.btnEnter1);
        answer=findViewById(R.id.answer);
        strfname = sp.getString("fname", null);
        strlname = sp.getString("lname", null);
        if (strfname != null && strlname != null) {


        }
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnEnter == v) {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("fname", etFname.getText().toString());
                    editor.putString("lname", etLname.getText().toString());
                    editor.commit();
                    Toast.makeText(dialog.this,"thank you for playing "+etFname.getText().toString()+" "+etLname.getText().toString(),Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(dialog.this, MainActivity.class);
                    startActivity(intent);

                }

            }
        });

    }
}
