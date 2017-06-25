package BorderPane;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * Created by jonasschutz on 25.06.17.
 */
public class BorderpaneCode extends BorderPane {

        private Button topButton;
        private Button   bottomButton;
        private Button   leftButton;
        private Button   rightButton;
        private TextArea textArea;

        public BorderpaneCode() {
            initializeControls();
            layoutControls();
        }

        private void initializeControls() {
            topButton    = new Button("top");
            bottomButton = new Button("bottom");
            leftButton   = new Button("left");
            rightButton  = new Button("right");

            //Grösse von TextArea wird von Default bestummen.
            textArea     = new TextArea();
        }

        private void layoutControls() {
            //wenn man diese nicht hat, wird der Button auf die Preferred Width gesetzt (der Textlänge entsprechend)
            topButton.setMaxWidth(Double.MAX_VALUE);
            bottomButton.setMaxWidth(Double.MAX_VALUE);

            setMargin(topButton   , new Insets(5));
            setMargin(bottomButton, new Insets(5));
            setMargin(leftButton  , new Insets(0, 5, 0, 5));
            setMargin(rightButton , new Insets(0, 5, 0, 5));

            setTop(topButton);
            setLeft(leftButton);
            setRight(rightButton);
            setBottom(bottomButton);
            setCenter(textArea);
        }

    }

