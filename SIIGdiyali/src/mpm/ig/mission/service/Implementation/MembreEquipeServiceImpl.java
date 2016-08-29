package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.MembreequipeDao;
import mpm.ig.mission.model.Membreequipe;
import mpm.ig.mission.service.Interface.MembreEquipeService;

@Service("membreequipeService")

public class MembreEquipeServiceImpl implements MembreEquipeService {
	
	@Autowired
	MembreequipeDao membreequipeDao;

	@Override
	public void addMembre(Membreequipe membre) {
		membreequipeDao.saveMembreequipe(membre);	
	}

	@Override
	public void updateMembre(Membreequipe membre) {
		membreequipeDao.updateMembreequipe(membre);	
	}

	@Override
	public List<Membreequipe> listMembre() {
		return membreequipeDao.findAll();
	}

	@Override
	public void deleteMembre(Membreequipe membre) {
		membreequipeDao.deleteMembreequipe(membre);
	}

}
