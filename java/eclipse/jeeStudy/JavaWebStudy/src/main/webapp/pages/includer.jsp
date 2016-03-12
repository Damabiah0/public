<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Includer</title>
</head>
<body>
	<jsp:useBean id="dummy1" class="br.com.java.study.web.model.Dummy" scope="request">
		<jsp:setProperty name="dummy1" property="name" value="Nathan"/>
	</jsp:useBean>
	
	<jsp:useBean id="dummy2" class="br.com.java.study.web.model.Dummy" scope="request">
		<jsp:setProperty name="dummy2" property="name" value="Brenda"/>
	</jsp:useBean>
	<p>
		<jsp:getProperty property="name" name="dummy1"/>
	</p>
	
	<p>
		${dummy2.name}
	</p>
	<p>
		<%@ include file="/pages/randomNumber.jsp"   %>
	</p>
	<p>
		<c:import url="/pages/randomNumber.jsp"  />
	</p>
	<p>
		<jsp:include page="randomNumber.jsp"  ></jsp:include>
	</p>
		<c:url value="/pages/randomNumber.jsp" />
</body>
</html>