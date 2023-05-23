package com.example.lista_de_tarefas_app.dao;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.lista_de_tarefas_app.model.Tag;
import com.example.lista_de_tarefas_app.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class SingletonTarefa implements DAOTarefa {

    private static SingletonTarefa instance = null;
    private List<Tarefa> dataset;


    private SingletonTarefa() {
        dataset = new ArrayList<>();
    }

    public static SingletonTarefa getInstance(){
        if(instance == null)
            instance = new SingletonTarefa();
        return instance;
    }

    @Override
    public void create(Tarefa task) {
        if(!(task == null)){
            dataset.add(task);
        }
    }

    @Override
    public boolean delete(Tarefa task) {
        return dataset.remove(task);
    }

    @Override
    public boolean update(String oldName, Tarefa tesk) {
        return false;
    }

    @Override
    public List<Tarefa> findAll() {
        return dataset;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public List<Tarefa> findByTag(Tarefa tag) {
        List<Tarefa> selection = new ArrayList<>();
        for(Tarefa t : dataset){
            for(Tag ta : t.getTags()){
                if(ta.getTitleTag().equals(tag.getTitulo())){
                    selection.add(t);
                }
            }
        }
        return selection;
    }

    @Override
    public Tarefa findByName(String name) {
        return null;
    }
}
