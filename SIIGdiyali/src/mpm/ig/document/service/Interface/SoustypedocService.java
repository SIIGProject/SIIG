package mpm.ig.document.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Soustypedoc;

public interface SoustypedocService {
	
	public void addSousType(Soustypedoc soustype);

	public void updateSousType(Soustypedoc soustype);

	public List<Soustypedoc> listSousType();

	public void deleteSousType(Soustypedoc soustype);
}
