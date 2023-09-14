package org.FindGuitarTester;

public enum Wood {
    INDIAN_RESWOOD, BRAZILIAN_RESWOOD, MHOGANY,MAPLE,COCOBOLO,CEDAR, ADIRONDACK,ALDER,SITKA;

    @Override
    public String toString() {
        switch (this)
        {
            case INDIAN_RESWOOD: return  "Indian Reswood";
            case BRAZILIAN_RESWOOD: return "Brazilian Reswood";
            case MHOGANY: return "Mhogany";
            case MAPLE: return "Maple";
            case COCOBOLO: return "Cocobolo";
            case CEDAR: return "Cedar" ;
            case ADIRONDACK: return "Adirondack";
            case ALDER: return "Alder";
            case SITKA: return "Sitka";
            default: return "unspecified";
        }
    }
}
