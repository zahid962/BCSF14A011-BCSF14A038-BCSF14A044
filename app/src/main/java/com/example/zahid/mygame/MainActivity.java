package com.example.zahid.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etPass;
    EditText cellNo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=(EditText)findViewById(R.id.etName);
        etPass=(EditText)findViewById(R.id.etPass);
        cellNo=(EditText)findViewById(R.id.cellNo);
    }
    public void btnSubmit(View v)
    {

        String name=etName.getText().toString().trim();
        String cell=cellNo.getText().toString().trim();
        String pass=etPass.getText().toString().trim();
        try {
            UserDB db = new UserDB(this);
            db.open();
            db.createEntry(name,pass,cell);
            db.close();
            Toast.makeText(MainActivity.this, "Successfully Added!!", Toast.LENGTH_SHORT).show();
            etName.setText("");
            cellNo.setText("");
            etPass.setText("");
        }
        catch(android.database.SQLException e)
        {
            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();

        }



    }
    public void btnShowData(View v)
    {
        startActivity(new Intent(this,ShowUsers.class));

    }
    public void wantToPlay(View v)
    {
        startActivity(new Intent(this,Login.class));

    }
    public void titac(View v)
    {
        startActivity(new Intent(this,TicTacTue.class));
    }

}
