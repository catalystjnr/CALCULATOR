/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class Cal extends Application {

    private TextField textField = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {

        
        textField.setPrefHeight(50);
        textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setEditable(false);

        StackPane stackpane = new StackPane();
        stackpane.setPadding(new Insets(10));
        stackpane.getChildren().add(textField);

        TilePane grid = new TilePane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.TOP_CENTER);

        grid.getChildren().addAll(
                buttonForNum("7"),
                buttonForNum("8"),
                buttonForNum("9"),
                buttonForOperator("+"),
                buttonForNum("4"),
                buttonForNum("5"),
                buttonForNum("6"),
                buttonForOperator("-"),
                buttonForNum("1"),
                buttonForNum("2"),
                buttonForNum("3"),
                buttonForOperator("="),
                buttonForZero("0"),
                buttonForOperator("/"),
                buttonForOperator("=")
        );

        BorderPane root = new BorderPane();
        root.setTop(stackpane);
        root.setCenter(grid);
        Scene scene = new Scene(root, 350, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    private Button buttonForNum(String ch) {

        Button button = new Button(ch);
        button.setPrefSize(50, 50);
        return button;

    }

    private Button buttonForOperator(String ch) {

        Button button = new Button(ch);
        button.setPrefSize(50, 50);
        return button;

    }

  
    private Button buttonForZero(String ch) {
        Button button = new Button(ch);
        button.setPrefSize(90, 50);
        return button;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
