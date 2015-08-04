package gn.scs.gen.dto.etudiant;

import java.io.Serializable;
import java.util.Date;

public class EtudiantDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3172074532953355466L;

	
	private Long idEtudiant;
	
	private String matricule;
	private String nom;
	private String prenom;
	private String sexe;
	private Date dateNaissance;
	private String adresse;
	private String email;
	private String tuteur;
	private String telephone;
	private String telephoneTuteur;
	private String nationalite;
	private String situationMatrimoniale;
	/**
	 * @return the idEtudiant
	 */
	public Long getIdEtudiant() {
		return idEtudiant;
	}
	/**
	 * @param idEtudiant the idEtudiant to set
	 */
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the tuteur
	 */
	public String getTuteur() {
		return tuteur;
	}
	/**
	 * @param tuteur the tuteur to set
	 */
	public void setTuteur(String tuteur) {
		this.tuteur = tuteur;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the nationalite
	 */
	public String getNationalite() {
		return nationalite;
	}
	/**
	 * @param nationalite the nationalite to set
	 */
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	/**
	 * @return the telephoneTuteur
	 */
	public String getTelephoneTuteur() {
		return telephoneTuteur;
	}
	/**
	 * @param telephoneTuteur the telephoneTuteur to set
	 */
	public void setTelephoneTuteur(String telephoneTuteur) {
		this.telephoneTuteur = telephoneTuteur;
	}
	/**
	 * @return the situationMatrimoniale
	 */
	public String getSituationMatrimoniale() {
		return situationMatrimoniale;
	}
	/**
	 * @param situationMatrimoniale the situationMatrimoniale to set
	 */
	public void setSituationMatrimoniale(String situationMatrimoniale) {
		this.situationMatrimoniale = situationMatrimoniale;
	}
	
	
}
