package sample;

import java.util.ArrayList;
public class Model {
    private int value;
    private ArrayList<ChangedValueListener> listnerList = new
            ArrayList<ChangedValueListener>(100);

    public Model() {
        this(0);
    }

    public Model(int valeur) {
        super();
        this.value = valeur;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        fireVolumeChanged();
    }

    public void addVolumeListener(ChangedValueListener listener) {
        listnerList.add(listener);
    }

    public void removeVolumeListener(ChangedValueListener listener) {
        listnerList.remove(listener);
    }

    public void fireVolumeChanged() {
        ChangedValueEvent evt = new ChangedValueEvent(this, getValue());
        for (int i = 0; i < listnerList.size(); i++) {
            listnerList.get(i).volumeChanged(evt);
        }
    }
}