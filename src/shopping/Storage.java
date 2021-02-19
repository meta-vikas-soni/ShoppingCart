package shopping;
import java.util.*;

/* This class is used to add items to the storage unit.*/

public class Storage {
	
	private Item bread = new Item("Bread Packet",30,0);
	private Item butter = new Item("Amul  Butter",40,0);
	private Item cheese = new Item("Cheese  Pack",50,0);
	private Item cake = new Item("Fruit   Cake",200,0);
	private Item biscuit = new Item("Oreo Biscuit",10,0);
	private static ArrayList <Item> storage = new ArrayList<Item>();
	
	
	public Storage()
	{
		storage.add(biscuit);
		storage.add(bread);
		storage.add(butter);
		storage.add(cheese);
		storage.add(cake);
	
		printStore(storage);
	}
	public void printStore(ArrayList<Item> Store){
		int c=1;
		System.out.println("WELCOME TO OUR STORE\n");
		System.out.print("S.No"+"\t"+"Item"+"\t\t"+"Price\n");
		for(Object i:Store){
			System.out.println(c+"\t"+((Item)i).itemName+"\t"+"$"+((Item) i).itemPrice);
			c++;
		}
		
		System.out.println("\n6 View Cart");
		System.out.println("7 Generate Invoice");
	}
	
	public static Item getItem( int input)
	{
		return storage.get(input-1);
		
	}

}
