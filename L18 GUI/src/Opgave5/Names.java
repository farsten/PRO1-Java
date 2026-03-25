
package Opgave5;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Names extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 5");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfName = new TextField();
    private final TextArea txaNames = new TextArea();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 0, 1, 3, 1);


        Button btnAddName = new Button("Add");
        pane.add(btnAddName, 2, 2);
        GridPane.setHalignment(btnAddName, HPos.CENTER);

        pane.add(txaNames, 0, 3, 3, 1);
        btnAddName.setOnAction(event -> addNameAction());
    }
        public void addNameAction() {
            String name = txfName.getText().trim();
            if (!name.isEmpty()) {
                txaNames.appendText(name + "\n");
                txfName.clear();
            }
        }
    }


