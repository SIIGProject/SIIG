package mpm.ig.document.service.Interface;

import java.util.List;

import mpm.ig.mission.model.Typedoc;

public interface TypeDocService {

	public void addType(Typedoc type);

	public void updateType(Typedoc type);

	public List<Typedoc> listType();

	public void deleteType(Typedoc type);

}
