import java.util.LinkedList;
  class JavaCollectionsSheet
    {
      public static void main(String args[])
       {
         LinkedList<String> Name=new LinkedList<String>();
         Name.add("Bharti");
         Name.add("Aarohi");
         Name.add("Jyoti");
	 Name.removeLast();
	 Name.size();
          System.out.println(Name); 




         /*System.out.println(Name.get(0));
        
        
        for(int i=0;i<Name.size();i++)
		{
		System.out.println(Name.get(i));
		}*/


	for(String i:Name)
	{
	 System.out.println(i);
	}

    }
  }