package mpm.ig.document.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.document.dao.Interface.TypeDocDao;
import mpm.ig.document.service.Interface.TypeDocService;
import mpm.ig.mission.model.Typedoc;

@Service("TypeDocsService")
public class TypeDocsServiceImpl implements TypeDocService {

	@Autowired
	TypeDocDao typedocDao;

	@Override
	public void addType(Typedoc type) {
		typedocDao.saveTypeDoc(type);
	}

	@Override
	public void updateType(Typedoc type) {
		typedocDao.updateTypeDoc(type);
	}

	@Override
	public List<Typedoc> listType() {
		return typedocDao.findAll();
	}

	@Override
	public void deleteType(Typedoc type) {
		typedocDao.deleteTypeDoc(type);
	}

}
