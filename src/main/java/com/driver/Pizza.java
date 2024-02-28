//package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//    boolean extracheeze = false;
//    boolean extratopping = false;
//    boolean extrtakeway = false;
//    boolean GetBill = false;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(isVeg){
//            price = 300;
//
//            bill="Base Price Of The Pizza "+price+"\n";
//        }else {
//            price = 400;
//            bill = "Base Price Of The Pizza "+price+"\n";
//        }
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        if(extracheeze== false) {
//            // your code goes here
//            bill = bill + "Extra cheese added: " + 80 + "\n";
//            price += 80;
//        }
//        extracheeze = true;
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if(extratopping == false) {
//            if (isVeg) {
//                bill ="Extra Toppings Added: "+price+"\n";
//                price += 70;
//            } else {
//                bill="Extra Toppings Added: "+price+"\n";
//                price += 120;
//            }
//        }
//        extratopping = true;
//
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(extrtakeway==false) {
//            bill ="Paperbag Added: "+20+"\n";
//            price += 20;
//        }
//        extrtakeway = true;
//    }
//
//
//    public String getBill(){
//        // your code goes here
//        if(GetBill == false) {
//            bill = bill + "Total Price: " + price + "\n";
//            GetBill = true;
//            return bill;
//        }
//        return  null;
//
//    }
//}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean extracheese = false;
    boolean extratopping = false;
    boolean extrtakeway = false;
    boolean GetBill = false;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            price = 300;
            bill = "Base Price Of The Pizza: " + price + "\n";
        } else {
            price = 400;
            bill = "Base Price Of The Pizza: " + price + "\n";
        }
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (extracheese == false) {
            // your code goes here
            bill = bill + "Extra Cheese Added: " + 80 + "\n";
            price += 80;
        }
        extracheese = true;
    }

    public void addExtraToppings() {
        // your code goes here
        if (extratopping == false) {
            if (isVeg) {
                bill = bill + "Extra Toppings Added: " + 70 + "\n";
                price += 70;
            } else {
                bill = bill + "Extra Toppings Added: " + 120 + "\n";
                price += 120;
            }
        }
        extratopping = true;
    }


        public void addTakeaway(){
        // your code goes here
        if(extrtakeway==false) {
            bill =bill+"Paperbag Added: "+20+"\n";
            price += 20;
        }
        extrtakeway = true;
    }

        public String getBill(){
        // your code goes here
        if(GetBill == false) {
            bill = bill + "Total Price: " + price + "\n";
            GetBill = true;
            return bill;
        }
        return  null;

    }
}
