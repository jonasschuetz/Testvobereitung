package Example;

import Hbox.HBoxcode;
import Hbox.Presentationmodel;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by jonasschutz on 25.06.17.
 */
public class ExampleStarter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Presentationmodelexample model = new Presentationmodelexample();

        Parent rootPanel = new Example(model);

        Scene scene = new Scene(rootPanel);

        String stylesheet = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);

        primaryStage.setTitle("Example");
        primaryStage.setScene(scene);

        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
