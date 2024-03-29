import java.util.HashMap;
import java.util.Map;
class HashMapExmple
{
 	public static void main(String rg[])
 	 {
	  HashMap<String,Integer> values=new HashMap<>();
		values.put("A",01);
		values.put("A",05);
		values.put("C",01);
		values.put("D",01);
		System.out.println(values);
		System.out.println(values.containsValue(05));
	       System.out.println(values.containsKey(05));
               System.out.println(values.size());
  // Iterating over HashMap
        for (Map.Entry<String,Integer> entry : values.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

		
