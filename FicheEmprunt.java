
package com.project.entities;

import java.util.Objects;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;


@Entity
@Table(name="FicheEmprunt")
public class FicheEmprunt implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
	private int id;
@Column(name="date_emrunt")
    private String date_emprunt;
@Column(name="date_retour")
    private String date_retour;
@ManyToMany 
@JoinColumn(name="cin")
    private Client client;
@OneToOne
@JoinColumn(name="idd")
    private Document document;
   
    
	public FicheEmprunt(int id, Client client, Document document, String date_emprunt, String date_retour) {
		super();
		this.id = id;
		this.client = client;
		this.document = document;
		this.date_emprunt = date_emprunt;
		this.date_retour = date_retour;
	}

	public FicheEmprunt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getDate_emprunt() {
		return date_emprunt;
	}

	public void setDate_emprunt(String date_emprunt) {
		this.date_emprunt = date_emprunt;
	}

	public String getDate_retour() {
		return date_retour;
	}

	public void setDate_retour(String date_retour) {
		this.date_retour = date_retour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(client, date_emprunt, date_retour, document, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FicheEmprunt other = (FicheEmprunt) obj;
		return Objects.equals(client, other.client) && Objects.equals(date_emprunt, other.date_emprunt)
				&& Objects.equals(date_retour, other.date_retour) && Objects.equals(document, other.document)
				&& id == other.id;
	}

	@Override
	public String toString() {
		return "FicheEmprunt [id=" + id + ", client=" + client + ", document=" + document + ", date_emprunt="
				+ date_emprunt + ", date_retour=" + date_retour + "]";
	}
	
    
}
