<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ma page de calcul</title>
</head>
<body>
	
	<c:if test="${ !empty result }">
		<p><c:out value=" ${ var1 } ${ signe } ${ var2 } = ${ result }" /></p>
	</c:if>
		
	<form method="post" action="accueil">
            <input type="text" name="var1" />
            <SELECT name="typeCalc" >
				<OPTION>add
				<OPTION>sub
				<OPTION>div
				<OPTION>mult
			</SELECT>
            <input type="text" name="var2" />
            <input type="submit" />
    </form>	
	
</body>
</html>