package com.example.guessnum;

import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends AppCompatActivity {
    Button Next_btn_Left, btn_Left, btn_Right,Next_btn_Right,btn_enter;
    TextView textView2, answer;
    int numguessed=0,timeGuessed=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Left=findViewById(R.id.btn_Left);
        btn_Right=findViewById(R.id.btn_Right);
        textView2=findViewById(R.id.textView2);
        Next_btn_Left=findViewById(R.id.Next_btn_Left);
        Next_btn_Right=findViewById(R.id.Next_btn_Right);
        btn_enter=findViewById(R.id.btn_Enter);
        answer=findViewById(R.id.answer);

    }





public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.tafrit,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int rand,range;
        String string;
        Random random=new Random();
        super.onOptionsItemSelected(item);
        int id= item.getItemId();
        if(id==R.id.btn_1_10){
            AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("Exit");
            alert.setMessage("Are you sure you want to exit?");
            alert.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"YES",Toast.LENGTH_LONG).show();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"I want to stay",Toast.LENGTH_LONG).show();

                }
            });
            alert.create().show();
            numguessed=1;
            Toast.makeText(this,"you have selected a 1-10 num",Toast.LENGTH_SHORT).show();
            rand=random.nextInt(10);
            btn_Right.setText("+");btn_Left.setText("-");Next_btn_Left.setText("-5");Next_btn_Right.setText("+5");

            btn_Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed-1>=0)
                        numguessed--;
                    answer.setText("is the number: "+numguessed);

                }
            });
            Next_btn_Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed-5>=0)
                        numguessed-=5;
                    answer.setText("is the number: "+numguessed);
                }
            });
            btn_Right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed+1<=10)
                        numguessed++;
                    answer.setText("is the number: "+numguessed);
                }
            });
            Next_btn_Right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed+5<=10)
                        numguessed+=5;
                    answer.setText("is the number: "+numguessed);
                }
            });
            btn_enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed>rand)
                        textView2.setText("num too high");
                    else if(numguessed<rand)
                        textView2.setText("num too low");
                    else{
                        Intent intent= new Intent(MainActivity.this,WinScreen.class);
                        intent.putExtra("scores",timeGuessed);
                        startActivity(intent);
                    }
                    timeGuessed++;
                }

            });

        }
        else if(id==R.id.btn_1_50){
            AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("Exit");
            alert.setMessage("Are you sure you want to exit?");
            alert.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"YES",Toast.LENGTH_LONG).show();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"I want to stay",Toast.LENGTH_LONG).show();

                }
            });
            alert.create().show();
            numguessed=1;
            Toast.makeText(this,"you have selected a 1-50 num",Toast.LENGTH_SHORT).show();
            rand=random.nextInt(50);
            btn_Right.setText("+");btn_Left.setText("-");Next_btn_Left.setText("-10");Next_btn_Right.setText("+10");
            btn_Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed-1>=0)
                        numguessed-=1;
                    answer.setText("is the number: "+numguessed);
                }
            });
            Next_btn_Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed-10>=0)
                        numguessed-=10;
                    answer.setText("is the number: "+numguessed);
                }
            });
            btn_Right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed+1<=50)
                        numguessed+=1;
                    answer.setText("is the number: "+numguessed);
                }
            });
            Next_btn_Right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed+10<=50)
                        numguessed+=10;
                    answer.setText("is the number: "+numguessed);
                }
            });
            btn_enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed>rand)
                        textView2.setText("num too high");
                    else if(numguessed<rand)
                        textView2.setText("num too low");
                    else
                        textView2.setText("num is correct");
                    timeGuessed++;
                }
            });
        }
        else if(id==R.id.btn_1_100){
            AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("Exit");
            alert.setMessage("Are you sure you want to exit?");
            alert.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"YES",Toast.LENGTH_LONG).show();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this,"I want to stay",Toast.LENGTH_LONG).show();

                }
            });
            alert.create().show();
            numguessed=1;
            Toast.makeText(this,"you have selected a 1-100 num",Toast.LENGTH_SHORT).show();
            rand=random.nextInt(100);
            btn_Right.setText("+");btn_Left.setText("-");Next_btn_Left.setText("-10");Next_btn_Right.setText("+10");
            btn_Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed-1>=0)
                        numguessed-=1;
                    answer.setText("is the number: "+numguessed);
                }
            });
            Next_btn_Left.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed-10>=0)
                        numguessed-=10;
                    answer.setText("is the number: "+numguessed);
                }
            });
            btn_Right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed+1<=100)
                        numguessed+=1;
                    answer.setText("is the number: "+numguessed);
                }
            });
            Next_btn_Right.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed+10<=100)
                        numguessed+=10;
                    answer.setText("is the number: "+numguessed);
                }
            });
            btn_enter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(numguessed>rand)
                        textView2.setText("num too high");
                    else if(numguessed<rand)
                        textView2.setText("num too low");
                    else
                        textView2.setText("num is correct");
                    timeGuessed++;
                }
            });
        }

        return true;
    }

}

