package sample;

import java.util.EventListener;
public interface ChangedValueListener extends EventListener{
    public void volumeChanged(ChangedValueEvent event);
}
