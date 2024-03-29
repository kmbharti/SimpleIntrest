class A
{
	A()
	{
	System.out.println("A");
	}
	A(String s)
	{ 
	this();
	System.out.println("A String");
	
	}
}
class B extends A 
{
	B(String s)
	{
	
	System.out.println(s);
	System.out.println("B string");
	}
}
class Mint
{
	public static void main(String args[])
	{
 	 A a=new B ("Bharti");
	 
        }
}
