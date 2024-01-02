package MultipleMethods;

public class MultipleMethodsInOneClassApp {

	public static void main(String[] args) 
	{
		int num1=0,num2=0;
		MultipleMethodsInOneClass res=new MultipleMethodsInOneClass();
		res.divisibleTwo(num1);
		res.divisibleThree(num1);
		res.divisibleFive(num1);
		res.divisibleTwoFive(num1);
		res.divisibleThreeInFiveTable(num1,num2);
		res.evendivisibleThree(num1);
		res.odddivisibleFive(num1);

	}

}
