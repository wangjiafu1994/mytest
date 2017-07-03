<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <title>详情</title>
    <link rel="stylesheet" href="static/css/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/kangyuan.css"/>
    <script src="static/js/frontjs/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="static/js/frontjs/kangyuan.js" type="text/javascript"></script>

<style type="text/css"> 
body{ font-size:12px; line-height:24px;} 
.exp1{font-size:12px;} 
.exp2{font-size:xx-small;} 
.exp3{font-size:small;} 
.exp4{font-size:x-large;} 
.exp5{font-size:larger;} 
.exp6{font-size:smaller;} 
.exp7{font-size:50%;} 
.exp8{font-size:150%;} 
</style> 
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="contents">
    <div class="local">
        <a href="goindex.action">首页</a> \ <a href="introduction.action">店铺简介</a><i class="fa fa-arrow-left"></i>
    </div>
    <div class="text_box">
        <div class="text_header">
            <h2>${pd.TITLE } </h2>
           
            <div class="informal" style="color:#000000;font-size:30px">
            专辑卖场
              </div>

        <div class="text_img">
            <img src="${pageContext.request.contextPath}/image/2.jpg">
        </div>
        <div class="text_content" style="color:#8A2BE2;font-size:20px">
            ${pd.DESCRIBES}
            欢迎光临本店，您的支持是我们最大的前进动力，本店所有产品均低价销售，并且保证质量，需要的亲请放心购买，我们一定会给您一个最舒心的购物体验！

  本店所有的专辑制作优良。

        </div>
    </div>
</div>
<a href="javascript:;" class="top">回到顶部</a>  <!--href设置为此，为绝对的空连接，点击不返回任何数值，此例中如此设置来制作平滑上滚-->

</body>
</html>

