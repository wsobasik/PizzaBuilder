package com.pizza;

import org.hamcrest.JavaLangMatcherAssert;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {


    @Test
    public void shouldReturnBasePizzaWhenUsePizzaBuiklder(){
        Builder builder = new Builder();
        Pizza pizza =
                builder.withEdgesCheese().withPieType(Pizza.PieType.THICK).withSauce(Pizza.Sauce.TOMATO).withSize(Pizza.Size.MEDIUM).build();
        Assert.assertTrue(pizza.edgesCheese);
        Assert.assertTrue(pizza.pieType.equals(Pizza.PieType.THICK));
        Assert.assertTrue(pizza.sauce.equals(Pizza.Sauce.TOMATO));
        Assert.assertTrue(pizza.size.equals(Pizza.Size.MEDIUM));
        Assert.assertEquals(pizza,  new Pizza(Pizza.Size.MEDIUM, Pizza.Sauce.TOMATO, Pizza.PieType.THICK, true));
    }
}
