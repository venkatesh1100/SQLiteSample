package com.example.venkateshjose.sqlitesample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public EditText fName;
    public EditText lName;
    public EditText age;
    public EditText address;

    public DBHelper helper = new DBHelper(getApplicationContext(),"asdf",null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fName = (EditText)findViewById(R.id.txtFirstName);
        lName = (EditText)findViewById(R.id.txtLastName);
        age = (EditText)findViewById(R.id.txtAge);
        address = (EditText)findViewById(R.id.txtAddress);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


    public void credo(View view){

        String fName1 = fName.getText().toString();
        String lName1 = fName.getText().toString();
        String age1 = fName.getText().toString();
        String address1 = fName.getText().toString();

        helper.insertUser(fName1,lName1,age1,address1);

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
