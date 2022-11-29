package com.project.service;
import java.util.List;

import javax.ejb.Local;

import com.project.entities.Client;

@Local

public interface ILocalClient {
	
	public Client ajoutClient(Client c);
	public List<Client> tousLesClients();
	public Client getClient(String cin);
	public void  supprimerClient(String cin);
	

}
