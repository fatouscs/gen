package gn.scs.gen.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="FACULTE",schema="gen")

public class Faculte implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -882476521476978108L;
	
	private int idFaculte;
	private String libelle;
	
	public int getIdFaculte(){
		return this.idFaculte;	
	}
	public void setIdfaculte(int idFaculte){
		this.idFaculte=idFaculte;
	}
	
	public String getLibelle(){
		return this.libelle;
	}
	public void setLibelle(String libelle){
		this.libelle=libelle;
	}
}
