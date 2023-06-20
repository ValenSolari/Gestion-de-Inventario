package com.example.demo4.Clases;

import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Pedido> pedidos;
    private Integer saldo;
    private Boolean activo;

    public Cliente(String dni, String nombre, String apellido, Integer edad, String direccion, String email,
                   ArrayList<Pedido> pedidos, Integer saldo, Boolean activo) {
        super(dni, nombre, apellido, edad, direccion, email);
        this.pedidos = pedidos;
        this.saldo = saldo;
        this.activo = activo;
    }

    public Cliente() {
    }
}
