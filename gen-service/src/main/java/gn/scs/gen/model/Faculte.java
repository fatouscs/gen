package gn.scs.gen.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="FACULTE",schema="gen")

public class Faculte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -882476521476978108L;
	
	@Id
	@Column(name="Idetudiant")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FACULTEID_gen")
	@SequenceGenerator(name="FACULTEID_gen" , sequenceName="gen.FACULTE_SEQ", allocationSize=1)
	private long idFaculte;
	
	@Column(name="libelle")
	private String libelle;
	
	public long getIdFaculte(){
		return this.idFaculte;	
	}
	public void setIdfaculte(long idFaculte){
		this.idFaculte=idFaculte;
	}
	
	public String getLibelle(){
		return this.libelle;
	}
	public void setLibelle(String libelle){
		this.libelle=libelle;
	}
}
