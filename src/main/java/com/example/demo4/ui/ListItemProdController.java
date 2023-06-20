package com.example.demo4.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ListItemProdController {
    @FXML
    private Label nombre,marca,categora,precioCompra,precioVenta,fecha,stock,descripcion;
    @FXML
    private ImageView imageView;
    public void initialize() {
        //Image image = new Image("/resources/product-icon.jpg");
        //imageView.setImage(image);
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
}
