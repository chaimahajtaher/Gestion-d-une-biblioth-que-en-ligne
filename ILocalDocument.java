
package com.project.service;

import java.util.List;

import javax.ejb.Local;

import com.project.entities.Document;
@Local
public interface ILocalDocument {
	public Document addDocument(Document doc);
	public Document getDocument(int id);
	public List<Document> tousLesDocuments();
	public void supprimerDocument(int id);
	

}
