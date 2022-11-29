
package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.project.entities.Client;
import com.project.entities.Document;
import com.project.service.ILocalClient;
import com.project.service.ILocalDocument;




@WebServlet(name="cs",urlPatterns={"/controleur"})
public class controleurServlet extends HttpServlet{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	ServletContext context ;
	@EJB private ILocalDocument metierDocument;
	@EJB private ILocalClient metierClient;
	
	
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		context= request.getSession().getServletContext();
	
	   List<Client> listeClients=	metierClient.tousLesClients();
	   List<Document> listeDocuments=metierDocument.tousLesDocuments();
		 
			

		context.setAttribute("listeDocuments", listeDocuments);
		context.setAttribute("listeClients",listeClients );
		  
			
		
	      // request.getRequestDispatcher("listeCours.jsp").forward(request, response); 
           context.getRequestDispatcher("/listeDocuments.jsp").forward(request, response);
	} 
	
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		context= request.getSession().getServletContext();
	
	   List<Client> listeClients=	metierClient.tousLesClients();
		
		String action=request.getParameter("action"); 
		 
			if(action.equals("ajouter"))
		
			{ 
				Integer id= Integer.parseInt(request.getParameter("id"));
				String auteur= request.getParameter("auteur");
				String annee=request.getParameter("annee");
				String titre=request.getParameter("titre");
				String ClientString = request.getParameter("cin");
				
				
				
				Document doc= new Document(id, auteur, annee, titre, ClientString, action, null);
				
				//doc.setIntervenant(Client);
				metierDocument.addDocument(doc);
				request.setAttribute("beanDoc", doc);
				List<Document> listeDocuments=metierDocument.tousLesDocuments();

				context.setAttribute("listeDocument", listeDocuments);
				context.setAttribute("listeClients", listeClients);
		    } 
			 
           context.getRequestDispatcher("/listeDocument.jsp").forward(request, response);
	} 
	}
