package mpm.ig.document.dao.Interface;

import java.util.List;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

public interface SousTypeDocDao {
	
	public Soustypedoc findSousTypedoc(Soustypedoc soustypedoc);
	
	public void saveSousTypeDoc(Soustypedoc soustypedoc);
	
	public void deleteSousTypeDoc(Soustypedoc soustypedoc);
	
	public void updateSousTypeDoc(Soustypedoc soustypedoc);
	
	public List<Soustypedoc> findAll();
}
