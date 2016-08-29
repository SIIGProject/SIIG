package mpm.ig.document.service.Implementation;

import java.util.List;

import mpm.ig.document.dao.Interface.SousTypeDocDao;
import mpm.ig.document.service.Interface.SoustypedocService;
import mpm.ig.mission.model.Soustypedoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SoustypedocService")
public class SoustypedocServiceImpl implements SoustypedocService{
	
	@Autowired
	SousTypeDocDao SoustypedocDao;

	public void addSousType(Soustypedoc soustype)
	{
		SoustypedocDao.saveSousTypeDoc(soustype);
	}

	public void updateSousType(Soustypedoc soustype)
	{
		SoustypedocDao.updateSousTypeDoc(soustype);
	}

	public List<Soustypedoc> listSousType()
	{
		return SoustypedocDao.findAll();
	}

	public void deleteSousType(Soustypedoc soustype)
	{
		SoustypedocDao.deleteSousTypeDoc(soustype);
	}
}
