import java.util.Arrays;
import java.util.Collections;
class Sorting
{
 public static void main(String args[])
  {
   //int []arr ={10,30,4,34,44,50};
   
   Integer[] arr={10,30,4,34,44,50};


   System.out.println("befor sorting" + Arrays.toString(arr));//1
  // Arrays.sort(arr);//2
  

    Arrays.sort(arr, Collections.reverseOrder());

   System.out.println("After sorting" + Arrays.toString(arr));//3
   System.out.println(arr);
 }  
}   