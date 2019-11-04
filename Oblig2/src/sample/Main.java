package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        BorderPane pane = new BorderPane();
        pane.setBottom(bottomPane());
        //pane.setCenter(tree());
        Scene scene = new Scene(pane, 800, 700);
        primaryStage.setTitle("Obligatorisk oppgave 2");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public HBox bottomPane(){
        HBox group = new HBox(50);

        TextField innTxt = new TextField();
        innTxt.setEditable(true);
        innTxt.setAlignment(Pos.CENTER);


        Button rndmTall = new Button("Tilfeldige tall");
        rndmTall.setAlignment(Pos.CENTER_RIGHT);
        group.getChildren().addAll(innTxt, rndmTall);

        return group;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
