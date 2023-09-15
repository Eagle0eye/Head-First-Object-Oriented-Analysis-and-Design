package org.FindGuitarTester;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backwood;
    private Wood topwood;
    private int numStrings;
    private GuitarSpec(){}
    public GuitarSpec(Builder builder,String model,Type type,int numStrings,Wood backwood,Wood topwood){
        this.builder=builder;
        this.model=model;
        this.type=type;
        this.numStrings=numStrings;
        this.backwood=backwood;
        this.topwood=topwood;
    }

    public boolean matches(GuitarSpec searchguitarSpec){
        if (builder!=searchguitarSpec.getBuilder())
            return false;
        if ((model!=null) && (!model.equals("")) && (!model.equals(searchguitarSpec.getModel())))
            return false;
        if (type!=searchguitarSpec.getType())
            return false;
        if (numStrings!=searchguitarSpec.getNumStrings())
            return false;
        if (backwood!=searchguitarSpec.getBackwood())
            return false;
        if (topwood!=searchguitarSpec.getTopwood())
            return false;
        return true;
    }
    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackwood() {
        return backwood;
    }

    public Wood getTopwood() {
        return topwood;
    }

    public int getNumStrings() { return numStrings; }
}
