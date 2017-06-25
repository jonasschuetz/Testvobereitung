package Hbox;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by jonasschutz on 25.06.17.
 */
public class HBoxStarter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Presentationmodel model = new Presentationmodel();

        Parent rootPanel = new HBoxcode(model);

        Scene scene = new Scene(rootPanel);

        String stylesheet = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);

        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);

        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
