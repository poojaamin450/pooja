import java.util.Scanner;
public class ArithmaticCalculator {
	public static void main(String[] args) {
		double num1, num2;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		num1 = sc.nextDouble();
		System.out.print("Enter Second number:");
		num2 = sc.nextDouble();
		sc.close();
		double output;
		switch (op)
		{
			case '+':
				output = num1+num2;
			case '-':
				output = num1-num2;
			case '*':
				output = num1*num2;
			case '/':
				output = num1/num2;
				break;
			default: 
				System.out.printf("You have entered wrong operator");
				return;
				
		}
		System.out.println(num1+" "+ op +" "+num2+": "+output);
	}

}
