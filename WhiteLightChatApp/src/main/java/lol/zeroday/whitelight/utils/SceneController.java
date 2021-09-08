package lol.zeroday.whitelight.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SceneController {

    private static double xOffset = 0;
    private static double yOffset = 0;

    public static void changeScene(ActionEvent event, String fileName, int width, int height) throws IOException {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(SceneController.class.getResource(fileName));
        Scene scene = new Scene(root, width, height);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.getIcons().add(new Image(SceneController.class.getResourceAsStream("wl.png")));
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void closeScene(ActionEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public static void minimizeScene(ActionEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    public static void dragScene(MouseEvent event, Stage stage, VBox background) {
        background.setOnMousePressed(event12 -> {
            xOffset = stage.getX() - event12.getScreenX();
            yOffset = stage.getY() - event12.getScreenY();
        });
        background.setOnMouseDragged(event1 -> {
            stage.setX(event1.getScreenX() + xOffset);
            stage.setY(event1.getScreenY() + yOffset);
        });
    }

}
