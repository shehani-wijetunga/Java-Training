class Manager
{
public String getCount(String n)
  	{	
	 //reate a new Employee
  		Employee em= new Employee();
  		try
  		{
  			em.getTotalCount("ccc");
  			//ValidNumber
  			int x = Integer.parseInt(n);
		}
		catch (NumberFormatException e)
		{
			// throw custom exception
			throw new MyException("No of managers are not found ...", e);
		}
		
		return n;
	}
}
