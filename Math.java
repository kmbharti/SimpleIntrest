abstract class Welcome
{
 abstract void printInfo();
}
class Test extends Welcome
{
void printInfo()
{
String name="abcd";
int age=18;
float salary=555.5f;
System.out.println(name);
System.out.println(age);
System.out.println(salary);
}
}
class Math
{
public static void main(String args[])
{
Welcome w=new Test();
w.printInfo();
}
}