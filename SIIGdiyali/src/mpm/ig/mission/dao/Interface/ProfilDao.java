package mpm.ig.mission.dao.Interface;

import java.util.List;

import mpm.ig.mission.model.Profil;

public interface ProfilDao {
	public Profil findProfil(Profil profil);
	public void saveProfil(Profil profil);
	public void deleteProfil(Profil profil);
	public void updateProfil(Profil profil);
	public List<Profil> findAll();

}
