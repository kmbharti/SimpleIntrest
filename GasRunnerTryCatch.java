 import java.io.*;

public class GasRunnerTryCatch{
	public static void main(String rgs[]){
       Gass gs=new Gass();
       gs.fillGas();
       System.out.println("The progrm terminate successfully");
	}
}
class Gass{
	public void fillGas() {
		File file = new File("D:/learning/Exception/abcd.txt");
		try {
			FileReader reader = new FileReader(file);
			System.out.println("inside try block");
		} catch(FileNotFoundException e){
			System.out.println("I caought the exception");
			

		}
 }
}