package shopping;
import java.util.*;

/* Driver class
 * This class is used to select cart operation based on the use input.*/

public class ShoppingCart {

	public static void main(String[] args) {
		
		Storage store = new Storage();
		Scanner input = new Scanner(System.in);
		boolean exit=true;
		String removeOption="n";
		int id;
		
		while(exit){
			System.out.println("Enter item number: ");
			int choice = input.nextInt();
			if(choice<1 || choice>7){
				System.out.println("\nEnter valid option !");
			}
			else if(choice==6){
				Cart.showCart();
				System.out.println("\nDo you want to remove any item ? (y/n)");
				removeOption=input.next();
				
				if(removeOption.equals("y") || removeOption.equals("Y")){
					System.out.println("\nEnter item number to remove: ");
					id=input.nextInt();
					Cart.removeItem(id);;
				}else{
					
				}
			}else if(choice==7){
				System.out.print("\n");
				exit=false;
				Cart.printInvoice();
				System.out.println("\nThank you for shopping !");
				
			}else{
				Cart.addItem(Storage.getItem(choice));
			}
		}
	}

}
