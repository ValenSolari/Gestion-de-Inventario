package com.example.demo4.Clases;

import java.util.ArrayList;

public class Pedido {
    private Integer id;
    private ArrayList<Product> products;
    private String fecha;
    private String valor;
    private String  dniCliente;
    private String metodoDePago;

    public Pedido(ArrayList<Product> products, String fecha, String valor, String dniCliente, String metodoDePago) {
        this.products = products;
        this.fecha = fecha;
        this.valor = valor;
        this.dniCliente = dniCliente;
        this.metodoDePago = metodoDePago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
