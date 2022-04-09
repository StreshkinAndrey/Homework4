package ru.gb.homework4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GameController {

    @FXML
    private TextArea messageArea;

    @FXML
    private TextField messageField;

    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        final String playerText = messageField.getText();
        final String text = String.format(playerText);
        messageArea.appendText(text + "\n");
        messageField.clear();
        messageField.requestFocus();
    }
}