package com.dinesh.maurya.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//      // this method use net connection check
//        if(isConnectingToInternet(this))
//            Toast.makeText(this, "check internet connection", Toast.LENGTH_SHORT).show();
//
//
//
//        // Use SharedPrefrense daata management data
//        TinyDB tinyDB = new TinyDB(this);
//        // put sharedPrfence data
//        tinyDB.putString("Key","12345");
//
//        // get SharedPrefrense data
//        tinyDB.getString("key");


    }
}
