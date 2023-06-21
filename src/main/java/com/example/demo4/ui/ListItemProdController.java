package com.example.demo4.ui;

import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;

public class ListItemProdController {
    @FXML
    private Label nombre,marca,categora,precioCompra,precioVenta,fecha,stock,descripcion;
    @FXML
    private ImageView imageView;
    @FXML
    private Spinner<Integer> spinnerCantidad;
    private Integer cantidadStock=0;
    private SpinnerValueFactory<Integer> valueFactory;
    private ObservableValue<Boolean> agregarPedidoActivo;
    private Integer cantidadPedida;
    private Integer idProducto;

    public void initialize() {


    }

    public void setNombre(String nombre) {
        this.nombre.setText(nombre);
    }
    public void setMarca(String marca) {
        this.marca.setText(marca);
    }

    public void setCategora(String categora) {
        this.categora.setText(categora);
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra.setText(precioCompra);
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta.setText(precioVenta);
    }

    public void setFecha(String fecha) {
        this.fecha.setText(fecha);
    }

    public void setStock(String stock) {
        this.stock.setText(stock);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.setText(descripcion);
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
        valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,cantidadStock,0);
        spinnerCantidad.setValueFactory(valueFactory);
    }

    public Spinner<Integer> getSpinnerCantidad() {
        return spinnerCantidad;
    }

    public void setSpinnerCantidad(Spinner<Integer> spinnerCantidad) {
        this.spinnerCantidad = spinnerCantidad;
    }

    public Integer getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(Integer cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
