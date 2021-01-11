class Company
{
	public String getTotal(String n)
  	{	
  		// create a new staff
  		Staff c = new Staff();
  		
  		try
  		{
  			c.getName(n);
  			//ValidNumber
  			int x = Integer.parseInt(n);
		}
		catch (NumberFormatException e)
		{
			// throw our custom exception
			throw new MyException("Company name not found ...", e);
		}
		
		return n;
	}
}
