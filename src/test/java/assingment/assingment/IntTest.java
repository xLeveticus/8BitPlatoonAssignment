package assingment.assingment;

import junit.framework.TestCase;

public class IntTest extends TestCase 
{
	protected int value1, value2, value3, value4, value5, value6, value7, value8, value9, value10;
	protected EvaluateInt ei;
	
	protected void setUp()
	{
		value1 = 0;
		value2 = 3;
		value3 = 6;
		value4 = 1;
		value5 = 3;
		value6 = 110;
		value7 = 113;
		value8 = 10;
		value9 = 101;
		value10 = 123321;
	}
	public void testIsEven() 
	{
		ei = new EvaluateInt();
		assertTrue(ei.IsEven(value1));
		assertFalse(ei.IsEven(value2));
		assertTrue(ei.IsEven(value3));
	}

	public void testIsPrime() 
	{
		ei = new EvaluateInt();
		assertFalse(ei.IsPrime(value4));
		assertTrue(ei.IsPrime(value5));
		assertFalse(ei.IsPrime(value6));
		assertTrue(ei.IsPrime(value7));
	}

	public void testIsPalindrome() 
	{
		ei = new EvaluateInt();
		assertFalse(ei.IsPalindrome(value8));
		assertTrue(ei.IsPalindrome(value9));
		assertTrue(ei.IsPalindrome(value10));
	}
}
