package com.example.demo4.Clases;

import com.example.demo4.collections.Personas;
import com.example.demo4.collections.Productos;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.util.ArrayList;

public final class Manager {
    private static Productos productos=new Productos();
    private static Personas<Empleado> empleados=new Personas<>();
    private static Personas<Cliente> clientes=new Personas<>();

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
    public static void saveToFile(String path,ArrayList<Product> products){
        ObjectMapper mapper=new ObjectMapper();
        try {
            File file=new File(path);
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            // Boolean result=file.createNewFile();
            mapper.writeValue(file,products);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static void agregarProducto(Product product){
        Manager.productos.agregarProducto(product);
        //Manager.productos.mostrarProd();
        System.out.println(Manager.getProductos().getProductos().toString());
       // saveToFile("productos.json",Manager.getProductos().getProductos());
    }

    public static void agregarEmpleado(Empleado empleado){
        empleados.agregarItem(empleado);
    }
    public static void agregarCliente(Cliente cliente){
        clientes.agregarItem(cliente);
    }
    public static <T> ArrayList<T> fileToList(String path, Class<T> t){
        try {
            File file=new File(path);
            ObjectMapper mapper=new ObjectMapper();
            return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(ArrayList.class,t));

        } catch (IOException e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static Personas<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(Personas<Empleado> empleados) {
        Manager.empleados = empleados;
    }

    public static Personas<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(Personas<Cliente> clientes) {
        Manager.clientes = clientes;
    }

    public static Productos getProductos() {
        return productos;
    }

    public static void setProductos(Productos productos) {
        Manager.productos = productos;
    }
}
