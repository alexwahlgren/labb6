package lab6;

public class Main {

	public static void main(String[] args) {

		Menu testMenu = new Menu("HUVUDMENY");
		testMenu.add(new AbstractMenuItem("Tillbaka") { //anonym klass
			public void execute() { // G�r ingenting.
				testMenu.execute();
			}
		});
		
		testMenu.execute();
		testMenu.add(new AbstractMenuItem("Varulista") { //anonym klass
			public void execute() {

			}
		});
		testMenu.execute();
		testMenu.add(new AbstractMenuItem("L�gg till ny vara") { //anonym klass
			public void execute() {

			}
		});
		
		testMenu.execute();
		
	}

}
