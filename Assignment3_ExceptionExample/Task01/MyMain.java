public class MyMain
{
  public static void main(String[] args)
  {
    	// create a new company
	Company c = new Company();
    
      	// intentionally throw our custom exception by
      	// calling getTotal with a string
	c.getTotal("Asdf");
  }
}
