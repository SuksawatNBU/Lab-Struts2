<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	
	<div class="container" style="margin-top: 20px;">
		<div class="border border-dark">
		  	<s:url id="en" namespace="/jsp/bundle" action="changeLocaleBundleAction" >
		  		<s:param name="request_locale">en</s:param>
		  	</s:url>
		  	<s:url id="th" namespace="/jsp/bundle" action="changeLocaleBundleAction">
		  		<s:param name="request_locale">th</s:param>
		  	</s:url>
		  	
		  	<s:a href="%{en}">EN</s:a>
		  	<s:a href="%{th}">TH</s:a>
	  		
		  	<div class="row">
			    <div class="col-sm"></div>
			    <div class="col-sm">
					<s:form>
			  			<table>
			  				<tr>
			  					<td><s:text name="global.username"></s:text></td>
			  					<td><s:textfield id="user" key="global.username" name="username" /></td>
			  				</tr>
			  				<tr>
			  					<td><s:text name="global.password"></s:text></td>
			  					<td><s:textfield id="pass" key="global.password" name="password" /></td>
			  				</tr>
			  				<tr>
			  					<td></td>
			  					<td align="right"><s:submit key="global.submit" /></td>
			  				</tr>
			  			</table>
					</s:form>
			    </div>
			    <div class="col-sm"></div>
			</div>
		  	<p/>
		</div>
	</div>
	
</body>
</html>