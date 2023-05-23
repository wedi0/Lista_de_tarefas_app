package com.example.lista_de_tarefas_app.mvp;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.lista_de_tarefas_app.model.Tarefa;

public interface MainContract {

    interface View{
        void showMessage(String message);
        Context getContext();
    }

    interface Presenter{
        void detach();
        void populateList(RecyclerView recyclerView);

        void deletTesk(Tarefa task);

        void updateList();
    }
        void openDetails();

        void openDetails(Tarefa task);



        void urgenteTesk(Tarefa task);




}
