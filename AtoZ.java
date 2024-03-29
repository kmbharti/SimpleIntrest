interface I1
{
public void run();
}
class AtoZ implements I1
{
public void run()
{
System.out.println("a");
}
public static void main(String args[])
{
AtoZ ab =new AtoZ();
ab.run();
System.out.println("The interface in java by using run method");
}
}


