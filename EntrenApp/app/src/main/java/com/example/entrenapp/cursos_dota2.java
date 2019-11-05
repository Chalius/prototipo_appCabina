package com.example.entrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cursos_dota2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos_dota2);



    }


    public void cursosDota2(View v){
        Intent intent = new Intent(this, cursos_dota2.class);
        startActivity(intent);

    }
}
