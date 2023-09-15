package org.FindGuitarTester;

public enum Builder {
    FENDER,MARTIN,GIBSON, COLLINGS,OLSON,RYAN,PRS;

    @Override
    public String toString() {
        switch (this)
        {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return  "Gibson";
            case OLSON: return  "Olson";
            case COLLINGS: return  "Collings";
            case RYAN:return "Ryan";
            case PRS: return "Prs";
            default: return "unspecified";
        }
    }
}
