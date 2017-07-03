<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" href="static/css/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/kangyuan.css"/>
    <link rel="stylesheet" href="static/css/calendar.css">
    <link rel="stylesheet" href="static/css/lunbo.css">
    <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
    <script src="static/js/frontjs/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="static/js/frontjs/kangyuan.js" type="text/javascript"></script>
    <script src="static/js/frontjs/layer/layer.js" type="text/javascript"></script>
    <script src="static/js/frontjs/lunbo.js" type="text/javascript"></script>

    <style type="text/css">
    	/*.text_long{
    		width:300px;
    	}
    	#noticesList{
    		margin-top:6px;
    	}
    	#dynamicsList{
    		margin-top:3px;
    	}*/
    </style>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="banner">
    
          <ul class="img">
          
                   <li><a href="goodslist.action"><img src="${pageContext.request.contextPath}/image/1.jpg"></a></li>
                   <li><a href="goodslist.action"><img src="${pageContext.request.contextPath}/image/2.jpg"></a></li> 
                   <li><a href="goodslist.action"><img src="${pageContext.request.contextPath}/image/3.jpg"></a></li> 
          
          </ul>
      
    <ul class="num">

    </ul>

    <div class="btn btn_left">&lt;</div>
    <div class="btn btn_right">&gt;</div>
    <div class="menuContent">
        <div class="item">
            <a href="introduction.action">店铺简介<span>&#62;</span></a>
        </div>
        <div class="item">
            <a href="goodslist.action">商品专区<span>&#62;</span></a>
        </div>
        <div class="item">
            <a href="integralgoods.action">积分活动<span>&#62;</span></a>
        </div>
        <div class="item">
            <a href="goconnect.action">联系方式<span>&#62;</span></a>
        </div>
    </div>
</div>
<div class="content">
        <a href="showcart.action">
            <div class="cont_box">
                <p><i class="fa fa-shopping-cart"></i>购物车</p>
            </div>
        </a>
<!--         <div class="cont_box" onclick="not_open();"> -->
<!--             <p><i class="fa fa-share-alt-square"></i>资源共享</p> -->
<!--         </div> -->
<!--         <div class="cont_box" onclick="not_open();"> -->
<!--             <p><i class="fa fa-street-view"></i>广商论坛</p> -->
<!--         </div> -->
        <a href="orderlist.action">
            <div class="cont_box" href="app_index/goConnectUs">
                <p><i class="fa fa-send"></i>订单列表</p>
            </div>
        </a>
    <div class="clear"></div>
</div>
<a href="javascript:;" class="top">回到顶部</a>  <!--href设置为此，为绝对的空连接，点击不返回任何数值，此例中如此设置来制作平滑上滚-->
</body>
</html>

