package Clases;

import java.time.LocalDate;

public class Despensa extends Product {
    private Integer stockUnidad;
    private LocalDate fechaDeCaducidad;
    private Integer sector;


    ///region Constructor


    public Despensa( String nombre,LocalDate fechaIngreso, String marca, Integer precioCompra,
                    Integer porcentajeDeVenta, Integer stockUnidad, LocalDate fechaDeCaducidad, Integer sector) {
        super(fechaIngreso, nombre, marca, precioCompra, porcentajeDeVenta);
        this.stockUnidad = stockUnidad;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.sector = sector;
    }

    public Despensa(Integer stockUnidad, LocalDate fechaDeCaducidad, Integer sector) {
        stockUnidad = stockUnidad;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.sector = sector;
    }

    public Despensa() {
    }
    ///endregion

    ///region Get and set

    public Integer getStockUnidad() {
        return stockUnidad;
    }

    public void setStockUnidad(Integer stockUnidad) {
        stockUnidad = stockUnidad;
    }

    public LocalDate getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public Integer getSector() {
        return sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }


    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Despensa{" +
                "StockUnidad=" + stockUnidad +
                ", fechaDeCaducidad=" + fechaDeCaducidad +
                ", sector=" + sector +
                "} " + super.toString();
    }


    ///endregion

}
