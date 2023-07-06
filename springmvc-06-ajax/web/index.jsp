<%--
  Created by IntelliJ IDEA.
  User: ly153
  Date: 2023/7/5
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/code.jquery.com_jquery-3.7.0.js"></script>

    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data,status){
            console.log("data="+data);
            console.log("status="+status);
          }
        })
      }
    </script>
  </head>
  <body>

  <%--失去焦点的时候，发起一个请求到后台--%>
  用户名：<input type="text" id="username" onblur="a()">


  </body>
</html>
