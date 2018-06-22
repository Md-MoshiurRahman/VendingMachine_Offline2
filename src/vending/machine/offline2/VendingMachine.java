/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine.offline2;

class VendingMachine implements VendingMachineState
{
 int Pepsi,Up7,Coke,Fanta;
 
 private VendingMachineState vendingMachineState;

 public VendingMachine(int pepsi,int up7,int coke,int fanta)
 {
  this.Pepsi=pepsi;
  this.Up7=up7;
  this.Coke=coke;
  this.Fanta=fanta;
 vendingMachineState = new NoMoneyState();
 }

 public VendingMachineState getVendingMachineState()
 {
 return vendingMachineState;
 }

 public void setVendingMachineState( VendingMachineState vendingMachineState )
 {
 this.vendingMachineState = vendingMachineState;
 }

 @Override
 public void selectProductAndInsertMoney( int amount, String productName, int productNum )
 {
     
     if(productName=="Pepsi" && amount>=(20*productNum) && Pepsi>=productNum)
     {
         VendingMachineState hasMoneyState = new HasMoneyState();
         setVendingMachineState(hasMoneyState);
         Pepsi=Pepsi-productNum;
     }
     
     if(productName=="Pepsi" && productNum>Pepsi)
     {
         VendingMachineState inventoryDepletionState = new InventoryDepletionState();
         setVendingMachineState(inventoryDepletionState);
     }
     
     
     if(productName=="Coke" && amount>=(25*productNum) && Coke>=productNum)
     {
         VendingMachineState hasMoneyState = new HasMoneyState();
         setVendingMachineState(hasMoneyState);
         Coke=Coke-productNum;
     }
     
     if(productName=="Coke" && productNum>Coke)
     {
         VendingMachineState inventoryDepletionState = new InventoryDepletionState();
         setVendingMachineState(inventoryDepletionState);
     }
     
     if(productName=="7up" && amount>=(25*productNum) && Up7>=productNum)
     {
         VendingMachineState hasMoneyState = new HasMoneyState();
         setVendingMachineState(hasMoneyState);
         Up7=Up7-productNum;
     }
     
     if(productName=="7up" && productNum>Up7)
     {
         VendingMachineState inventoryDepletionState = new InventoryDepletionState();
         setVendingMachineState(inventoryDepletionState);
     }
     
     
     if(productName=="Fanta" && amount>=(20*productNum) && Fanta>=productNum)
     {
         VendingMachineState hasMoneyState = new HasMoneyState();
         setVendingMachineState(hasMoneyState);
         Fanta=Fanta-productNum;
     }
     
     if(productName=="Fanta" && productNum>Fanta)
     {
         VendingMachineState inventoryDepletionState = new InventoryDepletionState();
         setVendingMachineState(inventoryDepletionState);
     }
     
     vendingMachineState.selectProductAndInsertMoney(amount, productName, productNum);

 }

 @Override
 public void dispenseProduct()
 {
 VendingMachineState noMoenyState = new NoMoneyState();
 vendingMachineState.dispenseProduct();

 /*
  * Product has been dispensed so vending Machine changed the
  * internal state to 'NoMoneyState'
  */
 if( vendingMachineState instanceof HasMoneyState )
 {
 setVendingMachineState(noMoenyState);
 System.out.println("VendingMachine internal state has been moved to : " + vendingMachineState.getClass().getName());
 }
 
 if( vendingMachineState instanceof InventoryDepletionState )
 {
 setVendingMachineState(noMoenyState);
 System.out.println("VendingMachine internal state has been moved to : " + vendingMachineState.getClass().getName());
 }

 }

}