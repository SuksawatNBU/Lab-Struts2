<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css" integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">
		<style type="text/css">
			.label{
				padding-right: 5px; 
				text-align: right;
			}
			
			TABLE.RESULT_CONTENT TR.LINE_ODD {
				background-color: #f0efea;
			}
			
			TABLE.RESULT_CONTENT TR.LINE_EVEN {
				background-color: #F9F9F7;
			}
			TABLE.RESULT_CONTENT TH {
				text-align: center;
			}
		</style>
		<script type="text/javascript">
			function search() {
				document.forms[0].action = '<s:url value="/jsp/strutstag/searchCourse.action"/>';
				document.forms[0].submit();
			}

			function view(id) {
				document.getElementsByName("course.courseId")[0].value = id;
				document.forms[0].action = '<s:url value="/jsp/strutstag/viewCourse.action"/>';
				document.forms[0].submit();
			}
			
			function edit(id) {
				document.getElementsByName("course.courseId")[0].value = id;
				document.forms[0].action = '<s:url value="/jsp/strutstag/editCourse.action"/>';
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<h1 align="center">SIT Course...</h1>
		<s:form method="post">
			<br/>
			<div style="width: 800px; margin-left: auto; margin-right: auto;">
				<div style="width:100%; text-align: right;"><a href="#" class="badge badge-warning">+</a></div>
				<table id="display">
					<tr>
						<td width="20%" align="right"><label for="listCategory">Category  &nbsp;</label></td>
						<td width="30%"><s:select id="listCategory" class="form-control" listKey="code" listValue="desc" list="listCategory" name="criteria.categoryId" headerKey="0" headerValue="All" /></td>
						
						<td width="20%" align="right"><label for="courseName">Course Name  &nbsp;</label></td>
						<td width="30%"><s:textfield id="courseName" class="form-control" name="criteria.courseName" /></td>
					</tr>
					<tr>
						<td align="right"><label for="listLecturer">Lecturer &nbsp;</label></td>
						<td><s:select id="listLecturer" class="form-control" listKey="code" listValue="desc" list="listLecturer" name="criteria.lecturerId" headerKey="0" headerValue="All" /></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<td>
							<button type="button" class="btn btn-info" onclick="search()">Search</button>
							<button type="button" class="btn btn-info" onclick="">Clear</button>
						</td>
					</tr>
				</table>
				<br/>
				
				<!-- FIXME -->
				<s:if test="%{listResult.size() > 0}">
					<div style="width: 100%;">
						<table class="table table-striped">
							<thead>
								<tr align="center">
									<th style="width: 75px;">No</th>
									<th style="width: 100px;">Edit</th>
									<th style="width: 100px;">View</th>
									<th style="width: 150px;">Category</th>
									<th style="width: 200px;">Course</th>
									<th style="width: 200px;">Detail</th>
									<th style="width: 200px;">Lecturer</th>
									<th style="width: 200px;">Price</th>
									<th style="width: 200px;">Status</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="listResult" status="listResultStatus" var="result">
									<tr align="center">
										<td><s:property value="#listResultStatus.index + 1"/></td>
										<td><button type="button" class="btn btn-link" onclick="edit(<s:property value='courseId'/>)">Edit</button></td>
										<td><button type="button" class="btn btn-link" onclick="view(<s:property value='courseId'/>)">View</button></td>
										<td align="center">
											<s:if test='%{categoryId.equals("1")}'>
												<i class="fab fa-angular"></i>
											</s:if>
											<s:elseif test='%{categoryId eq "2"}'>
												<i class="fab fa-android"></i>
											</s:elseif >
										</td>
										<td><s:property value="courseName" /></td>
										<td><s:property value="courseDetail" /></td>
										<td align="left"><s:property value="lecturer" /></td>
										<td align="left"><s:property value="price" /></td>
										<td align="center">
											<s:if test='%{active eq "Y"}'>
												<i class="fas fa-comment"></i>
											</s:if>
											<s:elseif test='%{active eq "N"}'>
												<i class="fas fa-comment-slash"></i>
											</s:elseif >
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</s:if>
				
			</div>
			<s:hidden name="course.courseId" />
		</s:form>
	</body>
</html>