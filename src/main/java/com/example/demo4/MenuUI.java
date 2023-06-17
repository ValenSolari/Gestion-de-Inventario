package com.example.demo4;

import com.example.demo4.Clases.Manager;
import com.example.demo4.Clases.Product;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuUI {
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
    private static final String COLOR_SELECTED="#ADCFA3";
    private static final String COLOR_UNSELECTED="#91BF9D";
    @FXML
    private Label productLabel,personLabel,salesLabel,homeLabel;
    @FXML
    private ListView<Product> listView;
    @FXML
    private Stage addProdForm;
    private Scene scene;


    //salesLabel,personLabel;
    public MenuUI() {
        //changeLabelSelected(homeLabel);
       // homeLabel.getId();


    }
    @FXML
    public void initialize(){
        labelSelected=homeLabel;
        paneSelected=homePane;
        changeSelection(homeLabel,homePane);

        //FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("list-item-prod.fxml"));
        //ListView<Product> listView = new ListView<>();
       // ObservableList<Product>data= FXCollections.observableList(Manager.getProductos().getProductos());

        /*data.addListener(new ListChangeListener<Product>() {
            @Override
            public void onChanged(Change<? extends Product> change) {
                System.out.println("CDcd");
                listView.refresh();
            }
        });*/
       // SimpleListProperty<Product> listProperty = new SimpleListProperty<>(data);

        listView.setItems(Manager.getProductos().getProductos());


        listView.setCellFactory(param->new CustomListItem());

        //listView.getItems().addAll(data);

        listView.setFocusTraversable(false);
    }

    @FXML
    protected void onProductBottonClick(){
        showPanel(2);
        changeSelection(productLabel,productPane);
    }
    @FXML
    protected void onPersonButtonClick(){
        showPanel(2);
        changeSelection(personLabel,personPane);
    }
    @FXML
    protected void onSalesButtonClick(){
        showPanel(2);
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

}
