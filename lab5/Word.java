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
	* Jämför detta ord med det specificerade objektet. Resultatet är
	* true om och endast om obj också är ett ord (Word) och har
	* samma text.
	*/
	public boolean equals(Object obj) {
		if(obj instanceof Word) {
//			System.out.println("ja");
			Word objS = (Word) obj;
			if (this.hashCode() == objS.hashCode()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	* Returnerar hashkoden för detta ord beräknat på ordets text.
	*/
	public int hashCode() {
		return this.toString().toLowerCase().hashCode();
	}
	
	/**
	* Returnerar texten för detta ord.
	*/
	public String toString() {
		return this.text;
	}
}
