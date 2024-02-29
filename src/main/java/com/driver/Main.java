package com.driver;

public class Main {
  public static void main(String[] args) {
//    DeluxePizza dp = new DeluxePizza(true);
//    System.out.println(dp.getPrice());
//    dp.addTakeaway();
//    dp.addExtraCheese();
//    dp.addTakeaway();
//    System.out.println(dp.getBill());
//    Pizza p = new Pizza(true);
//    p.addExtraCheese();
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addTakeaway();
//    System.out.println(p.getBill());
//    DeluxePizza p = new DeluxePizza(false);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addExtraToppings();
//    p.addExtraCheese();
//    p.getBill();
//    p.getBill();
    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
//    DeluxePizza p = new DeluxePizza(true);
//    p.getBill();
//    p.getBill();


//    Pizza p = new Pizza(false);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    p.addTakeaway();
//    System.out.println(p.getBill());
  }
}