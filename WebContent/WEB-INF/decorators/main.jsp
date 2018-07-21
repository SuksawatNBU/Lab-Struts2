<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
	<head>
		<title><s:text name="applicationName"/></title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta http-equiv="Cache-control" content="no-cache, no-store, must-revalidate" />
		<meta http-equiv="Pragma" content="no-cache"/>
		<meta http-equiv="Expires" content="0" />
		
		<s:include value="/jsp/template/javascript.jsp"/>
		<s:include value="/jsp/template/css.jsp"/>
		
		<decorator:head/>
	</head>
	<body>
		<decorator:body/>
	</body>
</html>