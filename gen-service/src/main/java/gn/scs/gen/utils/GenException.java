/**
 * 
 */
package gn.scs.gen.utils;

/**
 * Classe des exceptions de l'application
 * @author fcamara
 *
 */
public abstract class GenException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int codeRetour;
	

	private String message;


	public int getCodeRetour() {
		return codeRetour;
	}


	public void setCodeRetour(int codeRetour) {
		this.codeRetour = codeRetour;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}



}
