class Bharti{
int age;
String name;
Bharti(int age, String name)
{
this.age=age;
this.name=name;
}
void display(){
System.out.println(age+ "" +name);
}
public static void main(String args[])
{
Bharti ab=new Bharti(20, "ACDEFGHI");//its difine self constructor
ab.display();
}
}
