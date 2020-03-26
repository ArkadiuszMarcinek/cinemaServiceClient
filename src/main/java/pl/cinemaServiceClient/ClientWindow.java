package pl.cinemaServiceClient;

import pl.cinemaServiceClient.controllers.ClientController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.URL;

@SpringBootApplication
public class ClientWindow extends Application {
    private ConfigurableApplicationContext applicationContext;
    private FXMLLoader loader;

    public static void main(String[] args){Application.launch(args);}

    @Override
    public void init() {
        applicationContext = SpringApplication.run(ClientWindow.class);
        loader = new FXMLLoader();
        loader.setController(new ClientController());

    }
    @Override
    public void stop(){
        this.applicationContext.close();
        Platform.exit();
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        URL xmlUrl = getClass().getClassLoader().getResource("clientWindow.fxml");
        loader.setLocation(xmlUrl);
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("ClientApplication");
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        primaryStage.setResizable(false);
    }


}
