package com.example.lista_de_tarefas_app.dao;

import com.example.lista_de_tarefas_app.model.Tag;

import java.util.List;

public interface DAOTag {

    void create(Tag tag);

    List<Tag> findAll();

    Tag find(String tagName);

    boolean delete(Tag tag);
}
