package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.EntiteDao;
import mpm.ig.mission.model.Entite;
import mpm.ig.mission.model.Ville;
import mpm.ig.mission.service.Interface.EntiteService;

@Service("entiteService")

public class EntiteServiceImpl implements EntiteService {
	
	Ville ville;
	
	@Autowired
	EntiteDao entiteDao;

	@Override
	public void addEntite(Entite entite) {
		entiteDao.saveEntite(entite);
	}

	@Override
	public void updateEntite(Entite entite) {
		entiteDao.updateEntite(entite);
	}

	@Override
	public List<Entite> listEntiteVille(Ville Ville) {
		return entiteDao.findAllVille(ville);
	}

	@Override
	public void deleteEntite(Entite entite) {
		entiteDao.deleteEntite(entite);
	}

	@Override
	public List<Entite> listeEntite() {
		return entiteDao.findAll();
	}

}
