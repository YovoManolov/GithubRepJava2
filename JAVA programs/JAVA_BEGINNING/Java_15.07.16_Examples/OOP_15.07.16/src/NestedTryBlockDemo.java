
public class NestedTryBlockDemo {

	public static void main(String[] args) {
		try
		{
			try{
				int a[] = new int [5];
			
				int b = 30 ;
				b =	b*3 / 0 ;
				
				a[15] = 4;
			}catch (ArithmeticException arithmeticException)
				{
				    System.out.println("Arithmetic Exception ");
 					arithmeticException.printStackTrace();
				}
		}catch (ArrayIndexOutOfBoundsException exception)
		     {
			 System.out.println("Out of Bounds Exception ");
			 exception.getStackTrace();
		     }
		finally{
			System.out.println("I get executed every time irrespective of the situation ! ");
		}
		System.out.println("normal flow..");
	}

}