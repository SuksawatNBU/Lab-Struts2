<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<style type="text/css">
			.message {
				font-weight: bold;
				color: red;
				text-align: center;
				margin-left: auto; 
				margin-right: auto;
				width: 350px;
			}
		</style>
		<script type="text/javascript">
			function search() {
				document.forms[0].action = '<s:url value="/jsp/globalexception/searchRoom.action"/>';
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<s:form>
			<div style="width: 400px; margin-left: auto; margin-right: auto;">
				<s:if test="hasActionMessages()">
					<div class="message">
				    	<s:actionmessage/>
					</div>
				</s:if>
				<div style="width: 35%; float: left;">Room Name:</div>
				<div style="width: 65%; float: left;"><s:textfield name="criteria.data.roomName" /></div>
				<div style="width: 35%; float: left;">&nbsp;</div>
				<div style="width: 65%; float: left;"><button type="button" onclick="search();">Search</button></div>
			</div>
		</s:form>
	</body>
</html>