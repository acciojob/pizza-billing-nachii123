package com.driver;

public class DeluxePizza extends Pizza {

    private int price;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
//    public int getPrice(){
//        return this.price;
//    }
    // addd extra cheeze
}
