package org.DogDoorSimulator;

public class Remote {
    private DogDoor door;
    public Remote(DogDoor door){
        this.door=door;
    }
    public void pressButton(){
        System.out.println("Pressing the remote control button...");
        if(door.isOpen()){
            door.close();
            System.out.println("The dog door closes");
        }
        else {
            door.open();
            System.out.println("The dog door opens");
        }
    }
}
