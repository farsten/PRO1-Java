package Opgave3;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class Investment extends Application {
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
    private TextField txfInvestment = new TextField();
    private TextField txfYears = new TextField();
    private TextField txfYearlyInterest = new TextField();
    private TextField txfFutureValue = new TextField();


    private void initContent(GridPane pane) {

        // show or hide grid lines
//        pane.setGridLinesVisible(true);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);

        pane.setVgap(10);

        Label lblInvestment = new Label("Investment:");
        pane.add(lblInvestment, 0, 0);

        Label lblYears = new Label("Years:");
        pane.add(lblYears, 0, 1);

        Label lblYearlyInterest = new Label("Yearly interest (%):");
        pane.add(lblYearlyInterest, 0, 2);

        Label lblFutureValue = new Label("Future value:");
        pane.add(lblFutureValue, 0, 4);

        pane.add(txfInvestment, 1, 0);
        pane.add(txfYears, 1, 1);

        pane.add(txfYearlyInterest, 1, 2);

        pane.add(txfFutureValue, 1, 4);

        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 1, 3);
        GridPane.setHalignment(btnCalculate, HPos.CENTER);
        GridPane.setMargin(btnCalculate, new Insets(5, 10, 5, 10));

        btnCalculate.setOnAction(event -> this.calculateAction());
    }

    public void calculateAction() {
        double investment = Integer.parseInt(txfInvestment.getText().trim());
        int years = Integer.parseInt(txfYears.getText().trim());
        double yearlyInterest = Integer.parseInt(txfYearlyInterest.getText().trim());

        txfFutureValue.setText(String.valueOf(investment * (Math.pow((yearlyInterest / 100) + 1, years))));


    }


}
