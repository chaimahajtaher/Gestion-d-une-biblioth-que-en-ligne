package com.project.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.project.entities.FicheEmprunt;
@Stateless
public class LocalFicheImpl implements ILocalFiche {
	@PersistenceContext(unitName="UP_miniprojetf")
	 EntityManager em ;
	
	@Override
	public FicheEmprunt addFiche(FicheEmprunt fiche) {
	em.persist(fiche);
	return fiche;
	}
	
	@Override
	public List<FicheEmprunt> tousLesFiches(){
	Query req =em.createQuery("select d from FicheEmprunt ");
	return req.getResultList();
	}
	
	@Override
	public FicheEmprunt getfiche(int id) {
	FicheEmprunt fe= em.find(FicheEmprunt.class, id);
	if ( fe==null) throw new RuntimeException("Le document est indisponible");
	return fe;
	}
	
	@Override
	public void supprimerFiche(int id) {
	FicheEmprunt fe=getfiche(id);
	em.remove(fe);
	}

	@Override
	public void changerdateR(int id,String D) {
	FicheEmprunt fe=getfiche(id);
	fe.setDate_retour(D);
	}
	
	
	

}
