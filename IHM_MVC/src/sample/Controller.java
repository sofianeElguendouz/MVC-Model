package sample;

import javafx.event.*;
public class Controller {
    private Model model;
    private View view;
    private View2 view2;
    public Controller(Model model, View view, View2 view2){
        this.model = model;
        this.view = view;
        this.view2 = view2;
        addListenersToModel();
    }
    private void addListenersToModel() {
        model.addVolumeListener(view);
        model.addVolumeListener(view2);

    }
    public void control(){
        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
                                         @Override
                                         public void handle(ActionEvent e)
                                         {increment(); } } );
        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
                                        @Override
                                        public void handle(ActionEvent e)
                                        {traitClicMethod(); } } );
        view2.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {valider(); } } );

    }
    private void traitClicMethod(){
        int valeur= (int) view.getSpinner().getValue();
        model.setValue(valeur);
    }

    private void increment ()
    {
        int valeur = view2.getValue() ;
        valeur++;
        model.setValue(valeur);
        view2.setText(Integer.toString(model.getValue()));
    }

    private void valider(){
        int value = view2.getValue();
        model.setValue(value);
    }

}

