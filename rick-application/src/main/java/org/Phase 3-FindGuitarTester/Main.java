package org.FindGuitarTester;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        initializeInventory(inventory);



        GuitarSpec whatErinLikes= new GuitarSpec( Builder.FENDER, "Stratocastor", Type.ELECTRIC, 11,Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.Search(whatErinLikes);
        if (!matchingGuitars.isEmpty())
        {   int count=0;
            for (Iterator i = matchingGuitars.iterator();i.hasNext();) {
                Guitar guitar=(Guitar)i.next();
                GuitarSpec guitarSpec =guitar.getGuitarSpec();
                System.out.println("Erin, you might like this "+
                        guitarSpec.getBuilder()+" "+guitarSpec.getModel()+" "+guitar.getGuitarSpec()+" guitar:\n    "+
                        guitarSpec.getBackwood()+" back and saides,\n    "+
                        guitarSpec.getTopwood()+" top.\nYou can have it for only $"+guitar.getPrice()+"!");

                count++;
                System.out.println("--------------------------------");

            }
            System.out.println(count);
        }
        else
            System.out.println("Sorry, Erin, we have nothing for you");

    }

    private static void initializeInventory(Inventory inventory) {
        // Add a new guitar to list
        GuitarSpec instance ;
        instance= new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC,10,
                Wood.INDIAN_RESWOOD, Wood.SITKA);
        inventory.addGuitar("11277", 3999.95, instance);
        instance= new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                10,Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95693", 1499.95,instance );
        instance= new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,11,
                Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, instance);
        instance= new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC,10,
                Wood.MHOGANY, Wood.ADIRONDACK);
        inventory.addGuitar("122784", 5495.95, instance);
        instance= new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC,24,
                Wood.BRAZILIAN_RESWOOD, Wood.ADIRONDACK);
        inventory.addGuitar("76531", 6295.95, instance);
        instance= new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC,20,
                Wood.MHOGANY, Wood.MAPLE);
        inventory.addGuitar("70108276", 2295.95, instance);
        instance= new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC,15,
                Wood.MHOGANY, Wood.MHOGANY);
        inventory.addGuitar("82765501", 1890.95, instance);
        instance= new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC,22,
                Wood.BRAZILIAN_RESWOOD, Wood.ADIRONDACK);
        inventory.addGuitar("77023", 6275.95, instance);
        instance= new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC,12,
                Wood.INDIAN_RESWOOD, Wood.CEDAR);
        inventory.addGuitar("1092", 12995.95, instance);
        instance= new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC,33,
                Wood.COCOBOLO, Wood.CEDAR);
        inventory.addGuitar("566-62", 8999.95, instance);
        instance= new GuitarSpec(Builder.PRS, "Dave Navarro Signature",
                Type.ELECTRIC,14, Wood.MHOGANY, Wood.MAPLE);

        inventory.addGuitar("6 29584", 2100.95, instance);
    }
}
