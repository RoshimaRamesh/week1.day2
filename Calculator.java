package week1.day2;

public class Calculator {

	
	public int add(int num1, int num2, int num3) {
		
		int sum= num1+num2+num3;
		
		return sum;
	}
	
	public int sub(int num1, int num2) {
		
		int sub = num1 - num2;
		
		return sub;
		
	}
	
	public int mul(int num1, int num2) {
		
		int mul = num1  * num2;
		
		return mul;
		
	}
	
	public int div(int num1, int num2) {
		
		int div = num1  / num2;
		
		return div;
		
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10, 20, 30));
		System.out.println(cal.sub(50, 20));
		System.out.println(cal.mul(3, 6));
		System.out.println(cal.div(40, 20));
		
	}

}
