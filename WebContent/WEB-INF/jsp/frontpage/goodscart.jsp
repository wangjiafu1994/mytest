<%@ page language="java" isELIgnored="false" import="java.util.*" pageEncoding="utf-8"%>
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
    <title>商品浏览</title>
    <link rel="stylesheet" href="static/css/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/css/kangyuan.css"/>
    <script src="static/js/frontjs/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="static/js/frontjs/kangyuan.js" type="text/javascript"></script>
    <script src="static/js/frontjs/layer/layer.js" type="text/javascript"></script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="content live_pag">
    <div class="local">
        <a href="goindex.action">首页</a> \ <a href="#">商品浏览</a><i class="fa fa-arrow-left"></i>
    </div>
    <div class="river_box">
      <table width="1000" border="0" align="center">
  <tr>
    <td colspan="5"><div align="center"><hr width="100%" size="1" color="#E6E6FA"></div></td>
  </tr>
  <tr bgcolor="#E6E6FA">
    <td width="70" height="25"><div align="center">商品名称</div></td>
     <td width="70" height="25"><div align="center">商品图片</div></td>
    <td width="79"><div align="center">单价</div></td>
    <td width="45"><div align="center">数量</div></td>
    <td width="80"><div align="center">金额小计(￥)</div></td>
    <td width="52"><div align="center">&nbsp;</div></td>
     
  </tr>
        <c:if test="${not empty goodsList}">
            <c:forEach items="${goodsList}" var="good" varStatus="vs">         
 <tr>
    <input type="hidden" name="id" value="${good.id}" />

    <td height="25" bgcolor="#FFF3E7"><div align="center">${good.goodsname }</div></td>
    <td bgcolor="#FFF3E7"><div align="center">	<img src="/pic/${good.pic}" width=100 height=100/></div></td>
  <td bgcolor="#FFF3E7"><div align="center">${good.goodsprice }</div></td>
    <td bgcolor="#FFF3E7"><div align="center">
      <input name="amount" type="text" id="amount" value="${good.shoppingNum }" size="4" />
    </div></td>
   
    <td bgcolor="#FFF3E7"><div align="center">${good.goodsprice*good.shoppingNum }</div></td>
     <td bgcolor="#FFF3E7"><div align="center"><a href="delgoods.action?id=${good.id} " ><img src="${pageContext.request.contextPath}/image/del.gif" width="36" height="16" /></a></div></td>
  </tr>
  </c:forEach>
   </c:if>
   
<!--   <tr> -->
 
<%--     <td colspan="5"><div align="center"> <input name="imageField" type="image" src="${pageContext.request.contextPath}/image/update.gif" border="0" />&nbsp;&nbsp;<a href="cart?type=clear"><img src="${pageContext.request.contextPath}/image/remove.gif" width="69" height="16" /></a></div></td> --%>
   
<!--     </tr> -->
     <tr>
      <td>总金额：${totalPrice }</td>
  </tr>
  <tr>
    <td colspan="5"><div align="center"><hr width="100%" size="1" color="#FE6702"></div></td>
    
    </tr>
  <tr>
    <td colspan="5">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="5"><div align="center"><a href="goodslist.action"><img src="${pageContext.request.contextPath}/image/continue.gif" width="147" height="33" border="0" /></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="preorder.action"><img src="${pageContext.request.contextPath}/image/checkout.gif" width="147" height="33" border="0" /></a></div></td>
  </tr>
 
</table>

        <div class="clear"></div>
    </div>
</div>
<script>
    function addNum(GOODS_ID) {
       var n = $("#num"+GOODS_ID).val();
       var newN = parseInt(n)+1;
        $("#num"+GOODS_ID).val(newN);
    }
    function subNum(GOODS_ID) {
       var n = $("#num"+GOODS_ID).val();
       var newN = parseInt(n)-1;
        $("#num"+GOODS_ID).val(newN);
    }
</script>
<a href="javascript:;" class="top">回到顶部</a>  <!--href设置为此，为绝对的空连接，点击不返回任何数值，此例中如此设置来制作平滑上滚-->
</body>
</html>

