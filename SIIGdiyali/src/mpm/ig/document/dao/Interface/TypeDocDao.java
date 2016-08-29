package mpm.ig.document.dao.Interface;

import java.util.List;

import mpm.ig.mission.model.Typedoc;

public interface TypeDocDao {
	public Typedoc findTypedoc(Typedoc typedoc);
	public void saveTypeDoc(Typedoc typedoc);
	public void deleteTypeDoc(Typedoc typedoc);
	public void updateTypeDoc(Typedoc typedoc);
	public List<Typedoc> findAll();

}
