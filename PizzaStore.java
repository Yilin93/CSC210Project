package com.example.fxdemo;
//create PizzaStore class
public class PizzaStore{

    //create private fields and assign values to each
    private String[][] userInfo = {{"Baskin"},{"100 Chambers"}};
    private String[] itemName = {"pepperoni", "cheese","mushroom","veggie"};
    private double[] itemPrice = {15,10,12,13};
    private final double taxrate = 0.08;

    /**public PizzaStore(String[][] info, String[] names, double[] prices)
     {
     userInfo = info;
     itemName = names;
     itemPrice = prices;
     taxrate = 0.095;
     }**/

    //create getusername method
    public String getusername()
    {
        return  userInfo[0][0];
    }

    //create getpassword method
    public String getpassword()
    {
        return userInfo[1][0];
    }

    //create getprice method to return the price by given name
    public double getPrice(String iname)
    {
        for(int i = 0; i < itemName.length; i++)
        {
            if(itemName[i].equalsIgnoreCase(iname)){
                return itemPrice[i];
            }

        }
        return -1;
    }

    //create getitemname method to return item name
    public String[] getItemName()
    {
        return itemName;
    }

    //create getcost method to return cost
    public double getCost(String iname, int quantity)
    {
        double cost = getPrice(iname);
        return cost * quantity;
        //return cost < 0 ? 0: cost * quantity;
    }

    //create gettaxes method to return tax
    public double getTaxes(double cost)
    {
        return cost * taxrate;
    }

    //create gettotalcost method to return total cost
    public double gettotalcost(String iname, int quantity)
    {
        double cost = getCost(iname, quantity);
        double tax = getTaxes(cost);
        return cost + tax;
    }

}