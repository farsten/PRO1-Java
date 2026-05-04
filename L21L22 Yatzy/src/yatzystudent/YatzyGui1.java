package src.yatzystudent;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class YatzyGui1 extends Application {
    private YatzyDice1 dice = new YatzyDice1();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        // stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // txfValues shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // cbxHolds shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // txfResults shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final ArrayList<TextField> txfResults = new ArrayList<>(15);
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField();
    private final TextField txfBonus = new TextField();
    private final TextField txfSumOther = new TextField();
    private final TextField txfTotal = new TextField();

    private final Label lblThrowCount = new Label();
    private final Button btnThrow = new Button(" Throw ");

    private final String[] categoryLabels = {
            "One Pair", "Two Pair", "Three of a Kind", "Four of a Kind",
            "Full House", "Small Straight", "Large Straight", "Chance", "Yatzy"
    };

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------
        // dicePane

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
            txfValues[i].setPrefWidth(50);
            txfValues[i].setPrefHeight(50);
            txfValues[i].setEditable(false);
            txfValues[i].setFocusTraversable(false);
            txfValues[i].setDisable(true);
            dicePane.add(txfValues[i], i, 0, 1, 1);

            cbxHolds[i] = new CheckBox();
            cbxHolds[i].setFocusTraversable(false);
            dicePane.add(cbxHolds[i], i, 1);
            Label lblHold = new Label("Hold");
            dicePane.add(lblHold, i, 2, 1, 1);
        }

        // add lblThrowCount and btnThrow
        btnThrow.setText("Throw " + (dice.getThrowCount() + 1));
        dicePane.add(btnThrow, 0, 3, txfValues.length, 1);
        btnThrow.setFocusTraversable(false);
        GridPane.setHalignment(btnThrow, HPos.RIGHT);

        // ---------------------------------------------------------------------
        // scorePane

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int width = 50; // width of the text fields

        // add labels for results
        // add txfResults
        for (int i = 0; i < 6; i++) {

            Label lbl = new Label((i + 1) + "-s");
            scorePane.add(lbl, 0, i);

            TextField txf = new TextField();
            txf.setPrefWidth(width);
            txf.setEditable(false);
            txf.setFocusTraversable(false);
            txf.setOnMouseClicked(event -> this.resultAction(event));
            txf.setDisable(true);
            txfResults.add(txf);
            scorePane.add(txf, 1, i);
        }

        for (int i = 0; i < categoryLabels.length; i++) {
            int row = i + 7;


            Label lbl = new Label(categoryLabels[i]);
            scorePane.add(lbl, 0, row);


            TextField txf = new TextField();
            txf.setPrefWidth(width);
            txf.setEditable(false);
            txf.setFocusTraversable(false);
            txf.setDisable(true);
            txf.setOnMouseClicked(event -> this.resultAction(event));


            txfResults.add(txf);

            scorePane.add(txf, 1, row);
        }
