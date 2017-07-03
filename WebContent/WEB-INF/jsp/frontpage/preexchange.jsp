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
    <title>专辑卖场</title>
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
        <a href="goindex.action">首页</a> \ <a href="#">兑换信息</a><i class="fa fa-arrow-left"></i>
    </div>
    <div class="river_box">
    <form id="form1" name="form1" method="post" action="outintegral.action">
      <table width="601" border="0" align="center">
  <tr>
    <td width="119">&nbsp;</td>
    <td width="438">&nbsp;</td>
    <td width="147"><div align="right"></div></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><div align="center" style="color:#000000;font-size:25px">兑换信息</div></td>
    <td>&nbsp;</td>
  </tr>
</table>
<br>
<table width="1000" border="0" align="center" cellspacing="1">
  <tr>
    <td colspan="4"><div align="left"><strong>兑换人信息</strong></div></td>
  </tr>
   <tr>
     <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="80"  height="30" bgcolor="#EFEFFF"><div align="left">用户名</div></td>
    <td width="350" bgcolor="#EFEFFF"><div align="left">${user.username} </div></td>
    <td width="80" bgcolor="#EFEFFF"><div align="left">邮编：</div></td>
    <td width="260" bgcolor="#EFEFFF"><div align="left">${user.postcode}</div></td>
  </tr>
  
  <tr>
    <td  height="30" bgcolor="#EFEFFF">地址：</td>
    <td bgcolor="#EFEFFF">${user.address}</td>
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
    <td colspan="4"><div align="left"><strong>兑换商品&nbsp;&nbsp;</strong></div></td>
  </tr>
   <tr>
     <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="200"  height="30" bgcolor="#EFEFFF"><div align="left" >商品名称</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left">图片</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left">价格</div></td>
    <td width="200" bgcolor="#EFEFFF"><div align="left"><strong>所需积分 </strong></div></td>
  </tr>
 
 <tr>
   <input type="hidden" name="id" value="${goodsCustom.id}" />
    <td height="30" bgcolor="#EFEFFF" >${goodsCustom.goodsname } /></td>
     <td bgcolor="#FFF3E7" name="pic">	<img src="/pic/${goodsCustom.pic}" width=100 height=100/></td>
    <td bgcolor="#EFEFFF" ><input type="text" readOnly="readonly" name="goodsprice" value="${goodsCustom.goodsprice }" /></td>
   <td ><input type="text" readOnly="readonly" name="integral" value="${goodsCustom.integral }" /></td>
  </tr>
  
  
  
    <td colspan="4"><hr width="100%" size="1" color="#000000"></td>
  </tr>
</table>

<table width="601" border="0" align="center">
  
  <tr>
    <td colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3"><div align="center">
      <input name="Submit" type="submit" class="button" value="确认并兑换"/>
    </div></td>
  </tr>
</table>
</form>

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

