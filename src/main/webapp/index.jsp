<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
</head>
<br>
<h2>Hello World!</h2>
<a href="testmvc">点击！！！</a></br>
<a href="testmvc/man/1/2">点击！！！</a>

<form action="insert" method="post" accept-charset="UTF-8">
    账号:<input type="text" name="uname"></br>
    密码:<input type="password" name="upass"></br>
    年龄:<input type="text" name="uage"></br>
    生日:<input type="text" name="date"></br>
    性别:<input type="radio" name="usex" value="男">男
    <input type="radio" name="usex" value="女">女</br>
    爱好:<input type="checkbox" name="uhobby" value="抽烟">抽烟
    <input type="checkbox" name="uhobby" value="喝酒">喝酒
    <input type="checkbox" name="uhobby" value="烫头">烫头
    </br>
    <input type="submit" value="保存">
</form>
</body>
</html>
