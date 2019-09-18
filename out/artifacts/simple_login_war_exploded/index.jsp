<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 9/18/2019
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login{
    height: 180px;width: 500px;
    margin: 1px;
    padding: 10px;
    border: 1px #CCCCCC solid;
  }
  .login input{
    padding: 5px;
    margin: 5px;
  }
</style>
  <head>
    <title>lala</title>
  </head>
  <body>
  <form method="get" action="/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username" size="30" placeholder="username">
      <input type="password" name="password" size="30" placeholder="password">
      <input type="submit" value="Sign in">

    </div>
  </form>
  </body>
</html>
