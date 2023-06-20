package com.example.demo4.ui;

import com.example.demo4.Clases.*;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuUI{
    private Label labelSelected;
    private static final Font FONT_ITEM_SELECTED=new Font("SansSerif",18);
    private static final Font FONT_ITEM_UNSELECTED=new Font("SansSerif",14);
   // private static final Background COLO_ITEM_UNSELECTED=new Background(new BackgroundFill());
  //  private static final Font FONT_ITEM_UNSELECTED=new Font("SansSerif",14);

    @FXML
    private GridPane gridPane;
    @FXML
    private StackPane stackPane;
    @FXML
    private Pane homePane,paneSelected,personPane,salesPane,productPane;
    @FXML
    private SplitMenuButton splitMenuButton;
    @FXML
    private MenuItem agregarCliente,agregarEmpleado;
    private static final String COLOR_SELECTED="#ADCFA3";
    private static final String COLOR_UNSELECTED="#91BF9D";
    @FXML
    private Label productLabel,personLabel,salesLabel,homeLabel;
    @FXML
    private ListView<Product> listViewProd;
    @FXML
    private ListView<Persona> listViewPers;
    @FXML
    private TextField buscadorProd,buscadorPers;


    //salesLabel,personLabel;
    public MenuUI() {
        //changeLabelSelected(homeLabel);
       // homeLabel.getId();


    }

    @FXML
    protected void onProductBottonClick(){
        showPanel(2);
        changeSelection(productLabel,productPane);

    }
    @FXML
    protected void onPersonButtonClick(){
        showPanel(3);
        changeSelection(personLabel,personPane);
    }
    @FXML
    protected void onSalesButtonClick(){
        showPanel(4);
        changeSelection(salesLabel,salesPane);
    }
    @FXML
    protected void onAddProductButton() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("agregar-producto.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.setTitle("Agregar producto");
            stage.showAndWait();
        }catch (IOException e){e.printStackTrace();}

    }
    public void onAddPersonButton(String path,String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(path));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.showAndWait();
        }catch (IOException e){e.printStackTrace();}

    }
    @FXML
    protected void onInicioCLick(){
        showPanel(1);
        changeSelection(homeLabel,homePane);
    }
    private void changeSelection(Label selection,Pane pane){
        paneSelected.setStyle("-fx-background-color: "+MenuUI.COLOR_UNSELECTED+";");
        labelSelected.setFont(FONT_ITEM_UNSELECTED);
        labelSelected=selection;
        labelSelected.setFont(FONT_ITEM_SELECTED);
        paneSelected=pane;
        paneSelected.setStyle("-fx-background-color: "+MenuUI.COLOR_SELECTED+";");
    }
    private void showPanel(int panelIndex) {
        stackPane.getChildren().forEach(node -> node.setVisible(false));
        stackPane.getChildren().get(panelIndex - 1).setVisible(true);
    }


    public void initialize() {

        labelSelected=homeLabel;

        paneSelected=homePane;
        changeSelection(homeLabel,homePane);

        cargarListViewProd();
        cargarListViewPers();
        buscador(buscadorProd,Manager.getInstance().getProductos(),listViewProd);
        buscador(buscadorPers,Manager.getInstance(),listViewPers);
        //buscador(buscadorPers,Manager.getEmpleados(),listViewPers);

        splitMenuButton.setOnAction(e-> splitMenuButton.show());
        agregarEmpleado.setOnAction(e->onAddPersonButton("agregar-empleado.fxml","Agregar empleado"));
        agregarCliente.setOnAction(e->onAddPersonButton("agregar-cliente.fxml","Agregar cliente"));
        Parent parent=homeLabel.getParent();

        Manager.getInstance().getEmpleados().getList().addListener(new ListChangeListener<Empleado>() {
            @Override
            public void onChanged(Change<? extends Empleado> change) {
                cargarListViewPers();
            }
        });
        Manager.getInstance().getClientes().getList().addListener(new ListChangeListener<Cliente>() {
            @Override
            public void onChanged(Change<? extends Cliente> change) {
                cargarListViewPers();
            }
        });
    }

    private void cargarListViewProd(){
        listViewProd.setItems(Manager.getInstance().getProductos().getProductos());
        listViewProd.setCellFactory(param->new ListItemProdAdapter());
        listViewProd.setFocusTraversable(false);
    }
    private void cargarListViewPers(){
        listViewPers.getItems().clear();
        listViewPers.getItems().addAll(Manager.getInstance().getClientes().getList());
        listViewPers.getItems().addAll(Manager.getInstance().getEmpleados().getList());
        listViewPers.setCellFactory(param->new ListItemPersAdapter());
        listViewPers.setFocusTraversable(false);
    }

    private <T>void buscador(TextField field,DatosBuscador<T> buscador,ListView<T> listView){
        field.textProperty().addListener((observable, oldValue, newValue) -> {
            listView.setItems(buscador.buscar(newValue));
        });
        listViewProd.setFocusTraversable(false);
    }
}
