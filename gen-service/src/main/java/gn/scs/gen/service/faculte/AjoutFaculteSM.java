package gn.scs.gen.service.faculte;

import gn.scs.gen.dto.faculte.AjoutFaculteReponse;
import gn.scs.gen.dto.faculte.FaculteDTO;
import gn.scs.gen.utils.TechnicalException;

public interface AjoutFaculteSM {
	
	AjoutFaculteReponse ajoutFaculte(FaculteDTO request) throws TechnicalException;

}
