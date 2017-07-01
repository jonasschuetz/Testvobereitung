package Vbox;


import Hbox.HBoxcode;
import Hbox.Presentationmodel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Created by jonasschutz on 25.06.17.
 */
public class VBoxcode extends VBox {

    Presentationmodel pm = new Presentationmodel();

    Button button = new Button();
    Label label = new Label();
    TextField field = new TextField();


    public VBoxcode (Presentationmodel p) {
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

        //Bei VBox gibt es kein setHgrow

        setVgrow(button, Priority.ALWAYS);
        setVgrow(label, Priority.ALWAYS);
        setVgrow(field, Priority.ALWAYS);



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
