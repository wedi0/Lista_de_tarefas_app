package com.example.lista_de_tarefas_app.dao;

import com.example.lista_de_tarefas_app.model.Tag;

import java.util.ArrayList;
import java.util.List;

public class SingletonTag implements DAOTag{

    private static SingletonTag instance;
    private List<Tag> dataset;

    private SingletonTag(){
        dataset = new ArrayList<>();
    }

    public static SingletonTag getInstance(){
        if(instance == null)
            instance = new SingletonTag();
        return instance;
    }

    @Override
    public void create(Tag tag) {
        if(!(tag == null)){
            if(find(tag.getTitleTag() )== null){
                dataset.add(tag);
            }
        }
    }

    @Override
    public List<Tag> findAll() {
        return dataset;
    }

    @Override
    public Tag find(String tagName) {

        return dataset.stream()
                .filter(tag -> tag.getTitleTag().equals(tagName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean delete(Tag tag) {
        return dataset.remove(tag);
    }
}
