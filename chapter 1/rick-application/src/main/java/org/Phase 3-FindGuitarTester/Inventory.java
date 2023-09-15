package org.FindGuitarTester;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory  {
    private List<Guitar> guitars;

    public  Inventory(){
        guitars = new LinkedList<>();
    }

    public void addGuitar (String SerialName, double price,GuitarSpec guitarSpec)
    {
        Guitar guitar = new Guitar(SerialName,price, guitarSpec);
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



    public List Search(GuitarSpec Guitar){
        List<Guitar> matchingGuitars= new LinkedList();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = i.next();
            GuitarSpec guitarSpec =guitar.getGuitarSpec();
            if (guitarSpec.matches(Guitar))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    }


