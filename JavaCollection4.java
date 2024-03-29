import java.util.ArrayDeque;
class JavaCollection4
 {
   public static void main(String args[])
    {
      ArrayDeque<String> Name= new ArrayDeque<>();//FIFO
      Name.push("Ankit");
      Name.push("Ankush");
      Name.push("Altaf");

     System.out.println(Name);//[Ankit,Ankush,Altaf]
     Name.pop();
     System.out.println(Name);//[Ankit,Ankush] its perform FIFO operation
    }
 }