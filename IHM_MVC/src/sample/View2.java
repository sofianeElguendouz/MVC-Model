package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class View2 implements ChangedValueListener{
    private TextField tf;
    private Button bouton;
    private Scene scene;
    public View2(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Vue avec champ de saisie ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        scene=new Scene(root);
//ajouter un champ de texte
        tf = new TextField();

//ajouter un bouton
        bouton = new Button("Valider");
        bouton.setLayoutX(140);
        bouton.setLayoutY(100);
        root.getChildren().add(tf);
        root.getChildren().add(bouton);
        primaryStage.setScene(scene);
        primaryStage.show();}
    public Button getButton(){
        return bouton;
    }
    public void setText(String text){tf.setText(text);}
    public int getValue(){return Integer.parseInt(tf.getText());}

    @Override
    public void volumeChanged(ChangedValueEvent event) {
        tf.setText(Integer.toString(event.getNewValue())) ;
    }
}
