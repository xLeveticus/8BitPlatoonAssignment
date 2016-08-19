package assingment.assingment;

public class EvaluateInt 
{
	private int inputInt;
	
	public EvaluateInt()
	{
		
	}
	
	public boolean IsEven(int inputInt)
	{
		if((inputInt % 2) == 0)
		{
		return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean IsPrime(int inputInt)
	{
		if(inputInt == 2)
		{
			return true;
		}
		if (inputInt % 2 == 0 || inputInt == 1)
		{
			return false;
		}
		for (int i = 3; i < inputInt; i++)
		{
			if (inputInt % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean IsPalindrome(int inputInt)
	{
		String palindromeCheck = Integer.toString(inputInt);
		String palindromeReverse = "";
		
		
		for (int i = palindromeCheck.length() - 1; i >= 0; i--)
		{
			palindromeReverse = palindromeReverse + palindromeCheck.charAt(i);

		}
		if (palindromeReverse.equals(palindromeCheck))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[]args)
	{
		EvaluateInt ei = new EvaluateInt();

		System.out.println(ei.IsEven(0));
		System.out.println(ei.IsEven(3));
		System.out.println(ei.IsEven(6));
		
		System.out.println(ei.IsPrime(1));
		System.out.println(ei.IsPrime(3));
		System.out.println(ei.IsPrime(110));
		System.out.println(ei.IsPrime(113));
		
		System.out.println(ei.IsPalindrome(10));
		System.out.println(ei.IsPalindrome(101));
		System.out.println(ei.IsPalindrome(123321));
	}
}