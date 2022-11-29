
package com.project.entities;

import java.util.Objects;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name="Document")
public class Document implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
	private int idd;
@Column(name="code")
    private String code;
@Column(name="titre")
	private String titre;
@Column(name="auteur")
    private String auteur;
@Column(name="annee")
    private String annee;
@Column(name="genre")
    private String genre;
@Column(name="nbre_page")
    private String nbre_page;
	public Document(int idd, String code, String titre, String auteur, String annee, String genre, String nbre_page) {
		
		this.idd = idd;
		this.code = code;
		this.titre = titre;
		this.auteur = auteur;
		this.annee = annee;
		this.genre = genre;
		this.nbre_page = nbre_page;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return idd;
	}
	public void setId(int id) {
		this.idd = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNbre_page() {
		return nbre_page;
	}
	public void setNbre_page(String nbre_page) {
		this.nbre_page = nbre_page;
	}
	 @Override
		public int hashCode() {
			return Objects.hash(annee, auteur, code, genre, idd, nbre_page, titre);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Document other = (Document) obj;
			return Objects.equals(annee, other.annee) && Objects.equals(auteur, other.auteur)
					&& Objects.equals(code, other.code) && Objects.equals(genre, other.genre) && idd == other.idd
					&& Objects.equals(nbre_page, other.nbre_page) && Objects.equals(titre, other.titre);
		}
		@Override
		public String toString() {
			return "Document [id=" + idd + ", code=" + code + ", titre=" + titre + ", auteur=" + auteur + ", annee="
					+ annee + ", genre=" + genre + ", nbre_page=" + nbre_page + "]";
		}
		public void setIntervenant(Client clientSelectionne) {
			// TODO Auto-generated method stub
			
		}
		

}

