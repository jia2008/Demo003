package com.example.demo003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMoveButton();
        setWord();
    }
    public  void setMoveButton(){
        Button button = findViewById(R.id.first_move_button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this,SecondActivity.class);
           startActivity(intent);
        });


    }
    public  void  setWord(){
        Button button = findViewById(R.id.change_word_id);
        TextView textView = findViewById(R.id.word_id);
        button.setOnClickListener(v -> {
            textView.setText("see you");
        });


    }

}