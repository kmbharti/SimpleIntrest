class Az
{
	public static void main(String ags[]) throws AgeNegativeException, UserIsMinorException
	{

		validateAge(10); 

	}

	public static void validateAge(int age) throws AgeNegativeException, UserIsMinorException {
		if(age<0){
			throw new AgeNegativeException();
		}
		if(age<18){
			UserIsMinorException ex = new UserIsMinorException();
			throw ex;
		}
	
	}
}

class UserIsMinorException extends Exception {

}

class AgeNegativeException extends Exception {

}