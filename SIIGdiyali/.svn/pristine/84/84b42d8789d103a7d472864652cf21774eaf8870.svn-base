package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.MissionpjDao;
import mpm.ig.mission.model.Missionpj;
import mpm.ig.mission.service.Interface.MissionPjService;

@Service("missionpjService")

public class MissionPjServiceImpl implements MissionPjService {
	
	@Autowired
	MissionpjDao missionpjDao; 

	@Override
	public void addPj(Missionpj pj) {
		missionpjDao.saveMissionpj(pj);	
	}

	@Override
	public void updatePj(Missionpj pj) {
		missionpjDao.updateMissionpj(pj);
	}

	@Override
	public List<Missionpj> listPj() {
		return missionpjDao.findAll();
	}

	@Override
	public void deletePj(Missionpj pj) {
		missionpjDao.deleteMissionpj(pj);
	}

}
