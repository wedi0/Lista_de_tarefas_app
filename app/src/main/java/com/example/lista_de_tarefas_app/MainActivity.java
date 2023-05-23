package com.example.lista_de_tarefas_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lista_de_tarefas_app.mvp.MainContract;

public class MainActivity extends AppCompatActivity implements MainContract{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}