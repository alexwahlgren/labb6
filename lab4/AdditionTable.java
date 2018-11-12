package lab4;

public class AdditionTable extends ArithmeticTable {

	public AdditionTable(int rows, int columns) {
		super.rows = rows;
		super.columns = columns;
	}
	
	@Override
	public double evaluate(int a, int b) {
		return a + b;
	}

	@Override
	public void firstLine() {
		System.out.print("  + |   ");
	}
	
}
