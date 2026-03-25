package Opgave2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PersonGUIExtended extends Application {
    private PersonExtended person;
    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final ArrayList<PersonExtended> names = new ArrayList<>();
    private final ListView<PersonExtended> lvwNames = new ListView<>();
    private final CheckBox chkSenior = new CheckBox();
    private final Button btnCreate = new Button("Create");

    @Override
    public void start(Stage stage) {
        stage.setTitle("(Old) person GUI");
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

        // navn input
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0, 2, 1);

        // titel input
        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);
        pane.add(txfTitle, 1, 1, 2, 1);

        //checkbox for senior
        pane.add(chkSenior, 1, 2);
        Label lblSenior = new Label("Senior");
        pane.add(lblSenior, 2, 2);

        // knap for create
        pane.add(btnCreate, 3, 2);

        //Persons bruh
        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 4);
        lvwNames.setPrefHeight(120);
        pane.add(lvwNames, 1, 4, 2, 3);

        btnCreate.setOnAction(event -> this.createAction());
    }

    private void createAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean isSenior = chkSenior.isSelected();


        if (txfName.getText().isEmpty() || txfTitle.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("No name or title");
            alert.setContentText("Type both name and title of the person");
            alert.showAndWait();
        }

        if (!name.isEmpty() && !title.isEmpty()) {
            names.add(new PersonExtended(name, title, isSenior));

            lvwNames.getItems().setAll(names);
            txfName.clear();
            txfTitle.clear();
            chkSenior.setSelected(false);
        }
    }
}