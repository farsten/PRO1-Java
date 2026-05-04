package ex1SemesterProeve.gui;
import javafx.scene.control.ListView;
import ex1SemesterProeve.controller.Controller;
import ex1SemesterProeve.model.Område;
import ex1SemesterProeve.model.Plads;
import ex1SemesterProeve.storage.Storage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class GUI extends Application {

    private ListView<Plads> lvwPladser;
    private TextField txfNummer;
    private ToggleGroup groupOmråde;
    private RadioButton rbStandard, rbVip, rbBørne, rbTurnering;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Netcafé administration");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        Label lblPladser = new Label("Pladser");
        pane.add(lblPladser, 0, 0);

        lvwPladser = new ListView<>();
        lvwPladser.setPrefHeight(200);
        lvwPladser.getItems().setAll(Storage.getPladser());
        pane.add(lvwPladser, 0, 1);

        VBox vboxOmråde = new VBox(5);
        groupOmråde = new ToggleGroup();

        rbStandard = new RadioButton("Standard");
        rbVip = new RadioButton("VIP");
        rbBørne = new RadioButton("Børne");
        rbTurnering = new RadioButton("Turnering");

        rbStandard.setToggleGroup(groupOmråde);
        rbVip.setToggleGroup(groupOmråde);
        rbBørne.setToggleGroup(groupOmråde);
        rbTurnering.setToggleGroup(groupOmråde);
        rbStandard.setSelected(true);

        vboxOmråde.getChildren().addAll(new Label("Område:"), rbStandard, rbVip, rbBørne, rbTurnering);
        pane.add(vboxOmråde, 0, 2);


        pane.add(new Label("Nummer:"), 0, 3);
        txfNummer = new TextField();
        pane.add(txfNummer, 0, 4);


        Button btnOpret = new Button("Opret");
        pane.add(btnOpret, 0, 5);
        btnOpret.setOnAction(event -> this.opretAction());
    }

    private void opretAction() {

        int nr = Integer.parseInt(txfNummer.getText().trim());

        Område område = Område.STANDARD;
        RadioButton selected = (RadioButton) groupOmråde.getSelectedToggle();

        if (selected == rbVip) område = Område.VIP;
        else if (selected == rbBørne) område = Område.BØRNE;
        else if (selected == rbTurnering) område = Område.TURNERING;

        Controller.lavPlads(nr, område);

        lvwPladser.getItems().setAll(Storage.getPladser());
        txfNummer.clear();
    }
}