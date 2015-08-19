package gn.scs.gen.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ETUDIANT",schema="gen")
public class Etudiant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4127733034453530614L;


	@Id
	@Column(name="Idetudiant")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ETUDIANTID_gen")
	@SequenceGenerator(name="ETUDIANTID_gen" , sequenceName="gen.ETUDIANT_SEQ", allocationSize=1)
	private Long idEtudiant;

	@Column(name="STATUS")
	private String matricule;

	@Column(name="nom")
	private String nom;

	@Column(name="prenom")
	private String prenom;

	@Column(name="sexe")
	private String sexe;

	@Column(name="date_naissance")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaissance;

	@Column(name="adresse")
	private String adresse;

	@Column(name="email")
	private String email;

	@Column(name="tuteur")
	private String tuteur;

	@Column(name="telephone")
	private String telephone;

	@Column(name="telephone_tuteur")
	private String telephoneTuteur;

	@Column(name="nationalite")
	private String nationalite;

	@Column(name="situation_matrimoniale")
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
