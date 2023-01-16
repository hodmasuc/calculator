package com.company.calculator.calculator;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.Objects;

public class MainController {
    // Global Vars
    String op;
    double value1 = 0;
    double value2 = 0;

    @FXML
    public Label result_lbl;
    @FXML
    public Label holder_lbl;

    @FXML
    public void handleOperation(ActionEvent event) {
        // Get Control value
        String data = ((MFXButton)event.getSource()).getText();
        if(!Objects.equals(data, op)){
            // Choice
            switch (data) {
                case "p" -> plusOP();
                case "s" -> subOP();
                case "m" -> multiOP();
                case "d" -> divideOP();
                case "ca" -> clearOP();
                case "eq" -> equalOP();
            }
        }
    }

    private void equalOP() {
            switch (op){
                case "p" -> AddValue();
                case "s" -> SubValue();
                case "m" -> MultiplyValue();
                case "d" -> DivideValue();

            }
    }

    private void DivideValue() {
        String rst = result_lbl.getText();
        value2 = Double.parseDouble(rst);
        double sum = value1 / value2;
        value2 = 0;
        value1 = 0;
        String pre = holder_lbl.getText();
        holder_lbl.setText(pre+rst);

        result_lbl.setText(String.valueOf(sum));
    }

    private void MultiplyValue() {
        String rst = result_lbl.getText();
        value2 = Double.parseDouble(rst);
        double sum = value1 * value2;
        value2 = 0;
        value1 = 0;
        String pre = holder_lbl.getText();
        holder_lbl.setText(pre+rst);

        result_lbl.setText(String.valueOf(sum));
    }

    private void SubValue() {
        String rst = result_lbl.getText();
        value2 = Double.parseDouble(rst);
        double sum = value1 - value2;
        value2 = 0;
        value1 = 0;
        String pre = holder_lbl.getText();
        holder_lbl.setText(pre+rst);
        result_lbl.setText(String.valueOf(sum));
    }

    private void AddValue() {
        // Value 2
        String rst = result_lbl.getText();
        value2 = Double.parseDouble(rst);
        double sum = value1 + value2;
        value2 = 0;
        value1 = 0;
        String pre = holder_lbl.getText();
        holder_lbl.setText(pre+rst);
        result_lbl.setText(String.valueOf(sum));
    }

    private void clearOP() {
        value1 = 0; value2 =0;
        result_lbl.setText("");
        holder_lbl.setText("");
    }

    private void divideOP() {
        //Set Operation
        op = "d";

        // Current value
        if(value1 == 0){
            String rst = result_lbl.getText();
            value1 = Double.parseDouble(rst);
            holder_lbl.setText(rst+"/");
            result_lbl.setText("");
        }else {
            holder_lbl.setText(value1+"/");
            result_lbl.setText("");
        }

    }

    private void multiOP() {
        //Set Operation
        op = "m";

        // Current value
        if(value1 == 0){
            String rst = result_lbl.getText();
            value1 = Double.parseDouble(rst);
            holder_lbl.setText(rst+"x");
            result_lbl.setText("");
        }else {
            holder_lbl.setText(value1+"x");
            result_lbl.setText("");
        }

    }

    private void subOP() {
        //Set Operation
        op = "s";
        // Current value
        if(value1 == 0){
            String rst = result_lbl.getText();
            value1 = Double.parseDouble(rst);
            holder_lbl.setText(rst+"-");
            result_lbl.setText("");
        }else {
            holder_lbl.setText(value1+"-");
            result_lbl.setText("");
        }

    }

    private void plusOP() {
        //Set Operation
        op = "p";
        // Current value
        if(value1 == 0){
            String rst = result_lbl.getText();
            value1 = Double.parseDouble(rst);
            holder_lbl.setText(rst+"+");
            result_lbl.setText("");
        }else {
            holder_lbl.setText(value1+"+");
            result_lbl.setText("");
        }


    }

    @FXML
    public void handleInput(ActionEvent event) {
        // Get Control value
        String data = ((MFXButton)event.getSource()).getText();
        String pre = result_lbl.getText();

        if(data.contains(".") && !pre.contains(".")){
            result_lbl.setText(pre+data);
        }
        if(!data.contains(".")){
            result_lbl.setText(pre+data);
        }


    }

}