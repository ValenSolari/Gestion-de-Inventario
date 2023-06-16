package com.example.demo4.Clases;

import com.example.demo4.collections.Productos;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;

public final class Manager {
    private static Productos productos=new Productos();
    private static  ArrayList<Persona> personas=new ArrayList<>();

    public  static <T> void saveToFile(String path,T t){
        ObjectMapper mapper=new ObjectMapper();
        try {
            File file=new File(path);
           // Boolean result=file.createNewFile();
            mapper.writeValue(file,t);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static void agregarProducto(Product product){productos.agregarProducto(product);}

    public static void agregarPersona(Persona persona){
        personas.add(persona);
    }

    public static <T> ArrayList<T> fileToList(String path, Class<T> t){
        try {
            File file=new File(path);
            ObjectMapper mapper=new ObjectMapper();
            return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(ArrayList.class,t));

        } catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }

    }



    public static ArrayList<Persona> getPersonas() {
        return personas;
    }

    public static void setPersonas(ArrayList<Persona> personas) {
        Manager.personas = personas;
    }

    public static Productos getProductos() {
        return productos;
    }

    public static void setProductos(Productos productos) {
        Manager.productos = productos;
    }
}
