package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Membreequipe;

public interface MembreEquipeService {
	
		// Ajouter un nouveau membre d'equipe à la base de donnée
			public void addMembre(Membreequipe membre);
				
		// Modifier un membre d'equipe dans la base de donnée
			public void updateMembre(Membreequipe membre);
							
		// Retourner la liste de tous les membres d'equipe pour une mission
			public List<Membreequipe> listMembre();
				
		// Supprimer un membre d'equipe
			public void deleteMembre(Membreequipe membre);

}
