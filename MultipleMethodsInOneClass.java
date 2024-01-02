package MultipleMethods;

public class MultipleMethodsInOneClass 
{
   public int divisibleTwo(int i)
   {
	   for( i=1;i<=100;i++)
	   {
		   if(i%2==0)
		   {
			   System.out.print("divisible by 2:"+i);
		   }
	   }
	   return i;
   }
   public int divisibleThree(int i)
   {
	   for(i=1;i<=100;i++)
	   {
		   if(i%3==0)
		   {
			   System.out.print("divisible by 3:"+i);
		   }
	   }
	   return i;
   }
   public int divisibleFive(int i)
   {
	   for(i=1;i<=100;i++)
	   {
		   if(i%5==0)
		   {
			   System.out.print("divisible by 5:"+i);
		   }
	   }
	   return i;
   }
   public int divisibleTwoFive(int i)
   {
	   for(i=1;i<=100;i++)
	   {
		   if(i%2==0 && i%5==0)
		   {
			   System.out.print("divisible by 2 and 5:"+i);
		   }
	   }
	   return i;
   }
   public int divisibleThreeInFiveTable(int i,int n)
   {
	   for(i=1;i<=100;i++)
	   {
		   if(i%3==0 & i%5==0)
		   System.out.print(n+"*"+i+"=" +n*i);
	   }
	   return i;
   } 
   public int evendivisibleThree(int i)
   {
	   for(i=2;i<=100;i++)
	   {
		   if(i%2==0 & i%3==0)
		   {
			   System.out.print("even number divisible by 3:"+i);
		   }
	   }
	   return i;
   }
   public int odddivisibleFive(int i)
   {
	   for(i=1;i<=100;i++)
	   {
		   if(i%2!=0 & i%5==0)
		   {
			   System.out.print("odd numbers divisible by 5:"+i);
		   }
	   }
	   return i;
   }
		
   
}
