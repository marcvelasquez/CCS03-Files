/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.candymachine;

/**
 *
 * @author Marc Victor L. Velasquez
 */
public class CashRegister {
    private int cashOnHand;
    
    public CashRegister() {
        cashOnHand = 500;
    }
    
    public CashRegister(int cash) {
        cashOnHand = cash;
    }
    
    public void acceptAmount(int amount) {
        cashOnHand += amount;
    }
}
