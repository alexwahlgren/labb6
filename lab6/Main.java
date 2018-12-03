package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Menu huvudmeny = new Menu("HUVUDMENY");
		Menu varulista = new Menu("VARULISTA");
		Menu l�ggTill = new Menu("L�GG TILL NY VARA");
		Menu l�ggTillBok = new Menu("L�GG TILL BOK");
		Menu l�ggTillKl�der = new Menu("L�GG TILL KL�DER");
		Menu l�ggTillMat = new Menu("L�GG TILL MAT");
		Menu l�ggTillFilm = new Menu("L�GG TILL FILM");
		ArrayList<String> varor = new ArrayList<String>();
		
		
		huvudmeny.add(new AbstractMenuItem("Avsluta") { //anonym klass
			public void execute() { // G�r ingenting.
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
		huvudmeny.add(new AbstractMenuItem("L�gg till ny vara") { //anonym klass
			public void execute() {
					l�ggTill.add(new AbstractMenuItem("Tillbaka"){
						public void execute() {
							huvudmeny.printHeadLine();
							huvudmeny.execute();
						}
					});
					l�ggTill.add(new AbstractMenuItem("Bok"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandeBok = "BOK. \t";
							l�ggTillBok.printHeadLine();
							l�ggTillBok.execute();
							System.out.print("Varunummer: ");
							nuvarandeBok += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Titel: ");
							nuvarandeBok += "Titel: " + scan.nextLine() + " ";
							System.out.print("F�rfattare: ");
							nuvarandeBok += "F�rfattare: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandeBok += "Pris: "+scan.nextLine() + " ";
							System.out.print("Milj�m�rkt: ");
							nuvarandeBok += "Milj�m�rkt: "+scan.nextLine() + " ";
							
							varor.add(nuvarandeBok);
							
							System.out.println();
							l�ggTill.printHeadLine();
							l�ggTill.execute();
						}
					});
					l�ggTill.add(new AbstractMenuItem("Film"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandeFilm = "FILM. \t";
							l�ggTillFilm.printHeadLine();
							l�ggTillFilm.execute();
							System.out.print("Varunummer: ");
							nuvarandeFilm += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Genre: ");
							nuvarandeFilm += "Genre: " + scan.nextLine() + " ";
							System.out.print("Titel: ");
							nuvarandeFilm += "Titel: "+scan.nextLine() + " ";
							System.out.print("�rtal: ");
							nuvarandeFilm += "�rtal: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandeFilm += "Pris: "+scan.nextLine() + " ";
							
							varor.add(nuvarandeFilm);
							
							System.out.println();
							l�ggTill.printHeadLine();
							l�ggTill.execute();
						}
					});
					l�ggTill.add(new AbstractMenuItem("Kl�der"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandePlagg = "KL�DESPLAGG. \t";
							l�ggTillKl�der.printHeadLine();
							l�ggTillKl�der.execute();
							System.out.print("Varunummer: ");
							nuvarandePlagg += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Typ: ");
							nuvarandePlagg += "Typ: " + scan.nextLine() + " ";
							System.out.print("F�rg: ");
							nuvarandePlagg += "F�rg: "+scan.nextLine() + " ";
							System.out.print("M�rke: ");
							nuvarandePlagg += "M�rke: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandePlagg += "Pris: "+scan.nextLine() + " ";
							System.out.print("Milj�m�rkt: ");
							nuvarandePlagg += "Milj�m�rkt: "+scan.nextLine() + " ";
							
							varor.add(nuvarandePlagg);
							
							System.out.println();
							l�ggTill.printHeadLine();
							l�ggTill.execute();
						}
					});
					l�ggTill.add(new AbstractMenuItem("Mat"){
						public void execute() {
							Scanner scan = new Scanner(System.in);
							String nuvarandeMat = "MAT. \t";
							l�ggTillMat.printHeadLine();
							l�ggTillMat.execute();
							System.out.print("Varunummer: ");
							nuvarandeMat += "Varunummer: " + scan.nextLine() + " ";
							System.out.print("Varutyp: ");
							nuvarandeMat += "Varutyp: " + scan.nextLine() + " ";
							System.out.print("Vara: ");
							nuvarandeMat += "Vara: "+scan.nextLine() + " ";
							System.out.print("M�rke: ");
							nuvarandeMat += "M�rke: "+scan.nextLine() + " ";
							System.out.print("Pris: ");
							nuvarandeMat += "Pris: "+scan.nextLine() + " ";
							System.out.print("Milj�m�rkt: ");
							nuvarandeMat += "Milj�m�rkt: "+scan.nextLine() + " ";
							
							varor.add(nuvarandeMat);
							
							System.out.println();
							l�ggTill.printHeadLine();
							l�ggTill.execute();
						}
					});
				l�ggTill.printHeadLine();
				l�ggTill.execute();
			}
		});
		huvudmeny.printHeadLine();
		huvudmeny.execute();
		
	}

}
