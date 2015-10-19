package gn.scs.gen.transformer;

import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.faculte.FaculteDTO;
import gn.scs.gen.model.Etudiant;
import gn.scs.gen.model.Faculte;

public class FaculteMapper implements Mapper<Faculte, FaculteDTO> {

	@Override
	public FaculteDTO map(Faculte faculte) {
		// TODO Auto-generated method stub
		FaculteDTO faculteDTO=null;
		
		if(faculte!=null)
		{
			faculteDTO=new FaculteDTO();
			
			if(faculte.getIdFaculte()!=0)
			{
				faculteDTO.setIdfaculte(faculte.getIdFaculte());
			}
			faculteDTO.setLibelle(faculte.getLibelle());
		}
		
		return faculteDTO;
	}

	@Override
	public Faculte unmap(FaculteDTO faculteDTO) {
		// TODO Auto-generated method stub
		Faculte faculte=null;
		if(faculteDTO!=null)
		{
			faculte=new Faculte();
			
			if(faculteDTO.getIdFaculte()!=0)
			{
				faculte.setIdfaculte(faculteDTO.getIdFaculte());
			}
			faculte.setLibelle(faculteDTO.getLibelle());
		}
		
		return faculte;
		

	}

}
