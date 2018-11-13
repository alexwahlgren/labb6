package lab4_sistadelen;

public class ArithmeticTable {

	public int rows;
	public int columns;
	private double result;
	private Operation op;
	
	public ArithmeticTable(Operation op, int rows, int columns) {
		this.op = op;
		this.rows = rows;
		this.columns = columns;
	}

	public void print() {
		System.out.print("  "+op.symbol()+" |   ");
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
				result = op.evaluate(Integer.parseInt(columnArray[j]), 
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

