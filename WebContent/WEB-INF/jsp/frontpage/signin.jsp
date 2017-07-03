<%@ page language="java" isELIgnored="false" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="static/css/SignIn.css" rel="stylesheet"/>
  </head>
  
  <body>
  <form id="form1" name="form1" method="post" action="${pageContext.request.contextPath }/login.action">
<%--     <jsp:include page="head.jsp"></jsp:include> --%>
  	<div class="sign_in">
		<span>用户登录</span>
		<div class="sign_input">
			<div id="use_name">
				<img src="static/image/user.png" alt="用户名" /> <input type="text"
					id="username" name="username" placeholder="请输入用户名..." required/>
			</div>
			<div id="use_pass">
				<img src="static/image/lock.png" alt="密码" /> <input type="password"
					id="password" name="password" placeholder="请输入密码..." required/>
			</div>
		</div>
		<div class="tooltip hide">
			<p></p>
			<span></span>
		</div>
		<button class="btn" id="sum" name="sum">登录</button>
	</div>
	</form>
</body>
<script src="static/js/frontjs/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
// $(function(){
//     var tooltip=$('.tooltip');
//     // 登录验证
//     $("#sum").click(function(event){
//         // 做表单输入校验
//         var name = $("#name");
//         var password = $("#password");
//         var msg = "";
//         if ($.trim(name.val()) == ""){
//             msg = "请输入用户名";
//             name.focus();
//         }else if ($.trim(password.val()) == ""){
//             msg = "请输入密码";
//             password.focus();
//         }if (msg != ""){
//             tooltip.show();
//             $(document).one('click',function(){
//                 tooltip.hide();
//             });
//             event.stopImmediatePropagation();
//             tooltip.click(function (event) {
//                 event.stopImmediatePropagation();
//             });
//             $(".tooltip>p").html(msg);
//         }else{
//     		var loginname = $("#name").val();
//     		var password = $("#password").val();
// 			$.ajax({
// 				type: "POST",
<%-- 				url: '<%=basePath%>checkuser.action', --%>
// 				data: {
// 					username:loginname,
// 					password:password
// 				},
// 				dataType:'json',
// 				//beforeSend: validateData,
// 				cache: false,
// 				success: function(data){
// 					if(data.longinResult=="error") alert("用户名或密码错误！");
// 					if(data.longinResult=="success"){
// 						location.href="goindex.action";
// 					}
// 				}
// 			});
//         }
//     });
//     // 为document绑定onkeydown事件监听是否按了回车键
//     $(document).keydown(function(event){
//         if (event.keyCode === 13){ // 按了回车键
//             $(".btn").trigger("click");
//         }
//     });
// });

</script>
</html>
