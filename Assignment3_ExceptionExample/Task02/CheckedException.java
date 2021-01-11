import java.io.*;
class CheckedException {  
	public static void main(String args[]) throws IOException
	{
		File file = new File("/file.txt");
		FileReader fileReader = new FileReader(file);
		System.out.println("Successful");
	}
}	
	
