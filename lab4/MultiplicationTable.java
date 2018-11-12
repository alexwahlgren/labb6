package lab4;

public class MultiplicationTable extends ArithmeticTable {

	public MultiplicationTable(int rows, int columns) {
		super.rows = rows;
		super.columns = columns;
	}

	@Override
	public void firstLine() {
		System.out.print("  * |   ");
	}
	

	@Override
	public double evaluate(int a, int b) {
		return a * b;
	}
}
