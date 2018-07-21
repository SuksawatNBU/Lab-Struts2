<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript">
	function loginPojo() {
		document.forms[0].action = '<s:url value="/jsp/action/loginPOJOAction.action"/>';
		document.forms[0].submit();
	}
	
	function loginActionSupport() {
		document.forms[0].action = '<s:url value="/jsp/action/loginActSupportAction.action"/>';
		document.forms[0].submit();
	}
</script>

</head>
<body>
	<div class="container">
		<form class="form col-5 mx-auto" method="post">
			<div class="form-group">
			  <s:text name="acc.username" />
			  <s:textfield id="username" name="model.login.username" cssClass="form-control" />
			</div>
			<div class="form-group">
			  <s:text name="acc.password" />
			  <s:password id="password" name="model.login.password" cssClass="form-control" />
			</div>
			<button type="button" class="btn btn-primary float-right ml-3" onclick="loginPojo();">Login (Pojo)</button>
			<button type="button" class="btn btn-secondary float-right" onclick="loginActionSupport();">Login (ActionSupport)</button>
		</form>
	</div>
</body>
</html>