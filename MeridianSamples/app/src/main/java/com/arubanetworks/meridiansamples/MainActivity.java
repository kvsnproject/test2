package com.arubanetworks.meridiansamples;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.ImageButton;

import com.arubanetworks.meridiansamples.DirectionsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tie the button object to the button on the screen
        ImageButton findMyWayBtn = findViewById(R.id.findMyWay);
        ImageButton emergencyBtn = findViewById(R.id.emergency);

        //Implement the functionality for the view screen
        findMyWayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks","You clicked \"Find My Way\".");
                Intent i=new Intent(MainActivity.this, SecondaryActivity.class);
                startActivity(i);
            }
        });

        emergencyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks","You clicked \"Emergency\".");
                Intent i2=new Intent(MainActivity.this, EmergencyActivity.class);
                startActivity(i2);
            }
        });
    }
}
