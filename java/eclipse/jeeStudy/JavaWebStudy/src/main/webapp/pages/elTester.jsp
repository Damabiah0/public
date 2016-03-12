<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Tester</title>
</head>
<body>
	<%
	 request.setAttribute("none", "");  
	request.setAttribute("x", "10");  
	request.setAttribute("i", "01");  
	session.setAttribute("v", "05");
	
	String string=new String();
	%>
	
	<!-- $  {" " gt -1} -->
	For:
	<p>
		request[ none='${none}',x='${x}',i='${i}' ]
		session[ v='${v}' ]
	</p>
	<p>
	$ { i le 1}=	${ i le 1}
	</p>
	<p>
	$ {v lt 05} =  ${v lt 05} 
	 </p>
	<p>$ {none gt -1} =
	 ${none gt -1} (None = '' than in EL is equal to 0)
	  </p>
	<p> $ {x ge v} =
	 ${x ge v}
	  </p>
	 <p>  $ {requestScope['none'] eq 0}=
	 ${requestScope['none'] eq 0}
	  </p>
	<p> $ {empty none}=
	 ${empty none}
	  </p>
</body>
</html>