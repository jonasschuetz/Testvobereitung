package com.company;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;



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

        }

        private void layoutControls(){

        }

        private void setupEventHandlers(){

        }

        private void setupValueChangeListener(){

        }

        private void setupBindings(){

        }
}
