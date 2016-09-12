<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<body>
	<form name='loginForm' id="loginForm" action="account/doLogin" method='POST' onsubmit="return check(this);">
		<div class="input-a">
			<div class="form-group login-a">
				<span class="input-bg-1"></span> <input name='accountName'
					id="accountName" type="text" onclick="hiddenMsg();"
					placeholder="请输入登录账号">
			</div>
			<div class="form-group login-b">
				<span class="input-bg-2"></span> <input name='accountPwd'
					id="accountPwd" type="password" onclick="hiddenMsg();"
					placeholder="请输入登录密码">
			</div>
		</div>
		<button type="submit" name="submit" value="立即登录" id="dl">立即登录</button>
	</form>
</body>
</html>
