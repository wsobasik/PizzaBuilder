package com.pizza;

public class Main {


    public static void main(String[] args) {


        Builder builder = new Builder();
        Pizza pizza =
                builder.withEdgesCheese().withPieType(Pizza.PieType.THICK).withSauce(Pizza.Sauce.TOMATO).withSize(Pizza.Size.MEDIUM).build();


    }

}
