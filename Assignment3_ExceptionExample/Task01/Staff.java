class Staff
{
	public String getName(String n)
  	{	
	// create a new Manager
  		Manager m= new Manager();
  		try
  		{
  			m.getCount("ddd");
  			//ValidNumber
  			int x = Integer.parseInt(n);
		}
		catch (NumberFormatException e)
		{
			// throw custom exception
			throw new MyException("No of staff members are not found ...", e);
		}
		
		return n;
	}
}