// add labels and text fields for sums, bonus and total.
        txfSumSame.setPrefWidth(50);
        txfBonus.setPrefWidth(50);
        txfSumOther.setPrefWidth(50);
        txfTotal.setPrefWidth(50);
        Label lblSum = new Label("Sum");
        scorePane.add(lblSum, 3, 5);
        scorePane.add(txfSumSame, 4, 5);
        txfSumSame.setFocusTraversable(false);
        txfSumSame.setDisable(true);
        Label lblBonus = new Label("Bonus");
        scorePane.add(lblBonus, 3, 6);
        scorePane.add(txfBonus, 4, 6);
        txfBonus.setFocusTraversable(false);
        txfBonus.setDisable(true);
        Label lblSumOther = new Label("Sum");
        scorePane.add(lblSumOther, 3, 15);
        scorePane.add(txfSumOther, 4, 15);
        txfSumOther.setFocusTraversable(false);
        txfSumOther.setDisable(true);
        Label lblTotal = new Label("Total");
        scorePane.add(lblTotal, 3, 16);
        scorePane.add(txfTotal, 4, 16);
        txfTotal.setFocusTraversable(false);
        txfTotal.setDisable(true);


        btnThrow.setOnAction(event -> this.bthThrowAction());

    }


    // Create an action method for btnThrow's action.
    private void bthThrowAction() {
        if (dice.getThrowCount() < 3) {
            enableTxfResults();
            boolean[] holds = readCbxHolds();
            disableCbxHolds();
            dice.throwDice(holds);
            fillTxfValues();
            fillTxfResults();
            disableUnusedTxfResults();
            btnThrow.setText("Throw " + (dice.getThrowCount() + 1));


            if (dice.getThrowCount() == 3) {
                btnThrow.setDisable(true);
                btnThrow.setText("No throws left");
                enableTxfResults();
            } else if (dice.getThrowCount() == 1) {
                resetCbxHolds();
            }

        }
    }

    // Create a method for mouse click on one of the text fields in txfResults.
    private void resultAction(MouseEvent event) {
        TextField txf = (TextField) event.getSource();

        if (dice.getThrowCount() > 0 && txf.getStyle().isEmpty()) {

            txf.setStyle("-fx-text-inner-color: blue; -fx-font-weight: bold;");
            txf.setDisable(true);
            disableUnusedTxfResults();
            dice.resetThrowCount();
            resetCbxHolds();
            btnThrow.setDisable(false);
            btnThrow.setText("Throw 1");
            clearUnusedTxfResults();

            for (TextField tValue : txfValues) {
                tValue.clear();
            }

            this.updateSums();
        }
    }

    // Reset all Hold checkboxes to false and enabled.
    private void resetCbxHolds() {
        for (int i = 0; i < 5; i++) {
            cbxHolds[i].setDisable(false);
            cbxHolds[i].setSelected(false);
        }
    }

    // Return the status of Hold checkboxes.
    private boolean[] readCbxHolds() {
        boolean[] holds = new boolean[5];
        for (int i = 0; i < 5; i++) {
            holds[i] = cbxHolds[i].isSelected();
        }
        return holds;
    }

    // Fill the text fields that show the dice values.
    private void fillTxfValues() {
        int[] values = dice.getValues();
        for (int i = 0; i < 5; i++) {
            txfValues[i].setText(String.valueOf(values[i]));
        }
    }

    // Fill the text fields that show the results.
    private void fillTxfResults() {
        for (int i = 0; i < 6; i++) {
            TextField txf = txfResults.get(i);
            if (!txf.isDisable()) {
                txf.setText("" + dice.sameValuePoints(i + 1));
            }
        }

        int[] specialPoints = {
                dice.onePairPoints(), dice.twoPairPoints(), dice.threeSamePoints(),
                dice.fourSamePoints(), dice.fullHousePoints(), dice.smallStraightPoints(),
                dice.largeStraightPoints(), dice.chancePoints(), dice.yatzyPoints()
        };

        for (int i = 0; i < specialPoints.length; i++) {
            TextField txf = txfResults.get(i + 6);
            if (!txf.isDisable()) {
                txf.setText("" + specialPoints[i]);
            }
        }
    }

    // Enable result text fields not used yet.
    private void enableTxfResults() {
        for (int i = 0; i < 6; i++) {
            TextField txf = txfResults.get(i);
            if (txf.getStyle().isEmpty()) {
                txf.setDisable(false);
            }
        }
        for (int i = 0; i < 9; i++) {
            TextField txf = txfResults.get(i + 6);
            if (txf.getStyle().isEmpty()) {
                txf.setDisable(false);
            }
        }
        if (btnThrow.isDisable()) {
            for (int i = 0; i < 6; i++) {
                TextField txf = txfResults.get(i);
                if (txf.getStyle().isEmpty()) {
                    txf.setDisable(false);
                }
            }
            for (int i = 0; i < 9; i++) {
                TextField txf = txfResults.get(i + 6);
                if (txf.getStyle().isEmpty()) {
                    txf.setDisable(false);
                }


            }
        }
    }

    // Clear result text fields not used yet.
    private void clearUnusedTxfResults() {
        for (int i = 0; i < 6; i++) {
            TextField txf = txfResults.get(i);
            if (txf.getStyle().isEmpty()) {
                txf.clear();
            }
        }
        for (int i = 0; i < 9; i++) {
            TextField txf = txfResults.get(i + 6);
            if (txf.getStyle().isEmpty()) {
                txf.clear();
            }
        }
    }

    // Make result text fields not used yet mouse transparent.
    private void disableUnusedTxfResults() {
        for (int i = 0; i < 6; i++) {
            TextField txf = txfResults.get(i);
            if (txf.getStyle().isEmpty()) {
                txf.setDisable(true);
            }
        }
        for (int i = 0; i < 9; i++) {
            TextField txf = txfResults.get(i + 6);
            if (txf.getStyle().isEmpty()) {
                txf.setDisable(true);
            }
        }
    }

    // Disable the Hold check boxes.
    private void disableCbxHolds() {
        for (int i = 0; i < 5; i++) {
            if (cbxHolds[i].isSelected()) {
                cbxHolds[i].setDisable(true);
            }
        }
    }

    // Update the sum, bonus and total text fields.
    private void updateSums() {
        int sumSame = 0;
        int sumOther = 0;
        int bonus = 0;
        for (int i = 0; i < 6; i++) {
            String text = txfResults.get(i).getText();
            if (!text.isEmpty() && txfResults.get(i).isDisable()) {
                sumSame += Integer.parseInt(text);
            }
        }
        txfSumSame.setText(String.valueOf(sumSame));
        if (sumSame >= 63) {
            bonus = 50;
        }

        sumSame += bonus;

        txfBonus.setText(String.valueOf(bonus));

        for (int i = 6; i < txfResults.size(); i++) {
            String text = txfResults.get(i).getText();

            if (!text.isEmpty() && txfResults.get(i).isDisable()) {
                sumOther += Integer.parseInt(text);
            }
        }
        txfSumOther.setText(String.valueOf(sumOther));
        int total = sumSame + bonus + sumOther;
        txfTotal.setText(String.valueOf(total));
    }
}

