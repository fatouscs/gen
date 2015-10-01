package gn.scs.gen.impl;

import gn.scs.gen.dto.faculte.AjoutFaculteReponse;
import gn.scs.gen.dto.faculte.FaculteDTO;
import gn.scs.gen.service.faculte.AjoutFaculteSM;
import gn.scs.gen.utils.TechnicalException;

public class FaculteServiceImpl implements FaculteService{
	
	private AjoutFaculteSM ajoutFaculteSM;

	@Override
	public AjoutFaculteReponse ajoutFaculte(FaculteDTO request)
			throws TechnicalException {
		// TODO Auto-generated method stub
		return ajoutFaculteSM.ajoutFaculte(request);
	}
	
	
	

}
