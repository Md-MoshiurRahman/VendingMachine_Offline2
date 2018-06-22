/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine.offline2;

public class Client {
   public void order(VendingMachine vendingMachine)
   {
       vendingMachine.dispenseProduct();

 //System.out.println("Current VendingMachine State : " + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

 
 vendingMachine.selectProductAndInsertMoney(100, "Pepsi", 2);
 vendingMachine.dispenseProduct();
 

 //System.out.println("\nCurrent VendingMachine State : " + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

 vendingMachine.selectProductAndInsertMoney(10, "Fanta", 1);
 vendingMachine.dispenseProduct();


 vendingMachine.selectProductAndInsertMoney(100, "Pepsi", 10);
 vendingMachine.dispenseProduct();
 //System.out.println("\nCurrent VendingMachine State : " + vendingMachine.getVendingMachineState().getClass().getName());
   }
}
