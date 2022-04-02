package demo1;

public class Calculator {
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.addNumbers(20,20);
		basicCal.subNumbers(50,30);
		basicCal.multiNumbers(10,10);
		basicCal.divNumbers(250, 10);
		
	}
	
	public void addNumbers(int num1,int num2) {
	int sum = num1 + num2;
	System.out.println(sum);
	}
	
	public void subNumbers(int num1, int num2) {
	int diff = num1 - num2;
	System.out.println(diff);
	}
	
	public void multiNumbers(int num1, int num2) {
		int multi = num1 * num2;
		System.out.println(multi);
	}
	
	public void divNumbers(int num1, int num2) {
		int div = num1/num2;
		System.out.println(div);
	}
}
