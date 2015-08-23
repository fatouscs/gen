package gn.scs.gen.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gn.scs.gen.model.Etudiant;

/**
 * @author Fatou Camara
 *
 */
@Transactional
@Component
public class EtudiantDaoImpl  extends CrudRepositoryImpl<Etudiant> implements EtudiantDao {

	/**
	 * Méthode de recherche d'étudiant selon l'email
	 * @param email
	 * Email à rechercher
	 * @return Etudiant à rechercher	 
	 * */
	@Override
	public Etudiant rechercheEtudiantByEmail(String email){
			
		Query query = getEm().createQuery("select etudiant from Etudiant etudiant where etudiant.email=:email");
		query.setParameter("email", email);
		Etudiant etu = null;
		try {
			etu = (Etudiant) query.getSingleResult();

		} catch(NoResultException e) {
			
			//Pas de résultat
		}
		return etu;
	}
	

	
}
