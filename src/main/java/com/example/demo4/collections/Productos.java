package com.example.demo4.collections;

import com.example.demo4.Clases.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Comparator;

public class Productos {
    //private ArrayList<Product> productos;
    private ObservableList<Product> productos;

    public Productos() {
        this.productos = FXCollections.observableArrayList();
        //this.productos = new ArrayList<>();
    }

    public Productos(ObservableList<Product> productos) {
        this.productos = productos;
    }
    public void ordenarPorNombre(){
        productos.sort(Comparator.comparing(Product::getNombre));
    }
    public void ordenarPorPrecio(){
        productos.sort(Comparator.comparing(Product::getPrecioDeVenta));
    }
    public void ordenarPorStock(){
        productos.sort(Comparator.comparing(Product::getStock));

    }
    public void ordenarPorPrecioCompra(){
        productos.sort(Comparator.comparing(Product::getPrecioCompra));

    }
    public void ordenarPorGanancia(){
        productos.sort(Comparator.comparing(Product::getGanancia));

    }
    public void agregarProducto(Product product){
        productos.add(product);
      /* ObjectMapper mapper=new ObjectMapper();
        try {
            File file=new File("Productos.json");
            FileWriter writer=new FileWriter(file,true);
            //file.createNewFile();
            mapper.writeValue(writer,product);
        } catch (IOException e) {
            e.getStackTrace();
        }*/
    }

    public void mostrarProd(){
        for (Product p: productos
        ) {
            System.out.println(p);

        }
    }



    public ObservableList<Product> getProductos() {
        return productos;
    }

    public void setProductos(ObservableList<Product> productos) {
        this.productos = productos;
    }


}
