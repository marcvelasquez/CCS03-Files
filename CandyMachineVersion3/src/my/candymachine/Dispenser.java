/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.candymachine;

/**
 *
 * @author Marc Victor L. Velasquez
 */
public class Dispenser {
    private int numberOfItems, cost;
    
    public Dispenser() {
        numberOfItems = 5;
        cost = 50;
    }
    
    public Dispenser(int items, int price) {
        numberOfItems = items;
        cost = price;
    }
    
    public int getCount() {
        return numberOfItems;
    }
    
    public int getProductCost() {
        return cost;
    }
    
    public void makeSale() {
        numberOfItems -= 1;
    }
}
