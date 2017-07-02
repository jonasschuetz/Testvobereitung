package Example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Created by jonasschutz on 01.07.17.
 */
public class Example extends BorderPane {

      Presentationmodelexample model = new Presentationmodelexample();


        HBox bottom;
        VBox middle;

        HBox row1;
        HBox row2;



        Label label1;
        Label label2;

        TextField field1;
        TextField field2;

        Button button;



        public Example(Presentationmodelexample pm){
        model = pm;
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

        bottom = new HBox();
        middle = new VBox();

        row1 = new HBox();
        row2 = new HBox();

        button = new Button();

        label1 = new Label("Label1");
        label2 = new Label("Label2");

        field1 = new TextField();
        field2 = new TextField();

    }

    private void layoutControls(){

        //Alignmentsetting
        middle.setAlignment(Pos.BASELINE_RIGHT);

        //Padding
        middle.setPadding(new Insets(10,10,10,10));
        row1.setPadding(new Insets(10,10,10,10));
        row2.setPadding(new Insets(10,10,10,10));

        bottom.setPadding(new Insets(50, 10, 10,10));

        //Spacing

        bottom.setSpacing(25);
        row1.setSpacing(25);
        row2.setSpacing(25);


        //Vgrow and Hgrow. Achtung bei BorderPane sind beide Vorhanden. Beim Vbox und Hbox nicht
        bottom.setHgrow(button, Priority.ALWAYS);
        row1.setHgrow(label1, Priority.ALWAYS);
        row2.setHgrow(label2, Priority.ALWAYS);
        row1.setHgrow(field1, Priority.ALWAYS);
        row2.setHgrow(field2, Priority.ALWAYS);


        //Grösse setzen
        button.setMaxHeight(200);
        button.setMinHeight(100);
        button.setMaxWidth(Double.MAX_VALUE);

        field2.setMaxSize(1024, 1024);
        field2.setMinSize(200,200);
        field1.setMaxSize(1024, 1024);
        field1.setMinSize(200,200);


        //Einfügen
        bottom.getChildren().addAll(button);

        row1.getChildren().addAll(label1,field1);
        row2.getChildren().addAll(label2,field2);


        middle.getChildren().addAll(row1, row2);

        setCenter(middle);
        setBottom(bottom);



    }


    private void setupEventHandlers(){

        button.getOnMousePressed();

    }

    private void setupValueChangeListener(){

    }

    private void setupBindings(){

    }



}
