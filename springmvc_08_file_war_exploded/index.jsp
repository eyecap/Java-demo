<%--
  Created by IntelliJ IDEA.
  User: ly153
  Date: 2023/7/5
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="submit" value="upload">
  </form>

  <a href="${pageContext.request.contextPath}/statics/1.png">下载图片</a>

  </body>
</html>
