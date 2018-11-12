package lab4;

public class DivisionTable extends ArithmeticTable{
	
	public DivisionTable(int rows, int columns) {
		super.rows = rows;
		super.columns = columns;
	}

	@Override
	public double evaluate(int a, int b) {
		if (b!=0)
			return (double) a/ (double) b;
		else
			return 0;
	}

	@Override
	public void firstLine() {
		System.out.print("  / |   ");
	}

}
