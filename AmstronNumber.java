package week1.day1;

public class AmstronNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int sum=0;
		int org=num;
		
		while(num>0) {
			
		int rem = num % 10; //3
		sum= sum + (rem*rem*rem);
		num = num/10;//15
					
		}
		if(org==num) {
			System.out.println("amstrong"+sum);	
		}
		else {
			System.out.println("not amstrong"+sum);
		}
		

	}

}
