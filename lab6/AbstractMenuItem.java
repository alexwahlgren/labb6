package lab6;

public abstract class AbstractMenuItem implements MenuItem {
	
	private String title;
	public AbstractMenuItem(String Title) {
		this.title = Title; 
	}
	
	public abstract void execute();
	
	public String getTitle() {
		return title;	
	}
}
