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
function deleteGoods(){
	//提交form
	document.goodsForm.action="${pageContext.request.contextPath }/deletegoods.action";
	document.goodsForm.submit();
}
function queryGoods(){
	//提交form
	document.goodsForm.action="${pageContext.request.contextPath }/querygoods.action";
	document.goodsForm.submit();
}
</script>
</head>
<body> 
当前用户：${username }，
<c:if test="${username!=null }">
 <a href="${pageContext.request.contextPath }/logout.action">退出</a>
</c:if>
<form name="goodsForm" action="${pageContext.request.contextPath }/querygoods.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td>
商品名称：<input name="goodsCustom.goodsname" />
商品类型：
<select name="goodstypes">
	<c:forEach items="${goodstypes }" var="goodstypes">
		<option value="${goodstypes.key }">${goodstypes.value }</option>		
	</c:forEach>
</select>

</td>
<td><input type="button" value="查询" onclick="queryGoods()"/>
<input type="button" value="批量删除" onclick="deleteGoods()"/>
</td>
</tr>
</table>
商品列表：
<table width="100%" border=1>
<tr>
	<td>选择</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>商品图片</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${goodsList }" var="good">
<tr>	
	<td><input type="checkbox" name="goods_id" value="${good.id}"/></td>
	<td>${good.goodsname }</td>
	<td>${good.goodsprice }</td>
	<td>
		<c:if test="${good.pic !=null}">
			<img src="/pic/${good.pic}" width=100 height=100/>
			<br/>
		</c:if>
	</td>

	<td><fmt:formatDate value="${good.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${good.goodsintro }</td>
	
	<td><a href="${pageContext.request.contextPath }/editgoods.action?id=${good.id}">修改</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>

</html>