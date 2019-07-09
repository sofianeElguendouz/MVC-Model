package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

        Stage secondStage = new Stage();
        View view = new View(primaryStage) ;
        View2 view2 = new View2(secondStage);
        Model model = new Model(0);
        //un controleur pour deux vue et un model
        Controller controller=new Controller(model,view, view2);
        controller.control();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
