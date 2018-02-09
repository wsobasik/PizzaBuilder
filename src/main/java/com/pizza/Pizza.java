package com.pizza;

public class Pizza {


    public enum Size {XXL, MEDIUM, SMALL}

    ;

    public enum Sauce {
        CHEESE, GARLIC, CREME, TOMATO;
    }

    ;

    public enum PieType {THIN, THICK}

    ;


    public Size size;
    public Sauce sauce;
    public PieType pieType;
    public Boolean edgesCheese;


    public Pizza(Size size, Sauce sauce, PieType pieType, boolean edgesCheese) {
        this.size = size;
        this.sauce = sauce;
        this.pieType = pieType;
        this.edgesCheese = edgesCheese;
    }


    public Pizza(boolean edgesCheese) {
        Size size = Size.MEDIUM;
        Sauce sause = Sauce.TOMATO;
        PieType pieType = PieType.THICK;
        this.edgesCheese = edgesCheese;
    }

    public boolean isEdgesCheese() {
        return edgesCheese;
    }

    public void setEdgesCheese(boolean edgesCheese) {
        this.edgesCheese = edgesCheese;
    }
}


class Builder {

    public enum Size {XXL, MEDIUM, SMALL}

    ;

    public enum Sauce {
        CHEESE, GARLIC, CREME, TOMATO;
    }

    ;

    public enum PieType {THIN, THICK}

    ;
    public Pizza.Size size;
    public Pizza.Sauce sauce;
    public Pizza.PieType pieType;
    public boolean edgesCheese;


    public Pizza build() {
        return new Pizza(size, sauce, pieType, edgesCheese);
    }

    public Builder withEdgesCheese() {
        this.edgesCheese = true;
        return this;
    }

    public Builder witoutEdgesCheese() {
        this.edgesCheese = false;
        return this;
    }

    public Builder withSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public Builder withSauce(Pizza.Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    public Builder withPieType(Pizza.PieType pieType) {
        this.pieType = pieType;
        return this;
    }
}