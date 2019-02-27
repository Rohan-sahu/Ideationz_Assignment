import java.util.Scanner;
class Calculator
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Your First Number");
		float num1=scan.nextFloat();

		System.out.println("Select Your Process From +, -, *, /");
		String sym=scan.next();
		
		System.out.println("Enter Your Second Number");
		float num2=scan.nextFloat();

		float result;

		switch(sym)
		{
			case "+": result=num1 + num2;
					  System.out.println("Result is = "+result);
					  break;

			case "-": result=num1 - num2;
					  System.out.println("Result is = "+result);
					  break;

			case "*": result=num1 * num2;
					  System.out.println("Result is = "+result);
					  break;
					
			case "/": result=num1 / num2;
					  System.out.println("Result is = "+result);
					  break;

			default : System.out.println("Invalid Symbol. Please choose from +,-,*,/");
					  break;
		}




		}

}