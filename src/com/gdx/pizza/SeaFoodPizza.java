package com.gdx.pizza;

public class SeaFoodPizza extends pizza{
    private String dosing;

    public String getDosing() {
        return dosing;
    }

    public void setDosing(String dosing) {
        this.dosing = dosing;
    }

    public SeaFoodPizza(String name, int size, int price, String dosing) {
        super(name, size, price);
        this.dosing = dosing;
    }
    public String showPizza(){
        return "This is a " +getName() + " pizza."
                +"\nSize: " +getSize()
                +"\nDosing: "+getDosing()
                +"\nPrice: "+ getPrice();
    }
}
