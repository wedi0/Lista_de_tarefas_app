package com.example.lista_de_tarefas_app.presenter;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.lista_de_tarefas_app.model.Tarefa;
import com.example.lista_de_tarefas_app.mvp.MainContract;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private Tarefa tarefa;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public MainPresenter(MainContract.View view){
        this.view = view;
        tarefa = Tarefa.getInstance();
    }

    @Override
    public void detach() {
        this.view = null;
    }

    @Override
    public void tarefa(String titulo, String descricao) {
        view.showMessage("Tarefa criada com sucesso");
    }
}
