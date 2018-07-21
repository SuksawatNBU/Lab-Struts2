<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="alert alert-success" role="alert">
	  <strong>Well done!</strong> <s:property value="model.loginResult.message"/>
	</div>
</body>
</html>