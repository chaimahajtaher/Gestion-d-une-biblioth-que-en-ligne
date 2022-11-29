<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html> 

<html>
<head>
<body>



 <h1>Liste des Fiches</h1>
<table border="1" cellpadding="0" cellspacing="0"
      style="border-collapse: collapse" bordercolor="#111111"
      width="100%" id="AutoNumber1">
    <tr bgcolor="purple">
        <td >id</td>
        <td >date_emprunt</td>
        <td >date_retour</td>
        <td >Client cin</td>
        <td >Document idd</td>
    </tr>
<c:forEach var="c" items="${listeFiche}" >
  <tr>
      <td ><c:out value="${c.id}"/>1478</td>
      <td ><c:out value="${c.date_emprunt}"/>20-01-2022</td>
       <td ><c:out value="${c.date_retour}"/>23-01-2022</td>
       <td ><c:out value="${c.Client.cin}"/>123456</td>
        <td ><c:out value="${c.Document.idd}"/>15896</td>
      
  </tr>
</c:forEach> 
</table>

<br>
    <h1>Ajout D'une Fiche Emprunt</h1>
    <form method="POST" action="controleur">
         ID du Fiche   : &nbsp;&nbsp;  <input type="number" name="id" value="${id}" required="required"/>  <br>  <br>        
         Date Emrunt Du Fiche:   <input type="text" name="code" size="20" />   <br>  <br>  
         Date Retour Du Fiche:   <input type="text" name="titre" size="30" />   <br>  <br>  
         Client   :  &nbsp;&nbsp; &nbsp;<select NAME="choice"  > <br> <br> 
              <c:forEach var="item" items="${listeClient}">
                <option>
                  <c:out value="${item.cin}" />
                </option>
              </c:forEach>
            </select>         <br>     
     <br>
     Document   :  &nbsp;&nbsp; &nbsp;<select NAME="choice"  > <br> <br> 
              <c:forEach var="item" items="${listeDocument}">
                <option>
                  <c:out value="${item.idd}" />
                </option>
              </c:forEach>
            </select>         <br>     
     <br>
        
              <input type="submit" value="ajouter" name="action" />
              <input type="reset" value="Reset" name="reset" />
              
              <br>
    <h1>Supression D'une Fiche</h1>
    <form method="POST" action="controleur">
         ID du Fiche   : &nbsp;&nbsp;  <input type="number" name="id" value="${id}" required="required"/>  <br>  <br>        
         
        
              <input type="submit" value="Suprimer" name="action" />
              <input type="reset" value="Reset" name="reset" />
    </form>
    </body></html>