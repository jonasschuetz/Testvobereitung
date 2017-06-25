package Hbox;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;


/**
 * Created by jonasschutz on 25.06.17.
 */

public class HBoxcode extends HBox {

        Presentationmodel pm = new Presentationmodel();

        Button button = new Button();
        Label label = new Label();
        TextField field = new TextField();


        public HBoxcode (Presentationmodel p) {
            pm = p;
            initializeSelf();
            initializeControls();
            layoutControls();
            setupEventHandlers();
            setupValueChangeListener();
            setupBindings();

        }

        private void initializeSelf(){
            String stylesheet = getClass().getResource("style.css").toExternalForm();
            getStylesheets().add(stylesheet);

            this.setPrefSize(1200, 1200);

        }

        private void initializeControls(){
            button = new Button("Text von Button hier");
            label = new Label("Text von Label hier");
            field = new TextField();

        }

        private void layoutControls(){
            setPadding(new Insets(50, 10, 10,10));
            setSpacing(25);

            //Bei HBox gibt es kein setVgrow

            setHgrow(button, Priority.ALWAYS);
            setHgrow(label, Priority.ALWAYS);
            setHgrow(field, Priority.ALWAYS);



            button.setMaxHeight(1024);
            button.setMinHeight(200);
            field.setMaxSize(1024, 1024);
            field.setMinSize(200,200);

            getChildren().addAll(button, label, field);

        }

        private void setupEventHandlers(){

        }

        private void setupValueChangeListener(){

        }

        private void setupBindings(){

        }
}
