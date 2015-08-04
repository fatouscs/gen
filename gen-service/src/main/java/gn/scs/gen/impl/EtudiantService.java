package gn.scs.gen.impl;

import gn.scs.gen.dto.etudiant.AjoutEtudiantReponse;
import gn.scs.gen.dto.etudiant.AjoutEtudiantRequete;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Consumes("application/json")
@Produces("application/json")
public interface EtudiantService {

	@POST
	@Path("/addExposant/")
	public AjoutEtudiantReponse addExposant(AjoutEtudiantRequete request);
}
