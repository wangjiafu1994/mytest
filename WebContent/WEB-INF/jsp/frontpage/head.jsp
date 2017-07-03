<%@ page language="java" isELIgnored="false" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="head">
    <div class="headbg"></div>
    <div class="nav">
        <a href="goindex.action" class="head_ba">专辑卖场</a>
        <ul>
            <li class="select"><a href="backsigninpage.action">后台登录</a></li>
            <li class="select"><a href="registerpage.action">注册</a></li>
<!--             <li class="letter_le"><a href="goatlist.action">活动</a></li> -->
<!--             <li class="letter_le"><a href="goshopline.action">订单</a></li> -->
<!--             <li><a href="goConnectUs.action">联系我们</a></li> -->

                 
            <c:choose>
                <c:when test="${empty user.username}">
                    <li class="select" ><a href="signin.action">登录</a><i class="fa fa-map-signs"></i></li>
                </c:when>
                <c:otherwise>
                    <a href="getuser.action"><li>当前用户：${user.username}</li></a>
                     <a href="integraldetail.action"><li>积分：${user.totalintegral }</li></a>
                    <li class="select" ><a href="signout.action">退出</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
    <script>

      
    </script>
</div>




