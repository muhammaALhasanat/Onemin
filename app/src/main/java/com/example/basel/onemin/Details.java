package com.example.basel.onemin;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Details extends AppCompatActivity {
    DBAdapter myDbHelper = new DBAdapter(this);
    Details chosenObject;
    int item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView t1=(TextView)findViewById(R.id.t1);
        ImageButton im=(ImageButton)findViewById(R.id.im);
        Intent data=getIntent();
        int des=data.getIntExtra("id",1);
        String s= String.valueOf(des);
       Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();




    }
}
