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
			function gotoAdd() {
				document.forms[0].action = '<s:url value="/jsp/interceptor/gotoAddBooking.action"/>';
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<s:form>
			<div style="width: 400px; margin-left: auto; margin-right: auto;">
				<s:if test="hasActionErrors()">
					<div class="message">
						<s:actionerror/>
					</div>
				</s:if>
				<div style="width: 35%; float: left;">&nbsp;</div>
				<div style="width: 65%; float: left;"><button type="button" onclick="gotoAdd();">Back to add page</button></div>
			</div>
			<s:hidden name="criteria.criteriaKey" />
		</s:form>
	</body>
</html>