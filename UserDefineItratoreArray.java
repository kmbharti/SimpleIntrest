import java.util.ArrayList;
class User {
	int id,age;
	String name;
	String address;
	User(int id, String name, int age, String address)
	{ 
	this.id=id;
	this.name=name;
	this.age=age;
	this.address=address;
	
	}
} 
public class UserDefineItratoreArray{
  public static void main(String args[]){
	User u0=new User(10,"ABCD",23,"Kamla nagar Agra");
	User u1=new User(10,"ABCD",23,"AK nagar Agra");
	User u2=new User(10,"ABCD",23," Agra");
	User u3=new User(10,"ABCD",23,"Kelash nagar Agra");
   ArrayList<User> List=new<User> ArrayList<User>();
   List.add(u0);
   List.add(u1);
   List.add(u2);
   List.add(u3);
   Iterator its=new List.Iterator();
   While(itr.hasNext()){
   User u=(User)itr.Next();
        System.out.println(u.id+""+u.name""+u.age""+u.address);
       }
}
 }

 	
	
