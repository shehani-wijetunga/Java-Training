import java.util.*;
public class Wrapper
{
	public static void main(String args[]) throws MyCheckException
	{
		int a,b,answer;
		try 
		{
			a=10;
			b=0;
			
			answer=a/b;
 			
		} catch (MyUncheckException e) 
		{
			throw new MyCheckException("File not Found");
		}
		System.out.println(answer);
	}	
}
