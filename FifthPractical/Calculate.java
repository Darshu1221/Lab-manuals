package FifthPractical;

	//importing Scanner
import java.util.Scanner;

class Calculate {
	 
	//making method
		void all_calci()
		{
			//making object of Scanner
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter First number: ");
			//taking variable for user input
			int a = sc.nextInt();
			
			System.out.print("Enter Second number: ");
			//taking variable for user input
			int b = sc.nextInt();
			
			System.out.print("Enter 1 for addition: \n" + "Enter 2 for substraction: \n" + "Enter 3 for multiplication: \n" + "Enter 4 for division: \n");
			//taking variable for user input
			int c = sc.nextInt();
			sc.close();
			
			//assigning operators
			int a1 = a+b;
			int b1 = a-b;
			int c1 = a*b;
			int d1 = a/b;
			
			//making loop if-else
			if(c == 1)
			{
				System.out.println("Addition of two number is: " + a + " + " + b + " = " + a1);
			}
			
			else if(c == 2)
			{
				System.out.println("Subtraction of two number is: " + a + " - " + b + " = " + b1);
			}
			
			else if(c == 3)
			{
				System.out.println("Multiplication of two number is: " + a + " X " + b + " = " + c1);
			}
			
			else if(c == 4)
			{
				System.out.println("Division of two number is: " + a + " / " + b + " = " + d1);
			}
			
		}
	}


