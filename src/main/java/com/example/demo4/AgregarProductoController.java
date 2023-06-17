package com.example.demo4;

import com.example.demo4.Clases.CategoriasProductos;
import com.example.demo4.Clases.Manager;
import com.example.demo4.Clases.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Arrays;

public class AgregarProductoController {

    @FXML
    private Button cancel;
    @FXML
    private TextField txtNombre,txt_marca,txt_stock,txt_costo,txt_venta;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextArea txtDescription;
    @FXML
    private ChoiceBox<CategoriasProductos> menupickerCategory;

    @FXML
    public void initialize(){
        menupickerCategory.setItems(FXCollections.observableList(Arrays.stream(CategoriasProductos.values()).toList()));

    }

    public void closeForm(){
        Stage stage= (Stage) cancel.getScene().getWindow();
        stage.close();
    }
    public void onClickButtonAdd()
    {
        Product product=new Product(txtNombre.getText(),datePicker.getValue().toString(),txt_marca.getText(),menupickerCategory.getValue(),
                Integer.parseInt(txt_costo.getText()),Integer.parseInt(txt_venta.getText()),Integer.parseInt(txt_stock.getText()),
                txtDescription.getText());
        Manager.agregarProducto(product);
        Manager.saveToFile("productos.json",Manager.getProductos().getProductos());
        closeForm();
    }

}
