package gn.scs.gen.utils;

public class TechnicalException extends GenException {

	private static final long serialVersionUID = 1L;

	public TechnicalException() {
		this.setCodeRetour(999);
		this.setMessage("Erreur technique survenue. Contactez l'administrateur.");
	}
	
	public TechnicalException(Exception exception) {
		this.setCodeRetour(999);
		this.setMessage("Erreur technique survenue. Contactez l'administrateur.");
		this.setStackTrace(exception.getStackTrace());
	}
}
