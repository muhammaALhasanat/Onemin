package com.example.basel.onemin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.net.HttpCookie;

/**
 * Created by basel on 1/8/2016.
 */
public class detail extends AppCompatActivity {

    ImageButton youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        youtube =(ImageButton)findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpCookie uri = null;
                Intent c = new Intent(Intent.ACTION_VIEW,  Uri.parse("http://www.youtube.com"));

                startActivity(c);

            }
        });

}}
