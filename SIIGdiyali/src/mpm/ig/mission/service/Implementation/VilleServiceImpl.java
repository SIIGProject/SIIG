package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.VilleDao;
import mpm.ig.mission.model.Ville;
import mpm.ig.mission.service.Interface.VilleService;

@Service("villeService")

public class VilleServiceImpl implements VilleService {
	
	@Autowired 
	VilleDao villeDao;

	@Override
	public void addVille(Ville ville) {
		villeDao.saveVille(ville);
	}

	@Override
	public void updateVille(Ville ville) {
		villeDao.updateVille(ville);
	}

	@Override
	public List<Ville> listVille() {
		return villeDao.findAll();
	}

	@Override
	public void deleteVille(Ville ville) {
		villeDao.deleteVille(ville);
	}
}
