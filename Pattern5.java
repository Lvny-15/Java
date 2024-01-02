package starpatterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.print("enter the n value:");
	  int n=scan.nextInt();
	  
	  for(int i=0;i<=n;i++)
	  {
		  for(int j=0;j<=i;j++)
		  {
			System.out.print(" ");
		  }
		  for(int j=0;j<=11-2*i;j++)
		  {
			  System.out.print("#");
		  }
		  System.out.println();
	  }

	}

}
