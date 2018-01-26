package com.example.zahid.mygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowUsers extends AppCompatActivity {
    TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_users);
        data=(TextView)findViewById(R.id.data);

        UserDB db=new UserDB(this);
        db.open();
        data.setText(db.getData());
        db.close();
    }
}
