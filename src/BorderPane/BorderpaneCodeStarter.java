package BorderPane;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by jonasschutz on 25.06.17.
 */
public class BorderpaneCodeStarter extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent rootPanel = new BorderpaneCode();

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle("");
        primaryStage.setScene(scene);

        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



