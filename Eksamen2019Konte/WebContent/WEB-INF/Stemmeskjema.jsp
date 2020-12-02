<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stemmeskjema</title>
</head>
<body>
	<h1>${quiz.tittel}</h1>
	<p>Velg et av alternativene i listen</p>
	<form action="">
		<fieldset>
			<legend>Ditt svar</legend>
			<c:forEach items="${quiz.alternativer}" var="a">
				<p>${a.key}&ensp;<input type="radio" name="stemme" value="${a.key}"></p>
			</c:forEach>
			<p style="color: red">${stemme == null ? "Du må velge ett alternativ. Prøv igjen!" : "" }</p>
			<input type="submit" value="Send stemme">
		</fieldset>
	</form>
</body>
</html>