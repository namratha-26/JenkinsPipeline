class Calculator {
	public int add(int a, int b)
	{
		return a+b;	
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}
public class CalculatorClass
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		System.out.println("Result of addition: "+c.add(20,10));
		System.out.println("Result of Subtraction: "+c.sub(20,10));
	}
}