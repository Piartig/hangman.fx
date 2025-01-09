import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button[] btns = new Button[24];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hangman");

        char bst = 'A';
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button();
            btns[i].setText("" + bst);
            bst++;
        }

        BorderPane bottomBorder = new BorderPane();

        HBox layout = new HBox(10); // 10 Pixel Abstand zwischen Buttons
        for (Button btn : btns) {
            layout.getChildren().add(btn); // Buttons hinzufügen
        }


        bottomBorder.setBottom(layout);
        layout.setAlignment(Pos.BASELINE_CENTER);


        Scene scene = new Scene(bottomBorder, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}