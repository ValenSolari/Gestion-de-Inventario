package Clases;

import java.time.LocalDate;

public class Product {
    private String nombre;
    private LocalDate fechaIngreso;
    private String marca;
    private Integer precioCompra;
    private Integer porcentajeDeVenta;


    ///region Constructor


    public Product(LocalDate fechaIngreso, String nombre, String marca, Integer precioCompra, Integer porcentajeDeVenta) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.porcentajeDeVenta = porcentajeDeVenta;
    }

    public Product() {
    }

    ///endregion

    ///region Get and Set


    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
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
