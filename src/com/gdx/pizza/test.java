package com.gdx.pizza;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //input the option
        Scanner sc = new Scanner(System.in);
        System.out.println("Please the pizza type you want: \n 1.Bacon Pizza \n 2.Seafood Pizza ");
        int order = sc.nextInt();

        pizza p = pizzaShop.getPizza(order);
        System.out.println(p.showPizza());

        //Prepare the pizza according to the order
        /*if(order == 1){
            System.out.println("Please input the bacon's weight:");
            int weight = sc.nextInt();
            System.out.println("Please input the pizza size:");
            int size = sc.nextInt();
            System.out.println("Please input the pizza price:");
            int price = sc.nextInt();
            //封装成对象
            BaconPizza bp = new BaconPizza("Bacon Pizza", size, price, weight);
            System.out.println(bp.showPizza());

        }
        if(order ==2){
            System.out.println("Please input the bacon's dosing:");
            String dosing = sc.next();
            System.out.println("Please input the pizza size:");
            int size = sc.nextInt();
            System.out.println("Please input the pizza price:");
            int price = sc.nextInt();
            //封装成对象
            SeaFoodPizza sp = new SeaFoodPizza("Seafood Pizza", size, price, dosing);
            System.out.println(sp.showPizza());
        }*/

    }
}
