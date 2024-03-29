import java.util.Stack;
class JavaCollection3
 {
   public static void main(String args[])
    {
      Stack<String> Name= new Stack<>();//LIFO
      Name.push("Ankit");
      Name.push("Ankush");
      Name.push("Altaf");

     System.out.println(Name);//[Ankit,Ankush,Altaf]
     Name.pop();
     System.out.println(Name);//[Ankit,Ankush] its perform LIFO operation
    }
 }