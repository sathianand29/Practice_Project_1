import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		
		int num1, num2, op;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter 1st number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		num2 = sc. nextInt();
		
		 
		System.out.println("Choose an operator: +,-,*,/,%");
		op = sc.next().charAt(0);
			
		switch(op) {
		
		case '+':
			System.out.println("Addition of 2 numbers is: "+ (num1 + num2));
			break;
			
		case '-':
			System.out.println("Subtraction of 2 numbers is: "+ (num1 - num2));
			break;
			
		case '*':
			System.out.println("Multiplication of 2 numbers is: "+ (num1 * num2));
			break;
			
		case '/':
			System.out.println("Division of 2 numbers is: "+ (num1 / num2));
			break;
			
		case '%':
			System.out.println("Remainder of 2 numbers is: "+ (num1 % num2));
			break;
			
		 default:
			System.out.println("Invalid option");
			break;
		
		}
			
	}
		
	
}
