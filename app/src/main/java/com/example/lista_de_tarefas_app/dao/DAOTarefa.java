package com.example.lista_de_tarefas_app.dao;

import com.example.lista_de_tarefas_app.model.Tarefa;

import java.util.List;

public interface DAOTarefa {

    void create(Tarefa  task);

    boolean delete(Tarefa  task);

    boolean update(String oldName, Tarefa  tesk);

    List<Tarefa > findAll();

    List<Tarefa > findByTag(Tarefa  tag);

    Tarefa findByName(String name);


}
