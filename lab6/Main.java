package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Menu huvudmeny = new Menu("HUVUDMENY");
		Menu varulista = new Menu("VARULISTA");
		Menu läggTill = new Menu("LÄGG TILL NY VARA");
		Menu läggTillBok = new Menu("LÄGG TILL BOK");
		Menu läggTillKläder = new Menu("LÄGG TILL KLÄDER");
		Menu läggTillMat = new Menu("LÄGG TILL MAT");
		Menu läggTillFilm = new Menu("LÄGG TILL FILM");
		ArrayList<String> varor = new ArrayList<String>();
		
		
		huvudmeny.add(new AbstractMenuItem("Avsluta") { //anonym klass
			public void execute() { // Gör ingenting.
//				System.exit(0);
			}
		});
		
		huvudmeny.add(new AbstractMenuItem("Varulista") { //anonym klass
			public void execute() {
					varulista.printHeadLine();
					if(!varulista.exists("Tillbaka")) {
						varulista.add(new AbstractMenuItem("Tillbaka"){
							public void execute() {
								huvudmeny.printHeadLine();
								huvudmeny.execute();
							}
						});
					}
					
					for(String vara : varor) {
						if(vara.startsWith("B"))
							System.out.println(vara);
					}
					for(String vara : varor) {
						if(vara.startsWith("K"))
							System.out.println(vara);
					}
					for(String vara : varor) {
						if(vara.startsWith("F"))
							System.out.println(vara);
					}
					for(String vara : varor) {
						if(vara.startsWith("M"))
							System.out.println(vara);
					}
					
					System.out.println();
					
					varulista.execute();
			}
		});
		huvudmeny.add(new AbstractMenuItem("Lägg till ny vara") { //anonym klass
			public void execute() {
					läggTill.add(new AbstractMenuItem("Tillbaka"){
						public void execute() {
							huvudmeny.printHeadLine();
							huvudmeny.execute();
						}
					});
					läggTill.add(new AbstractMenuItem("Bok"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandeBok = "BOK. \t";
							läggTillBok.printHeadLine();
							läggTillBok.execute();
							System.out.print("Varunummer: ");
							nuvarandeBok += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Titel: ");
							nuvarandeBok += "Titel: " + scan.nextLine() + " ";
							System.out.print("Författare: ");
							nuvarandeBok += "Författare: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandeBok += "Pris: "+scan.nextLine() + " ";
							System.out.print("Miljömärkt: ");
							nuvarandeBok += "Miljömärkt: "+scan.nextLine() + " ";
							
							varor.add(nuvarandeBok);
							
							System.out.println();
							läggTill.printHeadLine();
							läggTill.execute();
						}
					});
					läggTill.add(new AbstractMenuItem("Film"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandeFilm = "FILM. \t";
							läggTillFilm.printHeadLine();
							läggTillFilm.execute();
							System.out.print("Varunummer: ");
							nuvarandeFilm += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Genre: ");
							nuvarandeFilm += "Genre: " + scan.nextLine() + " ";
							System.out.print("Titel: ");
							nuvarandeFilm += "Titel: "+scan.nextLine() + " ";
							System.out.print("Årtal: ");
							nuvarandeFilm += "Årtal: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandeFilm += "Pris: "+scan.nextLine() + " ";
							
							varor.add(nuvarandeFilm);
							
							System.out.println();
							läggTill.printHeadLine();
							läggTill.execute();
						}
					});
					läggTill.add(new AbstractMenuItem("Kläder"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandePlagg = "KLÄDESPLAGG. \t";
							läggTillKläder.printHeadLine();
							läggTillKläder.execute();
							System.out.print("Varunummer: ");
							nuvarandePlagg += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Typ: ");
							nuvarandePlagg += "Typ: " + scan.nextLine() + " ";
							System.out.print("Färg: ");
							nuvarandePlagg += "Färg: "+scan.nextLine() + " ";
							System.out.print("Märke: ");
							nuvarandePlagg += "Märke: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandePlagg += "Pris: "+scan.nextLine() + " ";
							System.out.print("Miljömärkt: ");
							nuvarandePlagg += "Miljömärkt: "+scan.nextLine() + " ";
							
							varor.add(nuvarandePlagg);
							
							System.out.println();
							läggTill.printHeadLine();
							läggTill.execute();
						}
					});
					läggTill.add(new AbstractMenuItem("Mat"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandeMat = "MAT. \t";
							läggTillMat.printHeadLine();
							läggTillMat.execute();
							System.out.print("Varunummer: ");
							nuvarandeMat += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Varutyp: ");
							nuvarandeMat += "Varutyp: " + scan.nextLine() + " ";
							System.out.print("Vara: ");
							nuvarandeMat += "Vara: "+scan.nextLine() + " ";
							System.out.print("Märke: ");
							nuvarandeMat += "Märke: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandeMat += "Pris: "+scan.nextLine() + " ";
							System.out.print("Miljömärkt: ");
							nuvarandeMat += "Miljömärkt: "+scan.nextLine() + " ";
							
							varor.add(nuvarandeMat);
							
							System.out.println();
							läggTill.printHeadLine();
							läggTill.execute();
						}
					});
				läggTill.printHeadLine();
				läggTill.execute();
			}
		});
		huvudmeny.printHeadLine();
		huvudmeny.execute();
		
	}

}
