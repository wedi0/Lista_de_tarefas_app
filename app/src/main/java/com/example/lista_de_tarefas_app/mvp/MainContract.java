package com.example.lista_de_tarefas_app.mvp;

import android.content.Context;

public interface MainContract {

    interface View{
        void showMessage(String message);
        Context getContext();
    }

    interface Presenter{
        void detach();

        void tarefa(String titulo, String descricao);

    }


}
