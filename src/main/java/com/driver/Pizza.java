package com.driver;

public class Pizza {
    /*
    Base Price Of The Pizza: 300
Extra Cheese Added: 80
Extra Toppings Added: 70
Paperbag Added: 20
Total Price: 470
     */

    private int price;
    private Boolean isVeg;
    private String bill;
    private int p;
    private int extraCheesePrice;
    private int countCheese;
    private int extraToppingsPrice;
    private int countT;
    private int takeAwayPrice;
    private int countTakeAway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        extraCheesePrice = 80;
        takeAwayPrice = 20;
        // your code goes here
        if(isVeg){
            p = 300;
            price = 300;
            extraToppingsPrice = 70;
        }
        else{
            p = 400;
            price = 400;
            extraToppingsPrice = 120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price += extraCheesePrice;
        countCheese++;

    }

    public void addExtraToppings() {
        // your code goes here
        price += extraToppingsPrice;
        countT++;
    }

    public void addTakeaway(){
        // your code goes here
        price += takeAwayPrice;
        countTakeAway++;
    }

    public String getBill(){
        // your code goes here

        bill = "Base Price Of The Pizza: "+p+"\n" +
                "Extra Cheese Added: "+extraCheesePrice*countCheese+"\n" +
                "Extra Toppings Added: "+extraToppingsPrice*countT+"\n" +
                "Paperbag Added: "+takeAwayPrice*countTakeAway+"\n" +
                "Total Price: "+price+"\n";
        return this.bill;
    }
}
