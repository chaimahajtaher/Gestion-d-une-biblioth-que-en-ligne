package com.project.service;

import java.util.List;

import com.project.entities.Document;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless


public class LocalDocumentImpl implements ILocalDocument {
	
	@PersistenceContext(name="UP_miniprojetf")
	private EntityManager em ;
	@Override
	public Document addDocument(Document doc) {
	em.persist(doc);
	return doc;
	}
	
	@Override
	public Document getDocument(int id) {
		
	Document d= em.find(Document.class, id);
	if ( d==null) throw new RuntimeException("Le document est indisponible");
	return d;
	}
	
	@Override
	public List<Document> tousLesDocuments() {
	Query req =em.createQuery("select d from Document d");
	return req.getResultList();
	}
	
	@Override
	public void supprimerDocument(int id) {
	Document d=getDocument(id);
	em.remove(d);
	}
	
	
	


}
