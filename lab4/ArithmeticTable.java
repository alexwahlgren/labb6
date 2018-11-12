package lab4;

public abstract class ArithmeticTable {

	public int rows;
	public int columns;
	private double result;
	
	public abstract double evaluate(int a, int b);
	
	public abstract void firstLine();
	
	public void print() {
		// Sparar x och y värdena i arrayer
		String[] columnArray = new String[columns];
		String[] rowArray = new String[rows];
		for (int i = 0; i < columns; i++) {
			columnArray[i] = String.valueOf(i);
			System.out.print(i + "   ");
		}
		System.out.println();
		System.out.print("----+---");
		for (int i = 0; i < columns; i++)
			System.out.print("----");
		System.out.println();
		for (int i = 0; i < rows; i++) {
			rowArray[i] = String.valueOf(i);
			System.out.print("  " + i + " |   ");
			for (int j = 0; j < columns; j++) {
				String blank;
				result = evaluate(Integer.parseInt(columnArray[j]), 
						Integer.parseInt(rowArray[i]));
				if (String.valueOf(Math.round(result)).length() == 2) {
					blank = "  ";
					System.out.printf("%.0f" + blank, result);
				} else {
					blank = " ";
					System.out.printf("%.1f" + blank, result);
				}
			}
			System.out.println();
		}
	}
	
	

}
