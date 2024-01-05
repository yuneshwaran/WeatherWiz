package com.example.weatherwiz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button getcityby_id,getweatherby_id,getweatherby_name;
    EditText get_input;
    ListView list_weather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign values
        getcityby_id = findViewById(R.id.getcityby_id);
        getweatherby_id = findViewById(R.id.getweatherby_id);
        getweatherby_name = findViewById(R.id.getweatherby_name);
        get_input = findViewById(R.id.get_input);
        list_weather = findViewById(R.id.list_weather);


        };


    }
