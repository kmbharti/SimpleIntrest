//Runnable thread 
class Ice implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
     		{
                  System.out.println("The child thread");
        	}
	}
}
class Cream
{
	public static void main(String rgs[])
	{
        Ice ref=new Ice();
	Thread t=new Thread(ref);
        t.start();
	for(int i=1;i<=5;i++)
     		{
                  System.out.println("The Main thread");
        	}
	}
}
