package ar.com.educacionit.dao.exceptions;

public class DuplicatedException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public DuplicatedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	
	public DuplicatedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
