package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.TypemissionDao;
import mpm.ig.mission.model.Typemission;
import mpm.ig.mission.service.Interface.TypeMissionService;

@Service("typemissionService")

public class TypeMissionServiceImpl implements TypeMissionService {
	
	@Autowired
	TypemissionDao typemissionDao;

	@Override
	public void addType(Typemission type) {
		typemissionDao.saveTypemission(type);	
	}

	@Override
	public void updateType(Typemission type) {
		typemissionDao.updateTypemission(type);	
	}

	@Override
	public List<Typemission> listType() {
		return typemissionDao.findAll();
	}

	@Override
	public void deleteType(Typemission type) {
		typemissionDao.deleteTypemission(type);
	}

}
