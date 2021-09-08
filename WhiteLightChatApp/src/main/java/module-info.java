module WhiteLightChatApp.main {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;
    requires javafx.web;
    requires javafx.graphics;

    opens lol.zeroday.whitelight;

    exports lol.zeroday.whitelight;
}