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
				document.getElementsByName('criteria.criteriaKey')[0].value = '';
				document.forms[0].action = '<s:url value="/jsp/interceptor/searchBooking.action"/>';
				document.forms[0].submit();
			}
			
			function gotoAdd() {
				document.forms[0].action = '<s:url value="/jsp/interceptor/gotoAddBooking.action"/>';
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
				<div style="width: 35%; float: left;">Booking Name:</div>
				<div style="width: 65%; float: left;"><s:textfield name="criteria.data.bookingName" /></div>
				<div style="width: 35%; float: left;">&nbsp;</div>
				<div style="width: 65%; float: left;"><button type="button" onclick="gotoAdd();">Goto add</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button type="button" onclick="search();">Search</button></div>
				<s:if test="%{listResult.size() > 0}">
					<div style="width: 100%;">
						<table>
							<thead>
								<tr>
									<th style="width: 75px;">No</th>
									<th style="width: 200px;">Booking Name</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="listResult" status="listResultStatus">
									<tr>
										<td><s:property value="#listResultStatus.index + 1"/></td>
										<td><s:property value="bookingName" /></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</s:if>
			</div>
			<s:hidden name="criteria.criteriaKey" />
		</s:form>
	</body>
</html>