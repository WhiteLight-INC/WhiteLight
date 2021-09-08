package lol.zeroday.whitelight;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lol.zeroday.whitelight.utils.SceneController;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    @FXML
    public Button closeButton;
    @FXML
    public Button minimizeButton;
    @FXML
    public VBox background;

    @FXML
    public void handleClose(ActionEvent event) {
        SceneController.closeScene(event);
    }

    @FXML
    public void handleMinimize(ActionEvent event) {
        SceneController.minimizeScene(event);
    }

    @FXML
    public void handleDrag(MouseEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        SceneController.dragScene(event, stage, background);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
