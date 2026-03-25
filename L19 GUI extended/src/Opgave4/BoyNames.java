package Opgave4;

import com.sun.scenario.effect.impl.state.PerspectiveTransformState;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BoyNames extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Boys");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private final TextField txfName = new TextField();
    private final ArrayList<Person> BoyNames = new ArrayList<>();
    private final ListView<Person> lvwBoyNames = new ListView();

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);


        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        lvwBoyNames.setPrefHeight(120);
        pane.add(lvwBoyNames, 1, 0, 2, 3);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 3);
        pane.add(txfName, 1, 3, 2, 1);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 3, 3, 2, 1);

        btnAdd.setOnAction(event -> fillAction());

    }
    private void fillAction() {
        String name = txfName.getText().trim();

            if (!name.isEmpty()) {
                BoyNames.add(new Person(name));
                lvwBoyNames.getItems().setAll(BoyNames);
                txfName.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Add Boy");
                alert.setHeaderText("ERROR");
                alert.setContentText("Type the name of the boy");
                alert.showAndWait();

            }
        }
    }




