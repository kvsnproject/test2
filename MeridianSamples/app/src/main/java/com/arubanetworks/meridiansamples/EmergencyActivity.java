package com.arubanetworks.meridiansamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        //Tie the button object to the button on the screen
//        Button yesEmergencyBtn = (Button) findViewById(R.id.yesEmergency);
//
//        //Implement the functionality for the view screen
//        yesEmergencyBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("clicks","You Clicked \"Yes\"");
//                Intent i=new Intent(EmergencyActivity.this, MainActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
