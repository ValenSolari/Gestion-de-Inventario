package com.example.demo4.ui;

import com.example.demo4.Clases.*;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Arrays;

public class AgregarPersonaController {

    @FXML
        private Button cancel;
        @FXML
        private TextField txtNombre,txt_apellido,txt_edad,txt_email,txt_direccion,txt_dni,txt_salario;
        @FXML
        private DatePicker datePicker;
        @FXML
        private ChoiceBox<Rol> menupickerRol;

        @FXML
        public void initialize(){
            menupickerRol.setItems(FXCollections.observableList(Arrays.stream(Rol.values()).toList()));

        }

        public void closeForm(){
            Stage stage= (Stage) cancel.getScene().getWindow();
            stage.close();
        }
        public void onClickButtonAdd()
        {
           Empleado empleado =new Empleado(txt_dni.getText(),txtNombre.getText(),txt_apellido.getText(),Integer.parseInt(txt_edad.getText())
                   ,txt_direccion.getText(),txt_email.getText(),Integer.parseInt(txt_salario.getText()),0,menupickerRol.getValue(),datePicker.getValue().toString());
            Manager.agregarEmpleado(empleado);
            Manager.saveToFile("empleados.json",Manager.getEmpleados().getList());
            //closeForm();
        }




    }
