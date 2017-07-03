<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
<script type="text/javascript">
function editgoodsallsubmit(){
	//提交form
	document.goodsForm.action="${pageContext.request.contextPath }/editgoodsallsubmit.action";
	document.goodsForm.submit();
}
function querygoods(){
	//提交form
	document.goodsForm.action="${pageContext.request.contextPath }/querygoods.action";
	document.goodsForm.submit();
}
</script>
</head>
<body> 
<form name="goodsForm" action="${pageContext.request.contextPath }/querygoods.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td>
商品名称：<input name="goodsCustom.name" />
</td>
<td><input type="button" value="查询" onclick="querygoods()"/>
<input type="button" value="批量修改提交" onclick="editgoodsallsubmit()"/>
</td>
</tr>
</table>
商品列表：
<table width="100%" border=1>
<tr>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${goodsList }" var="good" varStatus="status">
<tr>	

	<td><input name="goodsList[${status.index }].goodsname" value="${good.goodsname }"/></td>
	<td><input name="goodsList[${status.index }].goodsprice" value="${good.goodsprice }"/></td>
	<td><input name="goodsList[${status.index }].createtime" value="<fmt:formatDate value="${good.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
	<td><input name="goodsList[${status.index }].goodsintro" value="${good.goodsintro }"/></td>


</tr>
</c:forEach>

</table>
</form>
</body>

</html>