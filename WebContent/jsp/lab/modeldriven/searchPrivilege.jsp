<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<script type="text/javascript">
			function search() {
				document.forms[0].action = '<s:url value="/jsp/model/searchPrivilege.action"/>';
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<h1 align="center">Model Driven</h1>
		<s:form>
			<br/>
			<div style="width: 800px; margin-left: auto; margin-right: auto;">
				<div style="width: 35%; float: left;">Customer Id:</div>
				<div style="width: 65%; float: left;"><s:textfield name="customerId" /></div>
				<div style="width: 35%; float: left;">&nbsp;</div>
				<div style="width: 65%; float: left;"><button type="button" onclick="search();">Get Privilege</button></div>
				
				
				<!-- FIXME -->
				<s:if test="%{listResult.size() > 0}">
					<div style="width: 100%;">
						<table>
							<thead>
								<tr>
									<th style="width: 75px;">No</th>
									<th style="width: 150px;">Code</th>
									<th style="width: 200px;">Name</th>
									<th style="width: 200px;">Detail</th>
									<th style="width: 200px;">Expire date</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="listResult" status="listResultStatus">
									<tr>
										<td><s:property value="#listResultStatus.index + 1"/></td>
										<td><s:property value="privilegeCode" /></td>
										<td><s:property value="privilegeName" /></td>
										<td><s:property value="privilegeDetail" /></td>
										<td><s:property value="expireDate" /></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</s:if>
				
			</div>
		</s:form>
	</body>
</html>