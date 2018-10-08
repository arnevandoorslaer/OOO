package ui;

import domain.Geheim;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.*;


public class GeheimUIFX extends Application {

    private Geheim g;
    Button Code;
    Button Decode;
    TextField input;
    TextField output;
    ComboBox<String> combo;

    public static void main(String[] args){
        launch(args);
    }
    public GeheimUIFX(){

    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Coderen en decoderen");

        // de knop om te coderen
        Code = new Button("Codeer");
        Code.setLayoutX(100);
        Code.setLayoutY(100);
        Code.setPrefSize(100,50);
        Code.setStyle("-fx-font: 16 arial;");
        Code.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                g = new Geheim(input.getText());
                g.setGedrag(combo.getValue());
                System.out.println(combo.getValue());
                output.setText(g.codeer());
            }
        });

        //de knop om te decoderen
        Decode = new Button("Decodeer");
        Decode.setLayoutX(340);
        Decode.setLayoutY(100);
        Decode.setPrefSize(100,50);
        Decode.setStyle("-fx-font: 16 arial;");
        Decode.setOnAction(e -> {
            g = new Geheim(input.getText());
            g.setGedrag(combo.getValue());
            System.out.println(combo.getValue());
            output.setText(g.decodeer());
        });

        // input field
        input = new TextField();
        input.setLayoutX(20);
        input.setLayoutY(20);
        input.setPrefWidth(500);

        // textField voor de output
        output = new TextField("test");
        output.setDisable(true);
        output.setLayoutX(20);
        output.setLayoutY(170);
        output.setPrefWidth(500);

        // de combobox vullen
        combo = new ComboBox<>();
        combo.getItems().addAll("Caesar","Spiegel");
        combo.setLayoutX(190);
        combo.setLayoutY(50);
        combo.setPrefWidth(160);

        // maak de layout en voeg alles toe
        Pane layout = new Pane();
        layout.getChildren().add(input);
        layout.getChildren().add(combo);
        layout.getChildren().add(Code);
        layout.getChildren().add(Decode);
        layout.getChildren().add(output);
        //achtergrond instellen zoda ik ni blind wordt in de nacht
        layout.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        // de scene is alles in het venster, hier voegen
        // we de layout aan toe
        Scene scene = new Scene(layout, 540, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
