package lab6;

import java.util.Scanner;

public class Menu implements MenuItem {
	
	private String menuTitle;
	private int[] menuNumber;
	private MenuItem[] allItems;
	private AbstractMenuItem item;
	private int n = 0;
	
	public Menu(String menuTitle) {
		this.menuTitle = menuTitle;
	}
	
	public void add(AbstractMenuItem item) {
		this.item = item;
		//Lagrar alla värden som ska stå framför varje meny i en array.
		menuNumber = new int[n+1];
		menuNumber[n] = n;
		
		//Lagrar alla menuitems i en array.
		allItems = new MenuItem[n+1];
		allItems[n] = item;
		
		n++;
	}

	@Override
	public String getTitle() {
		return menuTitle;
	}

	@Override
	public void execute() {
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
		
		/**
		 * Skriver ut alla undermenyer
		 */
		for(int i=0; i<allItems.length; i++) {
			System.out.println(menuNumber[i] + ". " + item.getTitle());
		}
		
//		System.out.println(menuNumber[0] + ". " + allItems[0].getTitle());
//		System.out.println(menuNumber[1] + ". " + allItems[1].getTitle());
		
		System.out.print("\nVälj ett alternativ 0-"+(allItems.length-1)+": ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.print("\n\n");
		
		
		
	}

}
