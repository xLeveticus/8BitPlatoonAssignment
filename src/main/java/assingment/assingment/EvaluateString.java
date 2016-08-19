package assingment.assingment;

public class EvaluateString 
{
	private String inputString;
	
	public EvaluateString()
	{
		
	}
	
	public String ReverseString(String inputString)
	{
		String outputString = "";
		for (int i = inputString.length() - 1; i >= 0; i--)
		{
			outputString = outputString + inputString.charAt(i);
		}
		return outputString;
	}
	
	public static void main(String[]args)
	{
		EvaluateString es = new EvaluateString();
		
		System.out.println(es.ReverseString("HelloWorld"));
		System.out.println(es.ReverseString("8BitPlatoon"));
	}
}