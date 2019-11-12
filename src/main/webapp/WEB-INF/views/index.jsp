<%--
  Created by IntelliJ IDEA.
  User: An Viet Hung
  Date: 11/12/2019
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/result" method="post">
    <table>
        <tr>
            <td>
                <input type="text" name="operand1">
                <input type="text" name="operand2">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" name="operator" value="+">
                <input type="submit" name="operator" value="-">
                <input type="submit" name="operator" value="x">
                <input type="submit" name="operator" value="/">
            </td>
        </tr>
    </table>
</form>
<p>Result: ${result }</p>
</body>
</html>
