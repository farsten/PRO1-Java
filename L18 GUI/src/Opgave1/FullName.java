package Opgave1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FullName extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private TextField txfFirstName = new TextField();
    private TextField txfLastName = new TextField();
    private TextField txfFullName = new TextField();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(true);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblFirstName = new Label("First name:");
        pane.add(lblFirstName, 0, 0);

        Label lblLastName = new Label("Last name:");
        pane.add(lblLastName, 2, 0);

        Label lblFullName = new Label("Full name:");
        pane.add(lblFullName, 0, 3);


        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfFirstName, 0, 1, 2, 1);

        pane.add(txfLastName, 2, 1, 1, 1);

        pane.add(txfFullName, 1, 3, 2, 1);

        // add a button to the pane (at col=1, row=1)
        Button combine = new Button("Combine");
        pane.add(combine, 0, 2, 3, 1);
        GridPane.setHalignment(combine, HPos.CENTER);
        combine.setOnAction(event -> this.combineAction());
    }

    private void combineAction() {
        String first = txfFirstName.getText().trim();
        String last = txfLastName.getText().trim();
        txfFullName.setText(first + " " + last);
    }
}
