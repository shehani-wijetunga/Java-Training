public class MyUncheckException extends RuntimeException
{	
	public MyUncheckException(String m)
  	{
    		super(m);
  	}  	

	public MyUncheckException(String m, Throwable cause) {
		super(m, cause);
	}
}
