<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<style type="text/css">
			.label{
				padding-right: 5px; 
				text-align: right;
			}
		</style>
		<script type="text/javascript">
			function search() {
				document.forms[0].action = '<s:url value="/jsp/strutstag/searchCourse.action"/>';
				document.forms[0].submit();
			}
			
			function save(){
				alert("saved");
			}
		</script>
	</head>
	<body>
		<h1 align="center">SIT Course...</h1>
		<s:form>
			<br/>
			<div style="width: 800px; margin-left: auto; margin-right: auto;">
				<div style="width:100%; text-align: right;"><a href="#" class="badge badge-warning">+</a></div>
				<table id="display">
					<tr>
						<td width="20%" align="right"><label for="listCategory">Category &nbsp;</label></td>
						<td width="30%"><s:select id="listCategory" class="form-control" listKey="code" listValue="desc" list="listCategory" name="course.categoryId" headerKey="0" headerValue="All" /></td>
						
						<td width="20%" align="right"><label for="listLecturer">Lecturer &nbsp;</label></td>
						<td width="30%"><s:select id="listLecturer" class="form-control" listKey="code" listValue="desc" list="listLecturer" name="course.lecturerId" headerKey="0" headerValue="All" /></td>
					</tr>
					<tr>
						<td align="right"><label for="courseName">Course Name &nbsp;</label></td>
						<td><s:textfield id="courseName" class="form-control" name="course.courseName" /></td>
						<td align="right"><label for="courseDetail">Course Detail &nbsp;</label></td>
						<td><s:textarea id="courseDetail" class="form-control" name="course.courseDetail"/> </td>
					</tr>
					<tr>
						<td align="right"><label for="price">Price &nbsp;</label></td>
						<td><s:textfield id="price" class="form-control" name="course.price" /></td>
						<td></td>
						<td><s:checkbox id="active" class="checkbox" name="course.active" fieldValue="Y" /><label for="active"> &nbsp; active</label></td>
					</tr>
					<tr>
						<td align="right"><label for="curriculum">Curriculum &nbsp;</label></td>
						<td><s:iterator id="curriculum" value="course.listCurriculum" /></td>
						
						<td></td>
						<td></td>
					</tr>
				</table>
			</div>
		</s:form>
	</body>
</html>