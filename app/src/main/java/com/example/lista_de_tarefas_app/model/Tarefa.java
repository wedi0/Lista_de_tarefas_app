package com.example.lista_de_tarefas_app.model;


import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RequiresApi(api = Build.VERSION_CODES.O)
public class Tarefa {

    private static Tarefa instance = null;
    private String titulo;
    private String descricao;
    private LocalDate data_criacao;

    private boolean prioridade;


    private List<Tag> tags;

    private void init(){
        tags = new ArrayList<>();
    }

    //Constructor
    public Tarefa(String titulo, String descricao, boolean favorite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = favorite;
        this.data_criacao = LocalDate.now();

    }

    public Tarefa(){}

    public static Tarefa getInstance(){
        if(instance == null){
            instance = new Tarefa();
        }
        return instance;
    }

    // Getter and setter methods
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }

    public void setUrgence(boolean favorite) {
        this.prioridade = favorite;
    }

    public boolean isUrgent() {
        return prioridade;
    }

    public Boolean getPrioridade() {
        return prioridade;
    }

    @NonNull
    @Override
    public String toString() {
        return "Title: " + titulo;
    }
    public void setPrioridade(Boolean prioridade) {
        this.prioridade = prioridade;
    }

    public void addTag(Tag tag){
        this.tags.add(tag);
    }

    public boolean removeTag(Tag tag){
        return this.tags.remove(tag);
    }

    public List<Tag> getTags(){
        return tags;
    }


}
