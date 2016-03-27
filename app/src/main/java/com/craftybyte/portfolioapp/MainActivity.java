package com.craftybyte.portfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the button instances...
        Button button1 = (Button) findViewById(R.id.appButtonID1);
        Button button2 = (Button) findViewById(R.id.appButtonID2);
        Button button3 = (Button) findViewById(R.id.appButtonID3);
        Button button4 = (Button) findViewById(R.id.appButtonID4);
        Button button5 = (Button) findViewById(R.id.appButtonID5);
        Button button6 = (Button) findViewById(R.id.appButtonID6);

        button1.setOnClickListener(new buttonClickListner());
        button2.setOnClickListener(new buttonClickListner());
        button3.setOnClickListener(new buttonClickListner());
        button4.setOnClickListener(new buttonClickListner());
        button5.setOnClickListener(new buttonClickListner());
        button6.setOnClickListener(new buttonClickListner());
    }

    //Listerner Class
    private class buttonClickListner implements View.OnClickListener
    {
        private final String notifyText = "This Button Will launch  ";
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),notifyText+((Button)v).getText().toString(),Toast.LENGTH_SHORT).show();
        }
    }

}