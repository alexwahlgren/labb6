package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements MenuItem {
	
	private String menuTitle;
	private ArrayList<MenuItem> allItems;
	
	public Menu(String menuTitle) {
		this.menuTitle = menuTitle;
		this.allItems = new ArrayList<MenuItem>();
	}
	
	public ArrayList<MenuItem> getAllItems() {
		return allItems;
	}

	public void add(AbstractMenuItem item) {
//		Lagrar alla menuitems i en arraylist.
		if(!(allItems.contains(item)))
			allItems.add(item);
	}
	
	public boolean exists(String item) {
		for (MenuItem c : allItems) {
			if(c.getTitle().equals(item))
				return true;
		}
		return false;
	}

	@Override
	public String getTitle() {
		return menuTitle;
	}
	
	public void printHeadLine() {
		String understrykning = "";
		/**
		 * Går igenom varje char i menytiteln för att understrykningen ska bli rätt längd.
		 */
		for( char c : getTitle().toCharArray()) {
			understrykning += '=';
		}
		/**
		 * Skriver ut menytiteln med understrykning.
		 */
		System.out.print(getTitle() + "\n\n" + understrykning + "\n\n");
	}
	
	@Override
	public void execute() {
		/**
		 * Skriver ut alla undermenyer
		 */
		if(!allItems.isEmpty())	{
			for(int i=0; i<allItems.size(); i++) {
				System.out.println(i + ". " + allItems.get(i).getTitle());
			}
			
			System.out.print("\nVälj ett alternativ 0-"+(allItems.size()-1)+": ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			System.out.print("\n\n");
			allItems.get(input).execute();
		}
	}

}
