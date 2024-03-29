class A
{

    static int a=10;//static variable 
    int b=20;// non static variable 
	public static void main(String arg[])
	{
	A r=new A();
	A.show();//static method can be call without object but with class name can be called

	r.desp();//non static method call be call with object and withoud classname can be called.
	}
	 static void show()//static method 
	 {
	 System.out.println(a);//static methode cant be call non static variable.
	 }
     void desp()//non static method 
     {
     System.out.println(a+"  "+b);//non static methode can be access both static vriable or no static variable 
     }
}