package Opgave3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PersonGUIExtendeded extends Application {
    private final ListView<PersonExtendeded> lvwNames = new ListView<>();
    private final Button btnAddPerson = new Button("Add Person");
    private final ArrayList<PersonExtendeded> names = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        stage.setTitle("(Old) Person GUI");
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

        // Persons ListView
        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 0);
        lvwNames.setPrefHeight(120);
        pane.add(lvwNames, 0, 1, 2, 3);

        // Add Person Button
        pane.add(btnAddPerson, 0, 4);
        btnAddPerson.setOnAction(event -> this.fillAction());
    }

    private void fillAction() {
        InputDialog inputDialog = new InputDialog("Add Person", (Stage) btnAddPerson.getScene().getWindow());
        inputDialog.showAndWait();

        String name = inputDialog.getTxfName().getText().trim();
        String title = inputDialog.getTxfTitle().getText().trim();
        boolean isSenior = inputDialog.getChkSenior().isSelected();

        if (inputDialog.getIsAddClicked()) {
            if (!name.isEmpty() && !title.isEmpty()) {
                names.add(new PersonExtendeded(name, title, isSenior));
                lvwNames.getItems().setAll(names);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Add Person");
                alert.setHeaderText("No name or title");
                alert.setContentText("Please type both name and title of the person");
                alert.showAndWait();

            }
        }
    }
}
