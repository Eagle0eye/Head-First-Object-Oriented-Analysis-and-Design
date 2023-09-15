package org.FindGuitarTester;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backwood;
    private Wood topwood;
    private GuitarSpec(){}
    public GuitarSpec(Builder builder,String model,Type type,Wood backwood,Wood topwood){
        this.builder=builder;
        this.model=model;
        this.type=type;
        this.backwood=backwood;
        this.topwood=topwood;
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
}
