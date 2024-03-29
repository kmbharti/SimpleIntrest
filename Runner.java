public class Runner {
	public static void main(String[] args) throws PetrolPumpClosedException{
		PetrolFiller petrolFiller = new PetrolFiller();
		petrolFiller.fillPetrol();

		System.out.println("Progrm  termintaed successfully");
	}
}

class PetrolFiller {

	public void fillPetrol() throws PetrolPumpClosedException {
		throw new PetrolPumpClosedException();
	}
}