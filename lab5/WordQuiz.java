package lab5;

import java.util.Iterator;
import java.util.Scanner;

public class WordQuiz {

	private Scanner input = new Scanner(System.in);
	
	private Dictionary dictionary;
	private int missadeOrd = 0;
	private int tries = 0;
	
	public WordQuiz(Dictionary dictionary) {
		this.dictionary = dictionary;
	 }
	
	public void runQuiz() {
		tries++;
		Dictionary missed = new Dictionary();
		for (Word key : dictionary.ordlista.keySet()) {
			System.out.print(key + " = ");
			Word answer = new Word(input.nextLine());
			if(!(dictionary.lookup(key).contains(answer))){
				for (Word value : dictionary.ordlista.get(key)) {
					missed.add(key, value);
				}
				System.out.println("Fel!");
				//l�gg till antal f�rs�k gjorda
				missadeOrd++;
			}
		}
		if (missadeOrd != 0) {
			System.out.println("Du missade "+missadeOrd+" ord! Jag f�rh�r dig p� dessa igen.");
			this.dictionary = missed;
			missadeOrd = 0;
			runQuiz();
		}else { System.out.println("Du klarade testet p� "+tries+" f�rs�k !!");}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Dictionary sweng = new Dictionary();
		
		System.out.print("V�lj ett alternativ 0-2:\n\n0. Spela spelet\n1. L�gg till ord till spelet\n\n:");
		String alternative = scan.nextLine();
		if(alternative.equals("0")) {
			System.out.print("\n\nSpelet k�rs...\n");
			sweng.load();
			//Om du vill invertera spelet l�gg till ".inverse()" efter "sweng" p� raden nedan.
			WordQuiz wq = new WordQuiz(sweng);
			wq.runQuiz();
		}
		else if (alternative.equals("1")){
			System.out.print("Skriv in �vers�ttning du vill l�gga till p� f�ljande form, \"ord p� svenska;�vers�ttning\".\nOm du vill skriva fler �n en �vers�ttning s� st�ng ned programmet och k�r det igen.\n\n:");
			String translation = scan.nextLine();
			sweng.save(translation);
		}
	}
	
}
