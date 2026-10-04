/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainnn;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Mainnn extends Application {

@Override
public void start(Stage stage) {

    Label title = new Label("CLEAN WATER & SANITATION");
    title.setStyle(
        "-fx-font-size: 32px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: white;"
    );

    Label sdg = new Label("SUSTAINABLE DEVELOPMENT GOAL 6");
    sdg.setStyle(
        "-fx-font-size: 20px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: #E1F5FE;"
    );

    Label slogan = new Label("EVERY DROP COUNTS");
    slogan.setStyle(
        "-fx-font-size: 25px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: #01579B;"
    );

    Label whyTitle = new Label("WHY CLEAN WATER?");
    whyTitle.setStyle(
        "-fx-font-size: 20px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: #0277BD;"
    );

    Label whyText = new Label(
        "Clean water is essential for health,\n" +
        "food, education and a better quality of life."
    );
    whyText.setStyle(
        "-fx-font-size: 15px;" +
        "-fx-text-fill: #333333;"
    );

    VBox whyBox = new VBox(10);
    whyBox.setAlignment(Pos.CENTER);
    whyBox.setPadding(new Insets(15));
    whyBox.setStyle(
        "-fx-background-color: white;" +
        "-fx-background-radius: 15;"
    );
    whyBox.getChildren().addAll(whyTitle, whyText);

    Label problemTitle = new Label("MAJOR PROBLEMS");
    problemTitle.setStyle(
        "-fx-font-size: 20px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: #0277BD;"
    );

    Label problemText = new Label(
        "• Water pollution\n" +
        "• Water wastage\n" +
        "• Lack of sanitation\n" +
        "• Unsafe drinking water"
    );
    problemText.setStyle(
        "-fx-font-size: 15px;" +
        "-fx-text-fill: #333333;"
    );

    VBox problemBox = new VBox(10);
    problemBox.setAlignment(Pos.CENTER);
    problemBox.setPadding(new Insets(15));
    problemBox.setStyle(
        "-fx-background-color: white;" +
        "-fx-background-radius: 15;"
    );
    problemBox.getChildren().addAll(problemTitle, problemText);

    Label solutionTitle = new Label("WHAT CAN WE DO?");
    solutionTitle.setStyle(
        "-fx-font-size: 20px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: #0277BD;"
    );

    Label solutionText = new Label(
        "• Save water\n" +
        "• Keep water bodies clean\n" +
        "• Reduce plastic waste\n" +
        "• Use water responsibly"
    );
    solutionText.setStyle(
        "-fx-font-size: 15px;" +
        "-fx-text-fill: #333333;"
    );

    VBox solutionBox = new VBox(10);
    solutionBox.setAlignment(Pos.CENTER);
    solutionBox.setPadding(new Insets(15));
    solutionBox.setStyle(
        "-fx-background-color: white;" +
        "-fx-background-radius: 15;"
    );
    solutionBox.getChildren().addAll(solutionTitle, solutionText);

    HBox boxes = new HBox(20);
    boxes.setAlignment(Pos.CENTER);
    boxes.getChildren().addAll(
        whyBox,
        problemBox,
        solutionBox
    );

    Label responsibility = new Label("OUR RESPONSIBILITY");
    responsibility.setStyle(
        "-fx-font-size: 17px;" +
        "-fx-font-weight: bold;" +
        "-fx-text-fill: white;"
    );

    Label responsibilityText = new Label(
        "Protect water today for a better tomorrow."
    );
    responsibilityText.setStyle(
        "-fx-font-size: 15px;" +
        "-fx-text-fill: white;"
    );

    Button button = new Button("SAVE WATER • SAVE LIFE");
    button.setStyle(
        "-fx-font-size: 17px;" +
        "-fx-font-weight: bold;" +
        "-fx-background-color: #01579B;" +
        "-fx-text-fill: white;" +
        "-fx-padding: 12px 25px;" +
        "-fx-background-radius: 20;"
    );

    button.setOnAction(e ->
        responsibilityText.setText(
            "Great! Every small action makes a difference."
        )
    );

    VBox bottom = new VBox(8);
    bottom.setAlignment(Pos.CENTER);
    bottom.getChildren().addAll(
        responsibility,
        responsibilityText,
        button
    );

    VBox main = new VBox(20);
    main.setAlignment(Pos.CENTER);
    main.setPadding(new Insets(25));
    main.setStyle(
        "-fx-background-color: linear-gradient(" +
        "to bottom, #0288D1, #81D4FA);"
    );

    main.getChildren().addAll(
        title,
        sdg,
        slogan,
        boxes,
        bottom
    );

    Scene scene = new Scene(main, 950, 650);

    stage.setTitle("SDG 6 - Clean Water and Sanitation");
    stage.setScene(scene);
    stage.setResizable(true);
    stage.show();
}

public static void main(String[] args) {
    launch(args);
}

}