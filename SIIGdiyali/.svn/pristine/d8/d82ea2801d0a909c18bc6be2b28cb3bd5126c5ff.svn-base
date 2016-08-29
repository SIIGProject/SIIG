package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.TypePJDao;
import mpm.ig.mission.model.Typepj;
import mpm.ig.mission.service.Interface.TypepjService;

@Service("typepjService")
public class TypepjServiceImpl implements TypepjService {

	@Autowired
	TypePJDao typepjDao;

	@Override
	public List<Typepj> listTypepj() {
		return typepjDao.findAll();
	}

}
