class Employee
{
public String getTotalCount(String n)
  	{	
  		try
  		{
  			
  			int x = Integer.parseInt(n);
		}
		catch (NumberFormatException e)
		{
			// throw custom exception
			throw new MyException("No of employees are not found ...", e);
		}
		
		return n;
	}
}
