import java.util.ArrayList;
import java.util.Collections;
class CollectionArrayListInt
{
public static void main(String args[])
{
ArrayList<Integer> Mynum=new ArrayList<>();
Mynum.add(100);
Mynum.add(20);
Mynum.add(300);
Mynum.add(40);
Collections.sort(Mynum);

for(int i:Mynum)
{
System.out.println(i);
}

}
}

    