<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<html>
<head>
	
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="container">

		<div class="card">
			<div class="card-header">Lab Struts 2</div>
			<div class="card-body">
				<div class="list-group">
					<a href="jsp/bundle/initBundleAction.action" class="list-group-item">Resource Bundles</a>
					<a href="#" class="list-group-item">ResultType + Global Result</a>
					<a href="jsp/interceptor/initBooking.action" class="list-group-item">Interceptor + TokenInterceptor</a>
					<a href="jsp/model/loadPrivilege.action" class="list-group-item">ModelDriven</a>
					<a href="jsp/action/initPOJOAction.action" class="list-group-item">Action + ActionSupport</a>
					<a href="jsp/wildcard/initEmail.action" class="list-group-item">Wildcard Mapping</a>
					<a href="jsp/strutstag/initCourse.action" class="list-group-item">Struts Tag</a>
					<a href="jsp/globalexception/initRoom.action" class="list-group-item">Global Exception</a>
					<a href="jsp/pre-ognl/initPreAction.action?param1=Hello" class="list-group-item">OGNL</a>
				</div> 
			</div>
		</div>
		<s:set name="applicationName" scope="application" value="%{'Lab Struts2'}"/>
	</div>
</body>
</html>