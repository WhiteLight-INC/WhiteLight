package lol.zeroday.whitelight;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lol.zeroday.whitelight.utils.SceneController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    public Button closeButton;
    @FXML
    public Label nameLabel;
    @FXML
    public VBox background;
    @FXML
    public Button minimizeButton;
    public Button loginButtonLogin;
    public Button registerButtonLogin;

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

    @FXML
    public void handleLogin(ActionEvent event) throws IOException {
        SceneController.changeScene(event, "homepage.fxml", 300, 300);
    }

    @FXML
    public void handleRegister(ActionEvent event) throws IOException {
        SceneController.changeScene(event, "register.fxml", 300, 300);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
