package pl.cinemaServiceClient.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import pl.cinemaServiceClient.ClientWindow;

import java.net.URL;
import java.util.ResourceBundle;
@Controller
@RequiredArgsConstructor
public class ClientController implements Initializable {

    @FXML
    Label labelExit;

    @Override
    public void initialize(URL location, ResourceBundle resources){


    }
    public void labelExitClicked(){
        labelExit.setOnMouseClicked(event->{
            Platform.exit();
        });
    }
}
