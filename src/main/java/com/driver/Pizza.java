package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean extracheeze = false;
    boolean extratopping = false;
    boolean extrtakeway = false;
    boolean GetBill = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;

            bill="base price "+price;
        }else {
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extracheeze== false) {
            // your code goes here
            bill = bill + "Extra cheese added " + 80 + "\n";
            price += 80;
        }
        extracheeze = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extratopping == false) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
        }
        extratopping = true;

    }

    public void addTakeaway(){
        // your code goes here
        if(extrtakeway==false) {
            price += 50;
        }
        extrtakeway = true;
    }


    public String getBill(){
        // your code goes here
        if(GetBill == false) {
            bill = bill + "Total Price " + price + "\n";
            GetBill = true;
            return bill;
        }
        return  null;

    }
}
