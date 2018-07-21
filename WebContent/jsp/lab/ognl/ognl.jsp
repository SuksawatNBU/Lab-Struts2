<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>No.</th>
					<th>Value Stack</th>
					<th>Object</th>
					<th>Value</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1.</td>
					<td>Object Stack</td>
					<td>user.email [PreAction]</td>
					<td><s:property value = "[1].user.email" /></td>
				</tr>
				<tr>
					<td>2.</td>
					<td></td>
					<td>user.email [PostAction]</td>
					<td><s:property value = "user.email" /></td>
				</tr>
				<tr>
					<td>3.</td>
					<td></td>
					<td>mapAirport [PreAction]</td>
					<td>
						<s:iterator value="mapAirport">
							<option value='<s:property value="key" />'> <s:property value="key" /> : <s:property value="value"/></option>
						</s:iterator>
					</td>
				</tr>
				<tr>
					<td>4.</td>
					<td>Context Map</td>
					<td>param1 [Parameter]</td>
					<td><s:property value = "#parameters.param1" /></td>
				</tr>
				<tr>
					<td>5.</td>
					<td></td>
					<td>param2 [Parameter]</td>
					<td><s:property value = "#parameters.param2" /></td>
				</tr>
				<tr>
					<td>6.</td>
					<td></td>
					<td>applicationName [Application]</td>
					<td><s:property value="#application.applicationName" /></td>
				</tr>
				<tr>
					<td>7.</td>
					<td></td>
					<td>reqObj [Request]</td>
					<td><s:property value="#request.reqObj.requestDate" /></td>
				</tr>
				<tr>
					<td>8.</td>
					<td></td>
					<td>sessionName [Session]</td>
					<td><s:property value="#session.sessionName" /></td>
				</tr>
				<tr>
					<td>9.</td>
					<td></td>
					<td>applicationName [Attr]</td>
					<td><s:property value="#attr.applicationName" /></td>
				</tr>
				<tr>
					<td>10.</td>
					<td>Static</td>
					<td>method PostOGNLAction > getHostName()</td>
					<td><s:property value="hostName" /></td>
				</tr>
				<tr>
					<td>11.</td>
					<td></td>
					<td>field PreOGNLAction > staticField</td>
					<td><s:property value="@com.cct.labstruts2.web.ognl.action.PreOGNLAction@staticField" /></td>
				</tr>
			</tbody>
		</table>
	</div>
	<s:debug />
</body>
</html>