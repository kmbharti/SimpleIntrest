class ConstExam
{
int id;
String name;
public ConstExam(int id,String name)
{
 this.id=id;
 this.name=name;
}
public ConstExam(String name)
{
 this.name=name;
}
public ConstExam()
{
 System.out.println("The is default constructore");
}
}
public class Abcdef{
public static void main(String args[])
{
  ConstExam ec=new ConstExam("bharti",01);
  ec.ConstExam();
}
}