package com.example.lista_de_tarefas_app.model;

public class Tag {
    private String tagTitle;

    public Tag(String tagTitle){
        this.tagTitle = tagTitle;

    }

    public String getTitleTag() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle;
    }
}
