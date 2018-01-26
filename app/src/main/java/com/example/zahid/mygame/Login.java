package com.example.zahid.mygame;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText name;
    EditText pass;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=(EditText)findViewById(R.id.name);
        pass=(EditText)findViewById(R.id.pass);
        play=(Button) findViewById(R.id.play);
    }
    public void playGame(View v)
    {
        String a=name.getText().toString().trim();
        String b=pass.getText().toString().trim();


        UserDB db=new UserDB(this);
            db.open();
       int check=db.redirectToGame(a,b);
       if(check>0)
       {
           startActivity(new Intent(this,TicTacTue.class));

       }
       else
       {

           Toast.makeText(Login.this,"Plaese sign up First!!!",Toast.LENGTH_SHORT).show();
       }
        db.close();


    }

}
