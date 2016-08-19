package assingment.assingment;

import junit.framework.TestCase;

public class StringTest extends TestCase 
{
	protected String value1, value2;
	protected EvaluateString es;
	
	protected void SetUp()
	{
		value1 = "HelloWorld";
		value2 = "8BitPlatoon";
	}
	
	public void testReverseString() 
	{
		es = new EvaluateString();
		value1 = "HelloWorld";
		value2 = "8BitPlatoon";
		
		assertEquals("dlroWolleH", es.ReverseString(value1));
		assertEquals("nootalPtiB8", es.ReverseString(value2));
	}

}
