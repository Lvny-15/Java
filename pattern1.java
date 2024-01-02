package starpatterns;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the n value:");
		int n=scan.nextInt();
		System.out.print("enter the character:");
		char ch=scan.next().charAt(0);
		
		//using for loop
		for(int i=1;i<=n;i++)
		{
		
			
				System.out.println(""+ch);
			
					}
		
		//using while loop
		/*int i=1;
		while(i<=n)
		{
			System.out.println(""+ch);
			i++;
		}*/
		
		//using dowhile
		/*int i=1;
		do
		{
			System.out.println(""+ch);
			i++;
		}
		while(i<=n);*/

	} 

}
