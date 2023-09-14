package org.FindGuitarTester;

public class Guitar {
    private String SerialName;
    private GuitarSpec GuitarSpec;
    private double price;

    public Guitar(String SerialName, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood){
        this.SerialName=SerialName;
        this.price=price;
        this.GuitarSpec = new GuitarSpec(builder,model,type,backWood,topWood);
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

    public  GuitarSpec getGuitarSpec(){return GuitarSpec;}

}
