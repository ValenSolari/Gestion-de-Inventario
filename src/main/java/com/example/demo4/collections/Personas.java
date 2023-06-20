package com.example.demo4.collections;


import com.example.demo4.Clases.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Personas <T extends Persona>{
    private ObservableList<T> list;

    public Personas() {
        this.list = FXCollections.observableArrayList();
    }

    public void agregarItem(T t){
        list.add(t);
    }
    public Persona buscarItemDNI(String dni){
        return list.stream().filter(p->p.getDni().equals(dni)).findFirst().get();
    }
    public ArrayList<T> buscarItemsNombre(String nombre){
       /* ArrayList<Persona> match=new ArrayList<>();
        for (Map.Entry<String,Persona> entry: personas.entrySet()){
            if(entry.getValue().getNombre().contains(nombre)){
                match.add(entry.getValue());
            }
        }
        return match;*/
        return null;
    }

    private void eliminarItem(String dni){
        list.remove(dni);
    }

    public ObservableList<T> getList() {
        return list;
    }

    public void setList(ObservableList<T> list) {
        this.list = list;
    }
/*
    public ArrayList<Persona> toList(){
        ArrayList<Persona> arrayList=new ArrayList<>();
        for (Map.Entry<String,Persona> entry: personas.entrySet()){
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }*/
}
