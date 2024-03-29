// Java program that demonstrates the use of throw
class ThrowExcep {
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside fun().");
			System.out.println(e);
			throw e; // rethrowing the exception
		}
	}

	public static void main(String args[])
	{
		try {
			fun();
		}
		catch (NullPointerException e) {
			System.out.println("Caught in main.");
		}
	}
}
