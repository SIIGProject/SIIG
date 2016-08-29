package mpm.ig.mission.dao.Interface;

import java.util.List;

import mpm.ig.mission.model.Entite;
import mpm.ig.mission.model.Ville;

public interface EntiteDao {
	public Entite findEntite(Entite entite);
	public void saveEntite(Entite entite);
	public void deleteEntite(Entite entite);
	public void updateEntite(Entite entite);
	public List<Entite> findAllVille(Ville ville);
	public List<Entite> findAll();

}
