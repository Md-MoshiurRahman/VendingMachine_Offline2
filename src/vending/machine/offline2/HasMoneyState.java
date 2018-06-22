/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine.offline2;

class HasMoneyState implements VendingMachineState
{
    private int amountback,pronum1;
    private String proname1;
    
    

 @Override
 public void selectProductAndInsertMoney( int amount, String productName, int productNum)
 {
 System.out.println(amount + "tk has been inserted and " + productName + " has been selected...");
 //this.amount1=amount;
 this.pronum1=productNum;
 this.proname1=productName;
 
 if(proname1=="Pepsi")
 {
   amountback=amount-(productNum*20);  
 }
 
 if(proname1=="Coke")
 {
   amountback=amount-(productNum*25);  
 }
 
 if(proname1=="7up")
 {
   amountback=amount-(productNum*25);  
 }
 
 if(proname1=="Fanta")
 {
   amountback=amount-(productNum*20);  
 }
 
 }

 @Override
 public void dispenseProduct()
 {
 System.out.println("Vending Machine  dispensed "+pronum1+ " "+proname1+" and return "+amountback+" tk...");
 }

}