package ar.com.educacionit.dao.exceptions;

public class GenericDAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenericDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public GenericDAOException(String message) {
		super(message);
	}

		
}
