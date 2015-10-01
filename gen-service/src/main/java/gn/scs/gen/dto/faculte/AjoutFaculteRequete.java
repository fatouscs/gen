package gn.scs.gen.dto.faculte;

import java.io.Serializable;

public class AjoutFaculteRequete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2368457128418199190L;
	
	private FaculteDTO faculte;

	public FaculteDTO getFaculte() {
		return faculte;
	}

	public void setFaculte(FaculteDTO faculte) {
		this.faculte = faculte;
	}
	

	
}
