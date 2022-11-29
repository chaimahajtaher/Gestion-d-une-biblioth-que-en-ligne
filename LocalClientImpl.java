package com.project.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ejb.Stateless;

import com.project.entities.Client;
@Stateless

public class LocalClientImpl implements ILocalClient {
	@PersistenceContext(unitName="UP_miniprojetf")
	private EntityManager em ;
	
	@Override
	public Client ajoutClient(Client c) {
	em.persist(c);
	return c;
	}
	
	@Override
	public Client getClient(String cin) {
		
	Client c= em.find(Client.class, cin);
	if ( c==null) throw new RuntimeException("Le client est indisponible");
	return c;
	}
	
	@Override
	public List<Client> tousLesClients() {
	Query req =em.createQuery("select c from Client c");
	return req.getResultList();
	}
	
	@Override
	public void supprimerClient(String cin) {
	Client c=getClient(cin);
	em.remove(c);}
	
	
	
	

}
