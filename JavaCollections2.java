import java.util.LinkedList;
  class JavaCollections2
    {
      public static void main(String args[])
       {
         LinkedList<String> Name=new LinkedList<String>();
         Name.add("Bharti");
         Name.add("Aarohi");
         Name.add("Jyoti");

        
         //using for each loop 
	 for(String str:Name)
             { 
               System.out.println(Name);
             }  



      
         System.out.println(Name);// print the element then syntax[Bharti,Aarohi,Jyoti]
         /*Name.add(1,"RaKhi");
         System.out.println(Name);// Add the element then syntax[Bharti,Rakhi,Aarohi,Jyoti]
         

        //Remove the element then syntax
        Name.remove(2);
        System.out.println(Name);//[Bharti,Rakhi,Jyoti]
        
	//Replace the element then [Ram,Rakhi,Jyoti]
        Name.set(0,"Ram");
        System.out.println(Name);

       //if we want to any one element then [Ram,Rakhi,Jyoti]
       
       System.out.println(Name.get(1));//Output is Rakhi


       //if we want to all  element Delete then []
 	Name.clear();
        System.out.println(Name);*/
       
    }
  }