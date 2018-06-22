/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine.offline2;

public class InventoryDepletionState implements VendingMachineState{
    
    @Override
 public void selectProductAndInsertMoney( int amount, String productName, int productNum)
 {
 System.out.println(amount + "tk has been inserted and " + productName + " has been selected...");

 }

 @Override
 public void dispenseProduct()
 {
 System.out.println("Vending Machine cannot dispense product because of insufficient amount of product...");

 }
    
}