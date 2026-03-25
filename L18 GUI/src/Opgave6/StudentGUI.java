package Opgave6;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentGUI extends Application {
    private Student student;
    private final TextField txfName = new TextField();
    private final TextField txfAge = new TextField();
    private final CheckBox chkActive = new CheckBox("Active");
    private final TextArea txaInfo = new TextArea();
    private final Button btnCreate = new Button("Create");
    private final Button btnUpdate = new Button("Update");
    private final Button btnDelete = new Button("Delete");
    private final Button btnInc = new Button("Inc");
    private final Button btnReset = new Button("Reset");

    @Override
    public void start(Stage stage) {
        stage.setTitle("Student GUI");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // textarea for deres info
        txaInfo.setEditable(false);
        txaInfo.setPrefHeight(80);
        txaInfo.setPrefWidth(250);
        pane.add(txaInfo, 0, 0, 3, 1);

        // navn input
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 1);
        pane.add(txfName, 1, 1, 2, 1);

        // alder input
        Label lblAge = new Label("Age:");
        pane.add(lblAge, 0, 2);
        pane.add(txfAge, 1, 2);

        pane.add(chkActive, 2, 2);

        //knapper
        pane.add(btnCreate, 0, 3);
        pane.add(btnUpdate, 1, 3);
        pane.add(btnInc, 2, 3);
        pane.add(btnReset, 3, 3);
        pane.add(btnDelete, 4, 3);


        btnCreate.setOnAction(event -> this.createAction());
        btnUpdate.setOnAction(event -> this.updateAction());
        btnDelete.setOnAction(event -> this.deleteAction());
        btnInc.setOnAction(event -> this.incAction());
        btnReset.setOnAction(event -> this.resetAction());

        //disable knapper for at hjælpe brugeren
        btnUpdate.setDisable(true);
        btnDelete.setDisable(true);
        btnInc.setDisable(true);
        btnReset.setDisable(true);
    }

    private void createAction() {
        String name = txfName.getText().trim();
        String ageText = txfAge.getText().trim();
        boolean active = chkActive.isSelected();

        if (!name.isEmpty() && !ageText.isEmpty()) {
            int age = Integer.parseInt(ageText);
            student = new Student(name, age, active);
            txaInfo.setText(student.toString());
            btnCreate.setDisable(true);
            btnUpdate.setDisable(false);
            btnDelete.setDisable(false);
            btnInc.setDisable(false);
            btnReset.setDisable(false);
        }
    }

    private void updateAction() {
        if (student != null) {
            String name = txfName.getText().trim();
            String ageText = txfAge.getText().trim();
            boolean active = chkActive.isSelected();

            if (!name.isEmpty() && !ageText.isEmpty()) {
                int age = Integer.parseInt(ageText);
                student.setName(name);
                student.setAge(age);
                student.setActive(active);
                txaInfo.setText(student.toString());

                txfName.clear();
                txfAge.clear();
                chkActive.setSelected(false);
            }
        }
    }

    private void deleteAction() {
        student = null;
        txaInfo.clear();
        txfName.clear();
        txfAge.clear();
        chkActive.setSelected(false);
        btnCreate.setDisable(false);
        btnUpdate.setDisable(true);
        btnDelete.setDisable(true);
        btnInc.setDisable(true);
        btnReset.setDisable(true);
    }

    private void incAction() {
        if (student != null) {
            int age = student.getAge();
            student.setAge(age + 1);
            txaInfo.setText(student.toString());
        }
    }

    private void resetAction() {
        if (student != null) {
            txfName.setText(student.getName());
            txfAge.setText(String.valueOf(student.getAge()));
            chkActive.setSelected(student.isActive());
        }
    }
}