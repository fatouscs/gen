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
@Table(name="INSCRIPTION",schema="gen")
public class Inscription implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Id
	@Column(name="IdEtudiant")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INSCRIPTIONID_gen")
	@SequenceGenerator(name="INSCRIPTIONID_gen" , sequenceName="gen.INSCRIPTION_SEQ", allocationSize=1)
	private Long idInscription;
}
