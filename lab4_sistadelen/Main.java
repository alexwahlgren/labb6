package lab4_sistadelen;

public class Main {

	public static void main(String[] args) {
		Operation addition = new Operation() {

			@Override
			public char symbol() {
				return '+';
			}

			@Override
			public int width(int rows, int cols) {
				return 0;
			}

			@Override
			public double evaluate(int a, int b) {
				return a+b;
			}
		};
		
		Operation subtraction = new Operation() {

			@Override
			public char symbol() {
				return '-';
			}

			@Override
			public int width(int rows, int cols) {
				return 0;
			}

			@Override
			public double evaluate(int a, int b) {
				return a-b;
			}
		};
		
		Operation multiplication = new Operation() {

			@Override
			public char symbol() {
				return '*';
			}

			@Override
			public int width(int rows, int cols) {
				return 0;
			}

			@Override
			public double evaluate(int a, int b) {
				return a*b;
			}
		};
		
		Operation division = new Operation() {

			@Override
			public char symbol() {
				return '/';
			}

			@Override
			public int width(int rows, int cols) {
				return 0;
			}

			@Override
			public double evaluate(int a, int b) {
				if(b!=0)
					return (double) a / (double) b;
				else return 0;
			}
		};
		
		ArithmeticTable table1 = new ArithmeticTable(addition, 10, 10);
		table1.print();
		System.out.println();
		
		ArithmeticTable table2 = new ArithmeticTable(subtraction, 10, 10);
		table2.print();
		System.out.println();
		
		ArithmeticTable table3 = new ArithmeticTable(multiplication, 10, 10);
		table3.print();
		System.out.println();
		
		ArithmeticTable table4 = new ArithmeticTable(division, 10, 10);
		table4.print();
		System.out.println();
	}

}
