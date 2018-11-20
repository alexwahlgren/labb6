package lab5;

import java.util.Scanner;

public class WordQuiz {

	private Scanner input = new Scanner(System.in);
	
	public WordQuiz(Dictionary dictionary) {
		int missadeOrd = 0;
		Dictionary missed = new Dictionary();
		for (String key : dictionary.ordlista.keySet()) {
			System.out.print(key + " = ");
			String answer = input.nextLine();
			if(!(answer.equals(dictionary.ordlista.get(key)))){
				missed.add(key, dictionary.ordlista.get(key));
				System.out.println("Fel!");
				//lägg till antal försök gjorda
				missadeOrd++;
			}
		}
		if (missadeOrd != 0) {
			System.out.println("Du missade "+missadeOrd+" ord! Jag förhör dig på dessa igen.");
			WordQuiz retry = new WordQuiz(missed);
			retry.runQuiz();
		}else { System.out.println("Du klarade testet !!");}
	 }
	
	public void runQuiz() {
		
	}
	
	public static void main(String[] args) {
	
		Dictionary sweng = new Dictionary();	
		sweng.add("hej", "hello");
		sweng.add("hej", "hi");
		sweng.add("hej", "hey");
		sweng.add("godnatt", "good night");
		sweng.add("nattinatti", "good night");
		sweng.add("fågel", "bird");
		sweng.add("hund", "dog");
		sweng.add("katt", "cat");
		WordQuiz wq = new WordQuiz(sweng);
		wq.runQuiz();

	
	}
	
}
