<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nieuw Boek</title>
</head>
<body>
	<div align="center">
		<h1>Nieuw Boek</h1>
		
		<form action="./save" method="post" enctype="multipart/form-data">
			<table>
				 
				<tr>
					<td>Titel:</td>
					<td><input name="titel" /> </td>
				</tr>
				<tr>
					<td>Auteur:</td>
					<td><input name="auteur" /> </td>
				</tr>
				
				<tr>
					<td>Taal:</td>
					<td>
						<select name="taalID" id="taal">
						  <option value="1">Nederlands</option>
						  <option value="2">Engels</option>
						
						</select>
					</td>
				</tr>
				<tr>
					<td>Categorie:</td>
					<td>
						<select name="categorie" id="categorie">
						  <option value="Fictie">Fictie</option>
						  <option value="Spanning">Spanning</option>
						  <option value="Non-fictie">Non-fictie</option>
						  <option value="Jeugdboeken">Jeugdboeken</option>
						  <option value="Kookboeken">Kookboeken</option>
						  <option value="Reisgidsen">Reisgidsen</option>
						  <option value="Nagslagwerken">Nagslagwerken</option>
						  <option value="Cadeauboeken">Cadeauboeken</option>
						  <option value="wegenkaarten">wegenkaarten</option>
						  <option value="Medisch">Medisch</option>
						  <option value="Studieboeken">Studieboeken</option>
						
						</select>
					</td>
				</tr>
				<tr>
					<td>Afbeelding path + naam: (bijv: resources/img/kevingates.jpg)</td>
					<td><input name="afbeelding" /> </td>
				</tr>
				<tr>
					<td>Omschrijving:</td>
					<td><input name="omschrijving" /> </td>
				</tr>
				<tr>
					<td>Prijs:</td>
					<td><input name="prijs" /> </td>
				</tr>
				<tr>
					<td>Vooraad:</td>
					<td><input name="vooraad" /> </td>
				</tr>
				<tr>
					<td><label name="file">Foto: </label></td>
    				<td><input type="file" name="file" accept="image/png, image/jpeg" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Save">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>