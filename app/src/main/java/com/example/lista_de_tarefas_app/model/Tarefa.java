package com.example.lista_de_tarefas_app.model;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;


@RequiresApi(api = Build.VERSION_CODES.O)
public class Tarefa {

    private static Tarefa instance = null;
    private String titulo;
    private String descricao;
    private LocalDate data_criacao = LocalDate.now();

    private Boolean prioridade = false;

    //Constructor
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;

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


    public Boolean getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Boolean prioridade) {
        this.prioridade = prioridade;
    }
}
