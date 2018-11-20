package lab5;

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
		for (String key : dictionary.ordlista.keySet()) {
			System.out.print(key + " = ");
			String answer = input.nextLine();
			if(!(answer.equals(dictionary.ordlista.get(key)))){
				missed.add(key, dictionary.ordlista.get(key));
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
	
		Dictionary sweng = new Dictionary();	
		sweng.add("hej", "hello");
		sweng.add("hej", "hi");
		sweng.add("hej", "hey");
		sweng.add("godnatt", "good night");
		sweng.add("nattinatti", "good night");
		sweng.add("f�gel", "bird");
		sweng.add("hund", "dog");
		sweng.add("katt", "cat");
		WordQuiz wq = new WordQuiz(sweng);
		wq.runQuiz();

	
	}
	
}
