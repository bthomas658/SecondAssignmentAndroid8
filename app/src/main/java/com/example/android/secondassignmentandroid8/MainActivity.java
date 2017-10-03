package com.example.android.secondassignmentandroid8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainNum;
    Button buttonAdd;
    Button buttonSub;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //create a reference to our buttons and text field
        mainNum = (TextView)(findViewById(R.id.text_total_num));
        buttonAdd = (Button)findViewById(R.id.butAdd);
        buttonSub = (Button)findViewById(R.id.butSub);


        //handling the add button listener
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                counter++;
                mainNum.setText(String.valueOf(counter));
            }
        });

        //handle the subtract button listener
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                counter--;
                mainNum.setText(String.valueOf(counter));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.random:
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                return true;

            default:
                return true;
        }
      //  return super.onOptionsItemSelected(item);
    }
}

