package Opgave2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import javax.swing.*;

public class NumberIncrements extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

   private final TextField txfNumber = new TextField();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblNumber = new Label("Number:");


        GridPane.setHalignment(txfNumber, HPos.CENTER);
        pane.add(lblNumber, 0, 0, 1, 2);

        pane.add(txfNumber, 1, 0, 1, 2);

        txfNumber.setPrefWidth(40);
        txfNumber.setAlignment(Pos.CENTER);
        // add a button to the pane (at col=2, row=1)
        Button btnIncrement = new Button("Inc");
        pane.add(btnIncrement, 2, 0);
        // connect a method to the button
        btnIncrement.setOnAction(event -> this.txfNumberIncrement());

        Button btnDecrement = new Button("Dec");
        pane.add(btnDecrement, 2, 1);

        // connect a method to the button
        btnDecrement.setOnAction(event -> this.txfNumberDecrement());

    }

    private void txfNumberIncrement() {
        int number = Integer.parseInt(txfNumber.getText().trim());
        txfNumber.setText(String.valueOf(number + 1));
    }

    private void txfNumberDecrement() {
        int number = Integer.parseInt(txfNumber.getText().trim());
        txfNumber.setText(String.valueOf(number - 1));
    }
}
