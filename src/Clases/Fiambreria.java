package Clases;

import java.time.LocalDate;

public class Fiambreria extends Product{
    private Integer StockXGramo;
    private String variedad;


    ///region Constructor

    public Fiambreria(String nombre, LocalDate fechaIngreso, String marca, Integer precioCompra,
                      Integer porcentajeDeVenta, Integer stockXGramo, String variedad) {
        super(fechaIngreso, nombre, marca, precioCompra, porcentajeDeVenta);
        StockXGramo = stockXGramo;
        this.variedad = variedad;
    }

    public Fiambreria(Integer stockXGramo, String variedad) {
        StockXGramo = stockXGramo;
        this.variedad = variedad;
    }

    public Fiambreria() {
    }
    ///endregion

    ///region Get and Set

    public Integer getStockXGramo() {
        return StockXGramo;
    }

    public void setStockXGramo(Integer stockXGramo) {
        StockXGramo = stockXGramo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Fiambreria{" +
                "StockXGramo=" + StockXGramo +
                ", variedad='" + variedad + '\'' +
                "} " + super.toString();
    }


    ///endregion


}
