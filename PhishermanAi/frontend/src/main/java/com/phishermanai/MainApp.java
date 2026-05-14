package com.phishermanai;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("PhishermanAi");

        BorderPane root = new BorderPane();
        root.getStyleClass().add("root-pane");

        Label title = new Label("PhishermanAi");
        title.getStyleClass().add("header-title");

        Label subtitle = new Label("Secure. Smart. Sentient.");
        subtitle.getStyleClass().add("header-subtitle");

        Button actionButton = new Button("Launch Monitor");
        actionButton.getStyleClass().add("primary-button");
        actionButton.setOnAction(event -> subtitle.setText("Ready for threat analysis."));

        HBox headerRow = new HBox(18, title, actionButton);
        headerRow.setAlignment(Pos.CENTER_LEFT);
        headerRow.setPadding(new Insets(20, 0, 30, 0));
        headerRow.getStyleClass().add("header-row");

        StackPane centerPane = new StackPane(subtitle);
        centerPane.setAlignment(Pos.TOP_LEFT);
        centerPane.setPadding(new Insets(8, 0, 0, 0));

        root.setTop(headerRow);
        root.setCenter(centerPane);

        Scene scene = new Scene(root, 960, 620);
        scene.getStylesheets().add(getClass().getResource("/styles/dark-theme.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
