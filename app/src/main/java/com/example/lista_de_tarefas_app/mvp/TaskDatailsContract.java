package com.example.lista_de_tarefas_app.mvp;

import android.os.Bundle;

public interface TaskDatailsContract {

    interface View{

        void close();

        Bundle getBundle();

        void updateUI(String titulo);

        void showToast(String message);


    }

    interface Presenter{

        void deatach();

        void verifyUpdate();

        void saveTesk (String titulo);
    }

}
