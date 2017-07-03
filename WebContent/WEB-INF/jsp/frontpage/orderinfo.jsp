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
    <title>订单信息</title>
    <link rel="stylesheet" href="static/css/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/kangyuan.css"/>
    <script src="static/js/frontjs/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="static/js/frontjs/kangyuan.js" type="text/javascript"></script>
    <script src="static/js/frontjs/layer/layer.js" type="text/javascript"></script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="content shop_line_pag">
    <div class="local">
        <a href="#">首页</a> \ <a href="#">订单详情</a><i class="fa fa-arrow-left"></i>
    </div>
    <div class="shop_line">
       <table width="601" border="0" align="center">
  <tr>
    <td width="119">&nbsp;</td>
    <td width="438">&nbsp;</td>
    <td width="147"><div align="right"></div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div align="center" style="color:#000000;font-size:25px"><strong>订单号：<span class="STYLE3">${myorder.id}</span></strong></div></td>
    <td>&nbsp;</td>
  </tr>

</table>
<br>
<table width="1000" border="0" align="center" cellspacing="1">
  <tr>
    <td colspan="4"><div align="left"><strong>收货人信息</strong></div></td>
  </tr>
   <tr>
     <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="80"  height="30" bgcolor="#EFEFFF"><div align="left">姓名：</div></td>
    <td width="350" bgcolor="#EFEFFF"><div align="left">${user.username}</div></td>
    <td width="80" bgcolor="#EFEFFF"><div align="left">邮编：</div></td>
    <td width="260" bgcolor="#EFEFFF"><div align="left">${user.postcode }</div></td>
  </tr>
  
  <tr>
    <td  height="30" bgcolor="#EFEFFF">地址：</td>
    <td bgcolor="#EFEFFF">${user.address }</td>
    <td bgcolor="#EFEFFF">邮箱：</td>
    <td bgcolor="#EFEFFF">${user.email}</td>
  </tr>
  <tr>
    <td colspan="4"><hr width="100%" size="1" color="#000000"></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<table width="1000" border="0" align="center">
  <tr>
    <td colspan="4"><div align="left"><strong>商品清单&nbsp;&nbsp;</strong></div></td>
  </tr>
   <tr>
     <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="200"  height="30" bgcolor="#EFEFFF"><div align="left">商品名称</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left">图片</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left">单价</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left">数量</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left">金额小计(￥)</div></td>
  </tr>

  <c:if test="${not empty goodsList}">
            <c:forEach items="${goodsList}" var="good" varStatus="vs">
 <tr>
   <input type="hidden" name="id" value="${good.id}" />
    <td height="30" bgcolor="#EFEFFF">${good.goodsname }</td>
     <td bgcolor="#FFF3E7">	<img src="/pic/${good.pic}" width=100 height=100/></td>
    <td bgcolor="#EFEFFF">${good.goodsprice }</td>
    <td bgcolor="#EFEFFF">${good.shoppingNum }</td>
    <td bgcolor="#EFEFFF">${good.goodsprice*good.shoppingNum }</td>
  </tr>
  </c:forEach>
  </c:if>
   
 
  <tr>
    <td>&nbsp;</td>
    <td colspan="3"><div align="right"><strong>订单总金额： </strong></div></td>
    <td>${totalPrice }</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="4"><hr width="100%" size="1" color="#000000"></td>
  </tr>
</table>
<form id="form1" name="form1" method="post" action="neworder">
<table width="1000" border="0" align="center">
  <tr>
    <td width="155"  height="30"><strong>下单时间：</strong></td>
    <td valign="middle">&nbsp;</td>
  </tr>
  <tr>&nbsp;</tr>
  <tr bgcolor="#EFEFFF">
    <td colspan="2"><div align="left"></div>
      <div align="left"></div><fmt:formatDate value="${myorder.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/><div align="left"></div></td>
    </tr>
  <tr>
    <td colspan="3">&nbsp;</td>
  </tr>
  <tr>
  </tr>
</table>
        <div class="clear"></div>
    </div>
</div>

<a href="javascript:;" class="top">回到顶部</a>  <!--href设置为此，为绝对的空连接，点击不返回任何数值，此例中如此设置来制作平滑上滚-->
</body>
</html>

