package gn.scs.gen.impl;

import gn.scs.gen.dto.faculte.AjoutFaculteReponse;
import gn.scs.gen.dto.faculte.FaculteDTO;
import gn.scs.gen.utils.TechnicalException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Consumes("application/json")
@Produces("application/json")

public interface FaculteService {
	
	@POST
	@Path("/ajoutFaculte/")
	
	AjoutFaculteReponse ajoutFaculte(FaculteDTO request) throws TechnicalException;
	
	
}
