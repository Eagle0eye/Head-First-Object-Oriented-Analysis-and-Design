package org.example;

public class Main {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes= new Guitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        Guitar guitar = inventory.Search(whatErinLikes);

        if (guitar!=null)
            System.out.println("Erin, you might like this "+
                    guitar.getBuiilder()+" "+guitar.getModel()+" "+guitar.getType()+" guitar:\n    "+
                    guitar.getBackWood()+" back and sides,\n    "+
                    guitar.getTopWood()+" top.\nYou can have it for only $"+guitar.getPrice()+"!");
        else
            System.out.println("Sorry, Erin, we have nothing for you");
        System.out.println(inventory.getGuitar("11277").getBackWood());
    }

    private static void initializeInventory(Inventory inventory) {
        // Add a new guitar to list
        inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Wood.INDIAN_RESWOOD, Wood.SITKA);
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("122784", 5495.95, Builder.MARTIN, "D-18", Type.ACOUSTIC,
                Wood.MHOGANY, Wood.ADIRONDACK);
        inventory.addGuitar("76531", 6295.95, Builder.MARTIN, "OM-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_RESWOOD, Wood.ADIRONDACK);
        inventory.addGuitar("70108276", 2295.95, Builder.GIBSON, "Les Paul", Type.ELECTRIC,
                Wood.MHOGANY, Wood.MAPLE);
        inventory.addGuitar("82765501", 1890.95, Builder.GIBSON, "SG '61 Reissue",
                Type.ELECTRIC, Wood.MHOGANY, Wood.MHOGANY);
        inventory.addGuitar("77023", 6275.95, Builder.MARTIN, "D-28", Type.ACOUSTIC,
                Wood.BRAZILIAN_RESWOOD, Wood.ADIRONDACK);
        inventory.addGuitar("1092", 12995.95, Builder.OLSON, "SJ", Type.ACOUSTIC,
                Wood.INDIAN_RESWOOD, Wood.CEDAR);
        inventory.addGuitar("566-62", 8999.95, Builder.RYAN, "Cathedral", Type.ACOUSTIC,
                Wood.COCOBOLO, Wood.CEDAR);
        inventory.addGuitar("6 29584", 2100.95, Builder.PRS, "Dave Navarro Signature",
                Type.ELECTRIC, Wood.MHOGANY, Wood.MAPLE);
    }
}
