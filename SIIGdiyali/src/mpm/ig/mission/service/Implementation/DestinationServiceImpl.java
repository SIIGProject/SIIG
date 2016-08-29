package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.DestinationDao;
import mpm.ig.mission.model.Destination;
import mpm.ig.mission.model.Mission;
import mpm.ig.mission.service.Interface.DestinationService;

@Service("destinationService")

public class DestinationServiceImpl implements DestinationService {
	
	@Autowired
	DestinationDao destinationDao;

	@Override
	public void addDestination(Destination destination) {
		destinationDao.saveDestination(destination);
	}

	@Override
	public void updateDestination(Destination destination) {
		destinationDao.updateDestination(destination);	
	}

	@Override
	public List<Destination> listDestination() {
		return destinationDao.findAll();
	}

	@Override
	public void deleteDestination(Destination destination) {
		destinationDao.deleteDestination(destination);
	}

	@Override
	public List<Destination> listDestinationMission(Mission mission) {
		return destinationDao.findAllMission(mission);
	}

}
