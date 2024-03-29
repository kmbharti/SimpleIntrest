import java.io.*;

public class GasRunner{
	public static void main(String rgs[]) throws FileNotFoundException{
       Gass gs=new Gass();
       gs.fillGas();
       System.out.println("The progrm terminate successfully");
	}
}
class Gass{
	public void fillGas() throws FileNotFoundException {
		File file = new File("abc.txt");
		FileReader reader = new FileReader(file);
 }
}