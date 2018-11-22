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
				//lägg till antal försök gjorda
				missadeOrd++;
			}
		}
		if (missadeOrd != 0) {
			System.out.println("Du missade "+missadeOrd+" ord! Jag förhör dig på dessa igen.");
			this.dictionary = missed;
			missadeOrd = 0;
			runQuiz();
		}else { System.out.println("Du klarade testet på "+tries+" försök !!");}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Dictionary sweng = new Dictionary();
		
		System.out.print("Välj ett alternativ 0-2:\n\n0. Spela spelet\n1. Lägg till ord till spelet\n\n:");
		String alternative = scan.nextLine();
		if(alternative.equals("0")) {
			System.out.print("\n\nSpelet körs...\n");
			sweng.load();
			//Om du vill invertera spelet lägg till ".inverse()" efter "sweng" på raden nedan.
			WordQuiz wq = new WordQuiz(sweng);
			wq.runQuiz();
		}
		else if (alternative.equals("1")){
			System.out.print("Skriv in översättning du vill lägga till på följande form, \"ord på svenska;översättning\".\nOm du vill skriva fler än en översättning så stäng ned programmet och kör det igen.\n\n:");
			String translation = scan.nextLine();
			sweng.save(translation);
		}
	}
	
}
