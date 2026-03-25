package Opgave4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CelsiusFahrenheit extends Application {
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

    private final TextField txfCelsiusInput = new TextField();
    private final TextField txfFahrenheitInput = new TextField();
    private final TextField txfCelsiusConverted = new TextField();
    private final TextField txfFahrenheitConverted = new TextField();

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);


        Label lblCelsius = new Label("Celsius:");

        pane.add(lblCelsius, 0, 0, 1, 1);

        Label lblFahrenheit = new Label("Fahrenheit:");

        pane.add(lblFahrenheit, 2, 0, 1, 1);

        Label lblCelsiusConverted = new Label("In celsius:");

        pane.add(lblCelsiusConverted, 2, 2, 1, 1);

        Label lblFahrenheitConverted = new Label("In fahrenheit:");

        pane.add(lblFahrenheitConverted, 0, 2, 1, 1);

        pane.add(txfCelsiusInput, 0, 1);
        pane.add(txfFahrenheitInput, 2, 1);

        pane.add(txfCelsiusConverted, 2, 3);

        pane.add(txfFahrenheitConverted, 0, 3);


        Button btnConvert = new Button("Convert");
        pane.add(btnConvert, 1, 1);

        btnConvert.setOnAction(event -> convertAction());

    }

    public void convertAction() {
        String celsiusText = txfCelsiusInput.getText().trim();
        String fahrenheitText = txfFahrenheitInput.getText().trim();

        if (!celsiusText.isEmpty()) {
            double celsiusInput = Double.parseDouble(celsiusText);
            txfFahrenheitConverted.setText(String.valueOf(9.0 / 5 * celsiusInput + 32));
        }
        if (!fahrenheitText.isEmpty()) {
            double fahrenheitInput = Double.parseDouble(fahrenheitText);
            txfCelsiusConverted.setText(String.valueOf((fahrenheitInput - 32) / 1.8));
        }
    }

}



