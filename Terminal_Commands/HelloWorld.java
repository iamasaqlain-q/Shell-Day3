public class HelloWorld
 {
	public static void main(String[] argv) 
	{
		while(true)
		{
			System.out.println("Hello World!!!");
			try {
				Thread.sleep(50000);
			} catch(Exception ex){}
		}
	}
}
