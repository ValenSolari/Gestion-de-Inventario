package com.example.demo4;

import com.example.demo4.Clases.Manager;
import com.example.demo4.Clases.Persona;
import com.example.demo4.Clases.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       // Manager.getProductos().setProductos(Manager.fileToList("productos.json", Product.class));
        Manager.getProductos().setProductos(FXCollections.observableList(Objects.requireNonNull(Manager.fileToList("productos.json", Product.class))));
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuUI.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 850, 550);
        stage.setTitle("Gestor de inventario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}