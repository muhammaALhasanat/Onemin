package com.example.basel.onemin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by basel on 1/8/2016.
 */
public class menue extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menue);
        lv=(ListView)findViewById(R.id.listv);
        //DBAdapter databaseAccess = DBAdapter.getInstance(this);
       // databaseAccess.open();
        final List<String> sweet = DBAdapter.getQuotes();
      //  databaseAccess.close();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sweet);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent i = new Intent(getApplicationContext(),Details.class);
                i.putExtra("id",position);

                startActivity(i);

            }
        });


    }
}
