package org.example;

public class Guitar {
    private String SerialName,model;
    private Builder builder;
    private Type type;
    private Wood backWood,topWood;
    private double price;

    public Guitar(String SerialName, double price,Builder builder,String model,Type type,Wood backWood,Wood topWood){
        this.SerialName=SerialName;
        this.price=price;
        this.builder = builder;
        this.model=model;
        this.type=type;
        this.backWood=backWood;
        this.topWood=topWood;
    }

    public String getSerialName() {
        return SerialName;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Builder getBuiilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }


}
