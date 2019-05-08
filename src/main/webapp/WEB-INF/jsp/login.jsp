<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>登陆-后台管理</title>
<link rel="stylesheet" href="${ctx }/static/layui/css/layui.css">
<link rel="stylesheet" href="${ctx }/static/css/admin.css">
<link rel="stylesheet" href="${ctx }/static/css/login.css">
<script src="${ctx }/static/js/jquery-3.3.1.min.js"></script>
<script src="${ctx }/static/js/md5.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#loginForm").submit(function() {
			debugger;
			//获取用户名、密码
			var userName = $("#LAY-user-login-username").val();
			var password = $("#LAY-user-login-password").val();
			//判断
			if (!/[a-zA-Z0-9]{5,20}/.test(userName)) {
				$("#errorMsg").html("请输入5-20位由英文字母大小写、数字组成的用户名");
				return false;
			}
			if (!/[\w]{6,20}/.test(password)) {
				$("#errorMsg").html("请输入6-20位由英文字母大小写、数字组成的密码");
				return false;
			}
			//md5加密
			$("#LAY-user-login-password").val(md5(md5(password) + userName));

			return true;
		});
	});
</script>
</head>

<body>

	<div class="layadmin-user-login layadmin-user-display-show"
		id="LAY-user-login" style="display: none;">

		<div class="layadmin-user-login-main">
			<div class="layadmin-user-login-box layadmin-user-login-header">
				<h2>后台管理</h2>
				<p>欢迎您的使用！</p>
			</div>

			<form id="loginForm" action="${ctx }/doLogin" method="post"
				class="layadmin-user-login-box layadmin-user-login-body layui-form">
				<div class="layui-form-item">
					<label
						class="layadmin-user-login-icon layui-icon layui-icon-username"
						for="LAY-user-login-username"></label> <input type="text"
						name="userName" id="LAY-user-login-username" lay-verify="required"
						placeholder="用户名" class="layui-input">
				</div>
				<div class="layui-form-item">
					<label
						class="layadmin-user-login-icon layui-icon layui-icon-password"
						for="LAY-user-login-password"></label> <input type="password"
						name="password" id="LAY-user-login-password" lay-verify="required"
						placeholder="密码" class="layui-input">
				</div>
				<div class="layui-form-item">
					<div class="layui-row">
						<div class="layui-col-xs7">
							<label
								class="layadmin-user-login-icon layui-icon layui-icon-vercode"
								for="LAY-user-login-vercode"></label> <input type="text"
								name="vercode" id="LAY-user-login-vercode" lay-verify="required"
								placeholder="图形验证码" class="layui-input">
						</div>
						<div class="layui-col-xs5">
							<div style="margin-left: 10px;">
								<img src="https://www.oschina.net/action/user/captcha"
									class="layadmin-user-login-codeimg" id="LAY-user-get-vercode">
							</div>
						</div>
					</div>
				</div>
				<div class="layui-form-item" style="margin-bottom: 20px;">
					<input type="checkbox" name="remember" lay-skin="primary"
						title="记住密码"> <a href="forget.html"
						class="layadmin-user-jump-change layadmin-link"
						style="margin-top: 7px;">忘记密码？</a>
				</div>
				<div class="layui-form-item" style="color: #FF4040" id="errorMsg">
					${errorMsg}</div>
				<div class="layui-form-item">
					<input type="submit" class="layui-btn layui-btn-fluid" lay-submit
						lay-filter="LAY-user-login-submit" value="登 入">
				</div>
				<div class="layui-trans layui-form-item layadmin-user-login-other">
					<label>社交账号登入</label> <a href="javascript:;"><i
						class="layui-icon layui-icon-login-qq"></i></a> <a href="javascript:;"><i
						class="layui-icon layui-icon-login-wechat"></i></a> <a
						href="javascript:;"><i
						class="layui-icon layui-icon-login-weibo"></i></a> <a href="reg.html"
						class="layadmin-user-jump-change layadmin-link">注册帐号</a>
				</div>
			</form>
		</div>

		<div class="layui-trans layadmin-user-login-footer">

			<p>
				© 2018 <a href="http://www.xxx.com/" target="_blank">xxx.com</a>
			</p>
		</div>

	</div>

	<script src="${ctx}/static/layui/layui.js"></script>
	<script>
		layui
				.config({
					base : '../../layuiadmin/' //静态资源所在路径
				})
				.extend({
					index : 'lib/index' //主入口模块
				})
				.use(
						[ 'index', 'user' ],
						function() {
							var $ = layui.$, setter = layui.setter, admin = layui.admin, form = layui.form, router = layui
									.router(), search = router.search;

							form.render();

							//提交
							form.on('submit(LAY-user-login-submit)', function(
									obj) {

								//请求登入接口
								admin.req({
									url : layui.setter.base
											+ 'json/user/login.js' //实际使用请改成服务端真实接口
									,
									data : obj.field,
									done : function(res) {

										//请求成功后，写入 access_token
										layui.data(setter.tableName, {
											key : setter.request.tokenName,
											value : res.data.access_token
										});

										//登入成功的提示与跳转
										layer.msg('登入成功', {
											offset : '15px',
											icon : 1,
											time : 1000
										}, function() {
											location.href = '../'; //后台主页
										});
									}
								});

							});

							//实际使用时记得删除该代码
							layer.msg('为了方便演示，用户名密码可随意输入', {
								offset : '15px',
								icon : 1
							});

						});
	</script>
</body>


</html>