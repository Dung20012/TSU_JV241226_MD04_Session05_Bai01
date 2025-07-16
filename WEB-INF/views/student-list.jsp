
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách sinh viên</h2>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Tên</th>
    <th>Email</th>
    <th>Ngày sinh</th>
    <th>Điểm trung bình</th>
    <th>Hành động</th>
  </tr>
  <c:forEach var="s" items="${students}">
    <tr>
      <td>${s.id}</td>
      <td>${s.studentName}</td>
      <td>${s.email}</td>
      <td>${s.birthday}</td>
      <td>${s.avgMark}</td>
      <td>
        <a href="#">Sửa</a> | <a href="#">Xóa</a>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
