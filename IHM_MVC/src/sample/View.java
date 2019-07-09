package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;


public class View implements ChangedValueListener{
    private Button bouton;
    private Scene scene;
    private Spinner<Integer> spinner;

    public View(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Vue avec spinner ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        scene=new Scene(root);

    /* Spinner */
        spinner = new Spinner<Integer>(0,50,0);
        spinner.setLayoutX(40);
        spinner.setLayoutY(75);
        spinner.setEditable(true);
    //ajouter un bouton
        bouton = new Button("Valider");
        bouton.setLayoutX(140);
        bouton.setLayoutY(100);
        root.getChildren().add(spinner);
        root.getChildren().add(bouton);
        primaryStage.setScene(scene);
        primaryStage.show();}

    public Spinner getSpinner(){ return spinner;}
    public Button getButton(){ return bouton;}

    @Override
    public void volumeChanged(ChangedValueEvent evt){
        spinner.setValueFactory(new
                SpinnerValueFactory.IntegerSpinnerValueFactory(0,1000,evt.getNewValue()));
    }
}
