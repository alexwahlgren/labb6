package lab5;

public class Word {
	
	private String text;

	/**
	* Skapar ett nytt ord med den givna texten.
	*/
	public Word(String text) {
		this.text = text;
	}
	
	/**
	* J�mf�r detta ord med det specificerade objektet. Resultatet �r
	* true om och endast om obj ocks� �r ett ord (Word) och har
	* samma text.
	*/
	public boolean equals(Object obj) {
		if (this == obj && this.toString() == obj.toString()) {
			return true;
		}
		return false;
	}
	
	/**
	* Returnerar hashkoden f�r detta ord ber�knat p� ordets text.
	*/
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	/**
	* Returnerar texten f�r detta ord.
	*/
	public String toString() {
		return this.text;
	}
}
