<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>积分明细</title>
    <link rel="stylesheet" href="static/css/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/kangyuan.css"/>
    <script src="static/js/frontjs/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="static/js/frontjs/kangyuan.js" type="text/javascript"></script>
    <script src="static/js/frontjs/layer/layer.js" type="text/javascript"></script>
</head>
<body >
<jsp:include page="head.jsp"></jsp:include>
<div class="content shop_line_pag"  >
    <div class="local">
        <a href="#">首页</a> \ <a href="#">积分明细</a><i class="fa fa-arrow-left"></i>
    </div>
    <div class="shop_line" >
     <c:if test="${not empty integraldetail }">
            <c:forEach items="${integraldetail}" var="var" varStatus="vs">
     <div class="shop_line_box" >
      <input type="hidden" name="id" value="${var.orderid}" />
              <h2>编号：<span>${var.id} </span></h2>
             <p>积分值：<span>${var.integral}</span></p>
             <p>类型：<span>${var.type}</span></p>
             <p>时间：<span><fmt:formatDate value="${var.time}" pattern="yyyy-MM-dd HH:mm:ss"/></span></p>
               <a href="orderlistinfo.action?orderid=${var.orderid}&type=${var.type}"><p>查看详情</p></a>
        </div>
  </c:forEach>
  </c:if>
    </div>
</div>
<a href="javascript:;" class="top">回到顶部</a>  <!--href设置为此，为绝对的空连接，点击不返回任何数值，此例中如此设置来制作平滑上滚-->
</body>
</html>

