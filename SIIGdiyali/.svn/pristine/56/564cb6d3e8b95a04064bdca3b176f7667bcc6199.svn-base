package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.MissionDao;
import mpm.ig.mission.model.Mission;
import mpm.ig.mission.service.Interface.MissionService;

@Service("missionService")
public class MissionServiceImpl implements MissionService {

	@Autowired
	MissionDao missionDao;

	@Override
	public void addMission(Mission mission) {
		
		missionDao.saveMission(mission);
	}

	@Override
	public void updateMission(Mission mission) {
		
		missionDao.updateMission(mission);
	}

	@Override
	public List<Mission> listMission() {
		
		return missionDao.findAll();
	}

	@Override
	public void deleteMission(Mission mission) {
		
		missionDao.deleteMission(mission);
	}


	@Override
	public List<Mission> listMissionByDebut(Mission mission) {

		return missionDao.findMission(mission);
	}

	@Override
	public Mission list() {
	return missionDao.find();
	}

}
