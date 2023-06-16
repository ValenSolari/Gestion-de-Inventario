package com.example.demo4.Clases;

import java.time.LocalDate;

public class Product {
    private String nombre; //jamon 1kg
    private String fechaIngreso;
    private String marca;
    private String categoria;
    private Integer precioCompra;
    private Integer porcentajeDeVenta;
    private Integer precioDeVenta;
    private Integer stock;
    private String descripcion;

    ///region Constructor


    public Product(String fechaIngreso, String nombre, String marca, Integer precioCompra, Integer porcentajeDeVenta) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.porcentajeDeVenta = porcentajeDeVenta;
        this.precioDeVenta=precioCompra+precioCompra*porcentajeDeVenta;
    }

    public Product() {
    }

    ///endregion

    ///region Get and Set


    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPorcentajeDeVenta() {
        return porcentajeDeVenta;
    }

    public void setPorcentajeDeVenta(int porcentajeDeVenta) {
        this.porcentajeDeVenta = porcentajeDeVenta;
    }

    public Integer getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(Integer precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public Integer getStock() {
        return stock;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPorcentajeDeVenta(Integer porcentajeDeVenta) {
        this.porcentajeDeVenta = porcentajeDeVenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getGanancia(){
        return getPrecioDeVenta() - getPrecioCompra();
    }
    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Product{" +
                "nombre='" + nombre + '\'' +
                "fecha de ingreso= "+fechaIngreso+'\''+
                ", marca='" + marca + '\'' +
                ", precioCompra=" + precioCompra +
                ", porcentajeDeVenta=" + porcentajeDeVenta +
                '}';
    }

    ///endregion

}
