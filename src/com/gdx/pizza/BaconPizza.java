package com.gdx.pizza;

public class BaconPizza extends pizza{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    public String showPizza(){
        return "This is a " +getName() + " pizza."
                +"\nSize: " +getSize()
                +"\nBacon grams: "+getWeight()
                +"\nPrice: "+ getPrice();
    }
}
