package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Missionpj;

public interface MissionPjService {

		// Ajouter une nouvelle piece jointe à la base de donnée
			public void addPj(Missionpj pj);
				
		// Modifier une piece jointe dans la base de donnée
			public void updatePj(Missionpj pj);
						
		// Retourner la liste de toutes les pieces jointes
			public List<Missionpj> listPj();
				
		// Supprimer une piece jointe
			public void deletePj(Missionpj pj);
}
