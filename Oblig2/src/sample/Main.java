package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static java.lang.Integer.parseInt;

public class Main extends Application {
    private BorderPane pane;
    @Override
    public void start(Stage primaryStage) throws Exception{

        System.out.println("hei");

        pane = new BorderPane();
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
        innTxt.setOnKeyReleased( e ->{
            drawTree(parseInt(innTxt.getText()));
        });


        Button rndmTall = new Button("Tilfeldige tall");
        rndmTall.setAlignment(Pos.CENTER_RIGHT);

        rndmTall.setOnAction(e ->{
            System.out.println("Knapp");
            String utTxt = "";
            for(int i = 0;i<10;i++){
                utTxt += Math.round(Math.random()*9);
                System.out.println( "Test " + utTxt);

            }
            System.out.println(utTxt);
            innTxt.setText(utTxt);
        });

        group.getChildren().addAll(innTxt, rndmTall);

        return group;
    }

    private void drawTree(int i) {
        int h = 0;
        System.out.println("i er: " + i);
        int x = i;
        while (x > 0) {
            int j = x%10;
            x = x/10;
            AVLNode node = new AVLNode(j, h);
            h++;
            System.out.println(j);
        }


        pane.setCenter(null);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
