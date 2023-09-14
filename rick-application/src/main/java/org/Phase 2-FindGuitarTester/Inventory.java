package org.FindGuitarTester;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory  {
    private List<Guitar> guitars;

    public  Inventory(){
        guitars = new LinkedList<>();
    }

    public void addGuitar (String SerialName, double price,Builder builder,String model,Type type,Wood backWood,Wood topWood)
    {
        Guitar guitar = new Guitar(SerialName,price,builder,model,type,backWood,topWood);
        guitars.add(guitar);

    }

    public Guitar getGuitar(String SerialName){
        for(Iterator<Guitar> i = this.guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = i.next();
            if (guitar.getSerialName().equals(SerialName))
                return guitar;
        }
        return null;
    }

    public List Search(GuitarSpec searchGuitar){
        List<Guitar> matchingGuitars= new LinkedList();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = i.next();
            GuitarSpec guitarSpec =guitar.getGuitarSpec();
            if (searchGuitar.getBuilder() != guitarSpec.getBuilder())
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if ((model!=null) && (!model.equals("")) && (!model.equals((guitarSpec.getModel().toLowerCase()))))
                continue;
            if (searchGuitar.getType()!= guitarSpec.getType())
                continue;
            if (searchGuitar.getBackwood()!= guitarSpec.getBackwood())
                continue;
            if (searchGuitar.getTopwood()!= guitarSpec.getTopwood())
                continue;
            matchingGuitars.add(guitar);
        }

        return matchingGuitars;
    }

    }


