package org.DogDoorSimulator;public class Main {
    public static void main(String[] args)
    {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println();
        remote.pressButton();
        System.out.println("Fido barks to go outside...");
        System.out.println("\nFido’s all done...");

        try {
            Thread.currentThread().sleep(10000);

        }catch (InterruptedException e)
        {
            System.out.println("...but he's stuck outside!");
            System.out.printf("\nFido starts breaking....");
            System.out.println("...so Gina grabs the remote control");
            remote.pressButton();
            System.out.println("\nFido’s back inside...");
        }
    }
}