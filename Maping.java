import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Maping
  {
     public static void main(String args[])
       {
           /*if i used arraylist in map 
           ArrayList al=new ArrayList();
 	   al.add(101);
           al.add(102);
	   al.add(103);
           System.out.println(al);*/
	
       Map map=new HashMap();
       map.put(101,"Ram");
       map.put(102,"Lokesh");
       map.put(103,"Shalu");
       //map.put(null,null);
       map.put(null,"aaa");
        map.put(104,"Ram");
       map.put(105,"Lokesh");

       //map.clear();
      // System.out.println(map.containsKey(101));//  o/p True
      // System.out.println(map.containsKey(105));// o/p False

      // System.out.println(map.containsValue("Ram"));
       System.out.println(map);

      }
  }
