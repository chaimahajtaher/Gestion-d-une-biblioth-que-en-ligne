package com.project.service;


import java.util.List;

import javax.ejb.Local;

import com.project.entities.FicheEmprunt;
@Local
public interface ILocalFiche {
	public FicheEmprunt addFiche(FicheEmprunt fiche);
	public List<FicheEmprunt> tousLesFiches();
	public FicheEmprunt getfiche(int id);
	public void supprimerFiche(int id);
	public void changerdateR(int id, String D);
}
