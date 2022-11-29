
package com.project.entities;

import java.util.Objects;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name="Client")
public class Client implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
	private String cin;
@Column(name="nom")
    private String nom;
@Column(name="prenom")
    private String prenom;
@Column(name="adresse")
    private String adresse;
@Column(name="telephone")
    private String telephone;
	public Client(String cin, String nom, String prenom, String adresse, String telephone) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
	}
	public Client() {
		
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adresse, cin, nom, prenom, telephone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(adresse, other.adresse) && Objects.equals(cin, other.cin)
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(telephone, other.telephone);
	}
	@Override
	public String toString() {
		return "Client [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", telephone=" + telephone + "]";
	}
	
    


}
