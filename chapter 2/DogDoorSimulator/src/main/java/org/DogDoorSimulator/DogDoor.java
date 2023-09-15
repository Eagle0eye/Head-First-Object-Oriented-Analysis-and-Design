package org.DogDoorSimulator;

public class DogDoor {
    private boolean open;
    public DogDoor(){open=false;}
    public void open(){this.open=true;}
    public void close(){this.open=false;}
    public boolean isOpen(){return open;}
}
