package gn.scs.gen.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import gn.scs.gen.dto.etudiant.AjoutEtudiantReponse;
import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.utils.TechnicalException;


@Consumes("application/json")
@Produces("application/json")
public interface EtudiantService {

	/**
	 * Méthode d'ajout d'un nouvel étudiant
	 * @param request
	 * 	Informations de l'étudiant
	 * @return Etudiant crée
	 * @throws TechnicalException 
	 */
	@POST
	@Path("/ajoutEtudiant/")
	public AjoutEtudiantReponse ajoutEtudiant(EtudiantDTO request) throws TechnicalException;


	/**
	 * 
	 * Méthode d'ajout d'un nouvel étudiant suite à une inscription
	 * @param demande
	 * 	Demande d'inscriptipon
	 * @return Etudiant crée
	 * @throws TechnicalException 
	 */
	@POST
	@Path("/inscriptionEtudiant/")
	public AjoutEtudiantReponse inscriptionEtudiant(InscriptionDTO demande) throws TechnicalException;
}
