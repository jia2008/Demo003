package com.example.demo003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMoveButton();
    }
    public  void setMoveButton(){
        Button button = findViewById(R.id.MOVE_BUTTON_id);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this,SecondActivity.class);
           startActivity(intent);
        });

    }

}