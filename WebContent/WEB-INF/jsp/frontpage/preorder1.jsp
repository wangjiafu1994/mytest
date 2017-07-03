<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
        <a href="#">首页</a> \ <a href="#">订单信息</a><i class="fa fa-arrow-left"></i>
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
    <td><div align="center" style="color:#000000;font-size:25px">订单信息</div></td>
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
    <td width="350" bgcolor="#EFEFFF"><div align="left">wjf</div></td>
    <td width="80" bgcolor="#EFEFFF"><div align="left">邮编：</div></td>
    <td width="260" bgcolor="#EFEFFF"><div align="left">33333</div></td>
  </tr>
  
  <tr>
    <td  height="30" bgcolor="#EFEFFF">地址：</td>
    <td bgcolor="#EFEFFF">宁大科院</td>
    <td bgcolor="#EFEFFF">电话：</td>
    <td bgcolor="#EFEFFF">111111</td>
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
    <td colspan="4"><div align="left"><strong>商品清单&nbsp;&nbsp;</strong><a href="showcart">返回购物车</a></div></td>
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

 <tr>
    <td height="30" bgcolor="#EFEFFF">陈奕迅</td>
     <td bgcolor="#FFF3E7">	<img src="${pageContext.request.contextPath}/images/g1.jpg" width=100 height=100/></td>
    <td bgcolor="#EFEFFF">100</td>
    <td bgcolor="#EFEFFF">2</td>
    <td bgcolor="#EFEFFF">200</td>
  </tr>
  <tr>
    <td height="30" bgcolor="#EFEFFF">张学友</td>
     <td bgcolor="#FFF3E7">	<img src="${pageContext.request.contextPath}/images/g2.jpg" width=100 height=100/></td>
    <td bgcolor="#EFEFFF">200</td>
    <td bgcolor="#EFEFFF">3</td>
    <td bgcolor="#EFEFFF">600</td>
  </tr>
   
 
  <tr>
    <td>&nbsp;</td>
    <td colspan="3"><div align="right"><strong>订单总金额： </strong></div></td>
    <td>800</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td colspan="3"><div align="right"><strong>获得积分： </strong></div></td>
    <td>160</td>
  </tr>
  <tr>
    <td colspan="4"><hr width="100%" size="1" color="#000000"></td>
  </tr>
</table>
<form id="form1" name="form1" method="post" action="neworder">
<table width="601" border="0" align="center">
  
  <tr>
    <td colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3"><div align="center">
      <input name="Submit" type="submit" class="button" value="确认并提交"/>
    </div></td>
  </tr>
</table>
        <div class="clear"></div>
    </div>
</div>

<a href="javascript:;" class="top">回到顶部</a>  <!--href设置为此，为绝对的空连接，点击不返回任何数值，此例中如此设置来制作平滑上滚-->
</body>
</html>

