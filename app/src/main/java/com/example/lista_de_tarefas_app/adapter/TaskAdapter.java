package com.example.lista_de_tarefas_app.adapter;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lista_de_tarefas_app.MainActivity;
import com.example.lista_de_tarefas_app.R;
import com.example.lista_de_tarefas_app.model.Tarefa;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private List<Tarefa> tarefas;
    private MainActivity activity;

    public TaskAdapter(MainActivity activity){
        this.activity = activity;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.task_layout, parent, false);
        return new ViewHolder(itemView);

    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onBindViewHolder(ViewHolder holder, int position){
        Tarefa tarefa = tarefas.get(position);
        holder.taskView.setText(tarefa.getTitulo());

    }

    public int getItemCount(){
        return tarefas.size();
    }

    private boolean toBoolean(int n ){
        return n!=0;
    }

    public void setTask(List<Tarefa> taskList){
        this.tarefas = taskList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout task;
        TextView taskView;

        ViewHolder(View view){
            super(view);

            task= view.findViewById(R.id.linearLayout);
            taskView = view.findViewById(R.id.textViewTask);
        }

    }
}
