package com.gdx.pizza;

import java.util.Scanner;

public class pizzaShop {
    public static pizza getPizza(int order){
        pizza p = null;
        Scanner sc = new Scanner(System.in);
        if(order == 1){
            System.out.println("Please input the bacon's weight:");
            int weight = sc.nextInt();
            System.out.println("Please input the pizza size:");
            int size = sc.nextInt();
            System.out.println("Please input the pizza price:");
            int price = sc.nextInt();
            //封装成对象
            p = new BaconPizza("Bacon Pizza", size, price, weight);
            //System.out.println(p.showPizza());

        }
        if(order ==2){
            System.out.println("Please input the bacon's dosing:");
            String dosing = sc.next();
            System.out.println("Please input the pizza size:");
            int size = sc.nextInt();
            System.out.println("Please input the pizza price:");
            int price = sc.nextInt();
            //封装成对象
            p = new SeaFoodPizza("Seafood Pizza", size, price, dosing);
            //System.out.println(p.showPizza());
        }
        return p;
    }

}
