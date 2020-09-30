package ar.com.educacionit.domain.clase5.exceptions;

public class miFirstExpceitonMain {
	public static void main(String[]args){
		
		boolean generarException = true;
		
		try {
			if(generarException) {
				throw new MiFirtsException("mi Primera exception",null);
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
