package lab4;

public class Main {

	public static void main(String[] args) {
		ArithmeticTable table1 = new MultiplicationTable(10, 10);
		ArithmeticTable table2 = new DivisionTable(10, 10);
		ArithmeticTable table3 = new SubtractionTable(10, 10);
		ArithmeticTable table4 = new AdditionTable(10, 10);
		
		table1.firstLine();
		table1.print();
		System.out.println();
		
		table2.firstLine();
		table2.print();
		System.out.println();
		
		table3.firstLine();
		table3.print();
		System.out.println();
		
		table4.firstLine();
		table4.print();
		
	}

}
