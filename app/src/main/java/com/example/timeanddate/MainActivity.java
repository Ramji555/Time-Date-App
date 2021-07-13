package com.example.timeanddate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button datePicker,timePicker,digitalAnalog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=findViewById(R.id.datePicker);
        timePicker=findViewById(R.id.timePicker);
      //  digitalAnalog=findViewById(R.id.digitAnalog);


        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dateInten=new Intent(MainActivity.this,DateActivity.class);
                startActivity(dateInten);
            }
        });

        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dateInten=new Intent(MainActivity.this,TimeActivity.class);
                startActivity(dateInten);

            }
        });
       /* digitalAnalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dateInten=new Intent(MainActivity.this,DigitalAndAnalogActivity.class);
                startActivity(dateInten);
            }
        }); */

    }
}