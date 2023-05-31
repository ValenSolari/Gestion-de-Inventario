package Clases;

import java.time.LocalDate;

public class Papeleria extends Product{

    private Integer stockPack;
    private Integer hojasXPack;

    ///region Constructor

    public Papeleria(String nombre, LocalDate fechaIngreso, String marca, Integer precioCompra,
                     Integer porcentajeDeVenta, Integer stockPack, Integer hojasXPack) {
        super(fechaIngreso, nombre, marca, precioCompra, porcentajeDeVenta);
        this.stockPack = stockPack;
        this.hojasXPack = hojasXPack;
    }

    public Papeleria(Integer stockPack, Integer hojasXPack) {
        this.stockPack = stockPack;
        this.hojasXPack = hojasXPack;
    }

    public Papeleria() {
    }
    ///endregion

    ///region Get and set

    public Integer getStockPack() {
        return stockPack;
    }

    public void setStockPack(Integer stockPack) {
        this.stockPack = stockPack;
    }

    public Integer getHojasXPack() {
        return hojasXPack;
    }

    public void setHojasXPack(Integer hojasXPack) {
        this.hojasXPack = hojasXPack;
    }


    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Papeleria{" +
                "stockPack=" + stockPack +
                ", hojasXPack=" + hojasXPack +
                "} " + super.toString();
    }


    ///endregion
}
