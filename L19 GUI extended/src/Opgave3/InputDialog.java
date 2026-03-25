package Opgave3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Optional;

public class InputDialog extends Stage {

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private PersonExtendeded personExtendeded = null;
    private final CheckBox chkSenior = new CheckBox("Senior");
    private Button btnAdd = new Button("Add");
    private boolean isAddClicked = false;

    public InputDialog(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);
        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private void initContent(GridPane pane) {
// pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);
// column 0
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        Label lblTitle = new Label("Job title:");
        pane.add(lblTitle, 0, 1);
// column 1
        pane.add(txfName, 1, 0);
        pane.add(txfTitle, 1, 1);
        pane.add(chkSenior, 0, 2);

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 3, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);
        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        buttonBox.getChildren().add(btnAdd);

        btnAdd.setOnAction(event -> {
            isAddClicked = true;
            this.close();
        });
        btnCancel.setOnAction(event -> this.close());

    }

    public TextField getTxfName() {
        return txfName;
    }

    public TextField getTxfTitle() {
        return txfTitle;
    }

    public CheckBox getChkSenior() {
        return chkSenior;
    }

    public boolean getIsAddClicked() {
        return isAddClicked;
    }

}
