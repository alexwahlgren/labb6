package lab5;

public class Word {
	
	private String text;

	public Word(String text) {
		this.text = text;
	}
	
	public boolean equals(Object obj) {
		if (this == obj && this.toString() == obj.toString()) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	public String toString() {
		return text;
	}
}
