<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="bbsVO" method="post" action="/doWriteAction">
	<table align="center" width="300px">
		<tr>
			<th colspan="2">
				<h4>Write BBS Page</h4>
			</th>
		</tr>
		<tr>
			<td>제목</td>
			<td>
				<input type="text" id="subject" name="subject" placeholder="제목" />
				<form:errors path="subject" />
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
				<input type="text" id="description" name="description" placeholder="내용" />
				<form:errors path="description" />
			</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" id="writer" name=""writer"" placeholder="작성자" /></td>
		</tr>
		<tr align="center">
			<td colspan="2"
				><br/><input type="submit" value="Write !" />
			</td>
		</tr>
	</table>	
	</form:form>

</body>
</html>