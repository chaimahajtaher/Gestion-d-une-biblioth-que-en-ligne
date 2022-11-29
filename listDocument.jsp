<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html> 

<html>
<head>
<body>



 <h1>Liste des Documents</h1>
<table border="1" cellpadding="0" cellspacing="0"
      style="border-collapse: collapse" bordercolor="#111111"
      width="100%" id="AutoNumber1">
    <tr bgcolor="silver">
        <td >idd</td>
        <td >code</td>
        <td >titre</td>
        <td >auteur</td>
            
        <td >annee</td>
        <td >genre</td>
        <td >nbre_page</td>
    </tr>
<c:forEach var="c" items="${listeDocument}" >
  <tr>
      <td ><c:out value="${c.idd}"/>1234</td>
      <td ><c:out value="${c.code}"/>ab22</td>
       <td ><c:out value="${c.titre}"/>jeedeveloper</td>
       <td ><c:out value="${c.auteur}"/>RanimETChaima</td>
        <td ><c:out value="${c.annee}"/>2022</td>
      <td >
      <c:out value="${c.genre}"/>livre</td>
      <td ><c:out value="${c.nbre_page}"/>100</td>
  </tr>
</c:forEach> 
</table>

<br>
    <h1>Ajout D'un document</h1>
    <form method="POST" action="controleur">
         ID du Document   : &nbsp;&nbsp;  <input type="number" name="id" value="${idd}" required="required"/>  <br>  <br>        
         Code du Document:   <input type="text" name="code" size="20" />   <br>  <br>  
         Titre du Document:   <input type="text" name="titre" size="30" />   <br>  <br>  
         Auteur du Document:   <input type="text" name="auteur" size="20" />   <br>  <br> 
        Annee du Document:   <input type="text" name="auteur" size="20" />   <br>  <br> 
           
         Genre du Document:   <input type="text" name="genre" size="20" />   <br>  <br>  
         Nombre De Page:   <input type="text" name="nombre de page" size="20" />   <br>  <br>  
         
        
              <input type="submit" value="ajouter" name="action" />
              <input type="reset" value="Reset" name="reset" />
              
              <br>
    <h1>Supression D'un document</h1>
    <form method="POST" action="controleur">
         ID du Document   : &nbsp;&nbsp;  <input type="number" name="id" value="${idd}" required="required"/>  <br>  <br>        
         
        
              <input type="submit" value="Suprimer" name="action" />
              <input type="reset" value="Reset" name="reset" />
    </form>
    </body></html>

