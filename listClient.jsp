<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html> 

<html>
<head>
<body>



 <h1>Liste des Clients</h1>
<table border="1" cellpadding="0" cellspacing="0"
      style="border-collapse: collapse" bordercolor="#111111"
      width="100%" id="AutoNumber1">
    <tr bgcolor="pink">
        <td >cin</td>
        <td >nom</td>
        <td >prenom</td>
        <td >adresse</td>
            
        <td >telephone</td>
        
    </tr>
<c:forEach var="c" items="${listeClient}" >
  <tr>
      <td ><c:out value="${c.cin}"/></td>
      <td ><c:out value="${c.nom}"/></td>
       <td ><c:out value="${c.prenom}"/></td>
       <td ><c:out value="${c.adresse}"/></td>
        <td ><c:out value="${c.telephone}"/></td>
      
      
  </tr>
</c:forEach> 
</table>

<br>
    <h1>Ajout D'un Client</h1>
    <form method="POST" action="controleur">
         CIN Du Client:  <input type="text" name="cin" size="20" />   <br>  <br>            
         Nom Du Client:   <input type="text" name="nom" size="20" />   <br>  <br>  
         Prénom Du Client:   <input type="text" name="prenom" size="20" />   <br>  <br>  
         Adresse Du Client:   <input type="text" name="adresse" size="20" />   <br>  <br> 
         Télèphone:   <input type="text" name="telephone" size="20" />   <br>  <br> 
           
         
        
              <input type="submit" value="ajouter" name="action" />
              <input type="reset" value="Reset" name="reset" />
              
              <br>
    <h1>Supression D'un document</h1>
    <form method="POST" action="controleur">
         CIN Du Client   : <input type="text" name="cin" size="20" />   <br>  <br>   
         
        
              <input type="submit" value="Suprimer" name="action" />
              <input type="reset" value="Reset" name="reset" />
    </form>
    </body></html>