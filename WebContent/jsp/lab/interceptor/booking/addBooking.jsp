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
			function add() {
				document.forms[0].action = '<s:url value="/jsp/interceptor/addBooking.action"/>';
				document.forms[0].submit();
			}
			
			function cancel() {
				document.forms[0].action = '<s:url value="/jsp/interceptor/cancelAddBooking.action"/>';
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<s:form method="post">
			<div style="width: 400px; margin-left: auto; margin-right: auto;">
				<s:if test="hasActionMessages()">
					<div class="message">
				    	<s:actionmessage/>
					</div>
				</s:if>
				<div style="width: 35%; float: left;">Booking Name:</div>
				<div style="width: 65%; float: left;"><s:textfield name="data.bookingName" /></div>
				<div style="width: 35%; float: left;">&nbsp;</div>
				<div style="width: 65%; float: left;"><button type="button" onclick="add();">Add</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" onclick="cancel();">Cancel</button></div>
			</div>
			<s:hidden name="criteria.criteriaKey" />
			<s:token/>
		</s:form>
	</body>
</html>