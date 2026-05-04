package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class GUI extends Application {

    //ListView
    private final ListView<Forestilling> forestillingListView = new ListView<>();
    private final ListView<Kunde> kundeListView = new ListView<>();
    private final ListView<Plads> pladsListView = new ListView<>();
    //Labels
    private final Label forestillingerLabel = new Label("Forestillinger 🎭");
    private final Label kunderLabel = new Label("Kunder 👥");
    private final Label pladserLabel = new Label("Pladser 🪑");
    private final Label navnLabel = new Label("Navn:");
    private final Label startDatoLabel = new Label("Start dato:");
    private final Label slutDatoLabel = new Label("Slut dato:");
    private final Label kundeNavnLabel = new Label("Kunde navn:");
    private final Label kundeMobilLabel = new Label("Kunde mobil:");
    private final Label datoLabel = new Label("Dato:");
    //TextField
    private final TextField navnTxf = new TextField();
    private final TextField startDatoTxf = new TextField();
    private final TextField slutDatoTxf = new TextField();
    private final TextField kundeNavnTxf = new TextField();
    private final TextField kundeMobilTxf = new TextField();
    private final TextField datoTxf = new TextField();
    //Button
    private final Button opretKundeBtn = new Button("Opret kunde");
    private final Button opretForestilling = new Button("Opret forestilling");
    private final Button opretBestilling = new Button("Opret bestilling");

    private ArrayList<Plads> ledigePladser = new ArrayList<>(Storage.getPladser());

    @Override
    public void start(Stage stage) {
        stage.setTitle("Teater bestillinger");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10, 10, 10, 10));

        GridPane listPaneF = new GridPane();
        pane.add(listPaneF, 0, 0, 2, 1);
        //COLUMN 0 && listView
        listPaneF.add(forestillingerLabel, 0, 0);
        listPaneF.add(forestillingListView, 0, 1);
        forestillingerLabel.setFont(Font.font(30));

        GridPane listPaneK = new GridPane();
        pane.add(listPaneK, 2, 0, 2, 1);
        listPaneK.add(kunderLabel, 0, 0);
        listPaneK.add(kundeListView, 0, 1);
        kunderLabel.setFont(Font.font(30));

        GridPane listpaneP = new GridPane();
        pane.add(listpaneP, 4, 0, 2, 1);
        listpaneP.add(pladserLabel, 0, 0);
        listpaneP.add(pladsListView, 0, 1);
        pladserLabel.setFont(Font.font(30));

        //Forestillinger COLUMN
        pane.add(navnLabel, 0, 2);
        pane.add(navnTxf, 1, 2);
        pane.add(startDatoLabel, 0, 3);
        pane.add(slutDatoLabel, 0, 4);
        pane.add(startDatoTxf, 1, 3);
        pane.add(slutDatoTxf, 1, 4);

        //Kunde COLUMN
        pane.add(kundeNavnLabel, 2, 2);
        pane.add(kundeNavnTxf, 3, 2);
        pane.add(kundeMobilLabel, 2, 3);
        pane.add(kundeMobilTxf, 3, 3);

        //Pladser COLUMN
        pane.add(datoLabel, 4, 2);
        pane.add(datoTxf, 5, 2);
        datoTxf.setPromptText("YYYY-MM-DD");

        //Button
        pane.add(opretForestilling, 1, 5);
        pane.add(opretKundeBtn, 3, 4);
        pane.add(opretBestilling, 5, 3);

        opretBestilling.setOnAction(event -> opretBestilling());
        opretForestilling.setOnAction(event -> opretForestilling());
        opretKundeBtn.setOnAction(event -> opretKunde());

        pladsListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        forestillingListView.getItems().setAll(Storage.getForestillinger());
        kundeListView.getItems().setAll(Storage.getKunder());

        pladsListView.getItems().setAll(ledigePladser);


    }
    private void opretForestilling() {
        String navn = navnTxf.getText();
        LocalDate startDato = LocalDate.parse(startDatoTxf.getText());
        LocalDate slutDato = LocalDate.parse(slutDatoTxf.getText());

        Controller.lavForestilling(navn, startDato, slutDato);
        forestillingListView.getItems().setAll(Storage.getForestillinger());

        navnTxf.clear();
        startDatoTxf.clear();
        slutDatoTxf.clear();


    }


    private void opretKunde() {
        String kundeNavn = kundeNavnTxf.getText();
        String kundeMobil = kundeMobilTxf.getText();

        Controller.lavKunde(kundeNavn, kundeMobil);
        kundeListView.getItems().setAll(Storage.getKunder());

        kundeNavnTxf.clear();
        kundeMobilTxf.clear();
    }



    private void opretBestilling() {
        ArrayList<Plads> valgtePladser = new ArrayList<>(pladsListView.getSelectionModel().getSelectedItems());
        Forestilling forestilling = forestillingListView.getSelectionModel().getSelectedItem();
        Kunde kunde = kundeListView.getSelectionModel().getSelectedItem();

        if (forestilling == null || kunde == null || valgtePladser.isEmpty()) {
            fejl("FEJL", "Du mangler noget");
            return;
        }

        try {
            LocalDate dato = LocalDate.parse(datoTxf.getText());
            ledigePladser.removeIf(valgtePladser::contains);
            pladsListView.getItems().setAll(ledigePladser);
            Bestilling nyBestilling = Controller.opretBestillingMedPladser(forestilling, kunde, dato, valgtePladser);

                int totaltSolgte = forestilling.antalBestiltePladserPåDag(dato);


                ArrayList<Plads> kundensPladser = kunde.bestiltePladserTilForestillingPåDag(forestilling, dato);


                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Bestilling Gennemført");
                alert.setHeaderText("Status for " + dato);

                String besked = "Bestilling oprettet!\n\n" +
                        "Samlet pris: " + nyBestilling.samletPris() + "\n " +
                        "Travl dag: " + forestilling.succesDato(forestilling) + "\n" +
                        "Status for forestillingen:\n" +
                        "- Antal pladser solgt i alt i dag: " + totaltSolgte + "\n\n" +
                        "Status for kunden (" + kunde.getNavn() + "):\n" +
                        "- Antal pladser kunden har i alt i dag: " + kundensPladser.size();

                alert.setContentText(besked);
                alert.showAndWait();
        } catch (Exception e) {
            fejl("Fejl", "Tjek datoformatet!!! (ÅÅÅÅ-MM-DD).");
        }
    }

    private void fejl(String titel, String besked) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titel);
        alert.setContentText(besked);
        alert.showAndWait();
    }

}