package controlconstructs;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scan.nextInt();
		
		if(a>0)
		{
			System.out.println("positive number");
		}
		else if(a<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Number is Zero");
		}
	}

}
