class Abc
{
	public static void main (String[] args) 
	{
		int[] arr = new int[4];
		
		try
		{
			int i = arr[3];
				
			// this statement will never execute
			// as exception is raised by above statement
			System.out.println("Inside try block");
		}
		
		// not a appropriate handler
		catch(NullPointerException ex)
		{
			System.out.println("Exception has been caught");
		}
		
		finally
		{
			System.out.println("finally block executed");
		}
		
		// rest program will not execute
		System.out.println("Outside try-catch-finally clause");
	}
}
