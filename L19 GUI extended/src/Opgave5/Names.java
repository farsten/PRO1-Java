package Opgave5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Names extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Boys and girls");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private final TextField txfName = new TextField();
    private final ArrayList<Person> boyNames = new ArrayList<>();
    private final ArrayList<Person> girlNames = new ArrayList<>();
    private final ListView<Person> lvwNames = new ListView();
    private final ToggleGroup boyAndGirlGroup = new ToggleGroup();
    private final RadioButton rbnBoy = new RadioButton("Boy");
    private final RadioButton rbnGirl = new RadioButton("Girl");

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        HBox radioButtonBox = new HBox(10);
        radioButtonBox.getChildren().addAll(rbnBoy, rbnGirl);
        pane.add(radioButtonBox, 1, 0, 2, 1);

        rbnBoy.setToggleGroup(boyAndGirlGroup);
        rbnGirl.setToggleGroup(boyAndGirlGroup);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 1);
        lvwNames.setPrefHeight(120);
        pane.add(lvwNames, 1, 1, 2, 3);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 4);
        pane.add(txfName, 1, 4, 2, 1);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 3, 4, 2, 1);

        btnAdd.setOnAction(event -> fillAction());

        rbnBoy.setOnAction(event -> updateListView());
        rbnGirl.setOnAction(event -> updateListView());

        rbnBoy.setSelected(true); // Default selection
    }

    private void fillAction() {
        String name = txfName.getText().trim();

        if (!name.isEmpty()) {
            if (rbnBoy.isSelected()) {
                boyNames.add(new Person(name));
            } else {
                girlNames.add(new Person(name));
            }
            updateListView();
            txfName.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add Boy");
            alert.setHeaderText("ERROR");
            alert.setContentText("Type the name of the boy");
            alert.showAndWait();

        }
    }

    public void updateListView() {
        if (rbnBoy.isSelected()) {
            lvwNames.getItems().setAll(boyNames);
        } else {
            lvwNames.getItems().setAll(girlNames);
        }
    }
}




