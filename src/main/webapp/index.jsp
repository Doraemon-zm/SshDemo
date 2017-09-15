<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
<form action="${pageContext.request.contextPath}/userAction_show.action" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td><input type="submit" value="点击提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
