package vending.machine.offline2;

/**
 *
 * @author USER
 */
interface VendingMachineState
{
 
 public void selectProductAndInsertMoney(int amount,String productName, int productNum);

 public void dispenseProduct();

}



public class Vending
{

 public static void main( String[] args )
 {

     System.out.println("Pepsi -> 20");
     System.out.println("Coke -> 25");
     System.out.println("7up -> 25");
     System.out.println("Fanta -> 20");

     
 VendingMachine vendingMachine = new VendingMachine(10,10,10,10);
 
 Client client =new Client();
 client.order(vendingMachine);

 }

}
