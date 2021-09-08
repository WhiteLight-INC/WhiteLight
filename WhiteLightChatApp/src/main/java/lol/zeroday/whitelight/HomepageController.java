package lol.zeroday.whitelight;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lol.zeroday.whitelight.utils.SceneController;

import java.net.URL;
import java.util.ResourceBundle;

public class HomepageController implements Initializable {

    @FXML
    public VBox background;

    public void handleClose(ActionEvent event) {
        SceneController.closeScene(event);
    }

    public void handleMinimize(ActionEvent event) {
        SceneController.minimizeScene(event);
    }

    public void handleDrag(MouseEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        SceneController.dragScene(event, stage, background);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
