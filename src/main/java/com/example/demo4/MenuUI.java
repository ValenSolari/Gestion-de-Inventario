package com.example.demo4;

import javafx.application.Application;
import javafx.beans.DefaultProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MenuUI {
    private Label labelSelected;
    private static final Integer FONT_SIZE_ITEM_SELECTED=18;
    private static final Integer FONT_SIZE_ITEM_UNSELECTED=14;

    @FXML
    private GridPane gridPane;
    @FXML
    private StackPane stackPane;
    @FXML
    private Label productLabel;
    @FXML
    private Label homeLabel;

    //salesLabel,personLabel;
    public MenuUI() {
        //changeLabelSelected(homeLabel);
       // homeLabel.getId();


    }
    @FXML
    public void initialize(){
        labelSelected=homeLabel;
        changeLabelSelected(homeLabel);
    }

    @FXML
    protected void onProductBottonClick(){
        showPanel(2);
        changeLabelSelected(productLabel);
    }
    @FXML
    protected void onInicioCLick(){
        showPanel(1);
        changeLabelSelected(homeLabel);
    }
    private void changeLabelSelected(Label selection){
        labelSelected.setFont(new Font("SansSerif",FONT_SIZE_ITEM_UNSELECTED));
        labelSelected=selection;
        labelSelected.setFont(new Font("SansSerif",FONT_SIZE_ITEM_SELECTED));
    }
    private void showPanel(int panelIndex) {
        stackPane.getChildren().forEach(node -> node.setVisible(false));
        stackPane.getChildren().get(panelIndex - 1).setVisible(true);
    }
}
