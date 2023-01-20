package org.example;

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

    public Guitar Search(Guitar searchGuitar){
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = i.next();
            if (searchGuitar.getBuiilder() != guitar.getBuiilder())
                continue;
            String model = searchGuitar.getModel().toLowerCase();
            if ((model!=null) && (!model.equals("")) && (!model.equals((guitar.getModel().toLowerCase()))))
                continue;
            if (searchGuitar.getType()!= guitar.getType())
                continue;
            if (searchGuitar.getBackWood()!= guitar.getBackWood())
                continue;
            if (searchGuitar.getTopWood()!= guitar.getTopWood())
                continue;
            return guitar;
        }

        return null;
    }

    }


