package com.gdx.pizza;

public class pizza {
    private String name;
    private int size;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public pizza() {
    }

    public pizza(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    //pizza information
    public String showPizza(){
        return "This is a pizza.";
    }
}
