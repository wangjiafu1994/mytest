<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
 <script type="text/javascript" src="${pageContext.request.contextPath }/My97DatePicker/WdatePicker.js"></script> 
<base href="<%=basePath%>">
<!-- jsp文件头和头部 -->
<%@ include file="../../system/index/top.jsp"%>
</head>
<body class="no-skin">
	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
						<form action="${pageContext.request.contextPath }/editgoodssubmit.action" name="Form" id="Form" method="post" enctype="multipart/form-data">
							<div id="zhongxin" style="padding-top: 13px;">
							<table id="table_report" class="table table-striped table-bordered table-hover">
							<input type="hidden" name="id" value="${goodsCustom.id }"/>
								<tr>
									<td style="width:50px;text-align: right;padding-top: 13px;">商品名称:</td>
									<td><input type="text" name="goodsname" id="TITLE" value="${goodsCustom.goodsname }" maxlength="32" style="width:99%;"/></td>
								</tr>
								<tr>
									<td style="width:50px;text-align: right;padding-top: 13px;">商品价格:</td>
									<td><input type="text" name="goodsprice" id="TITLE" value="${goodsCustom.goodsprice }" maxlength="32" style="width:99%;"/></td>
								</tr>
								<tr>
									<td style="width:50px;text-align: right;padding-top: 13px;">商品介绍:</td>
									<td><input type="text" name="goodsintro" id="TITLE" value="${goodsCustom.goodsintro }" maxlength="32" style="width:99%;"/></td>
								</tr>
								<tr>
									<td style="width:50px;text-align: right;padding-top: 13px;">商品数量:</td>
									<td><input type="text" name="goodsnum" id="TITLE" value="${goodsCustom.goodsnum }" maxlength="32" style="width:99%;"/></td>
								</tr>
								<tr>
									<td style="width:50px;text-align: right;padding-top: 13px;">积分值:</td>
									<td><input type="text" name="integral" id="TITLE" value="${goodsCustom.integral }" maxlength="32" style="width:99%;"/></td>
								</tr>
								<tr>
									<td style="width:50px;text-align: right;padding-top: 13px;">图片:</td>
									<td>
										<c:if test="${goodsCustom.pic !=null}">
				                    <img src="/pic/${goodsCustom.pic}" width="210"/></a>
	                                  	</c:if>
	                                  		<input type="file" id="tp" name="goods_pic" onchange="fileType(this)"/>
									</td>
								</tr>
								<tr>
									<td style="width:20px;text-align: right;padding-top: 13px;">时间:</td>
									<td><input type="text" name="createtime" value="<fmt:formatDate value="${goodsCustom.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" maxlength="32" style="width:99% class="Wdate"  onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  /></td>
								</tr>
							
								<tr>
									<td style="text-align: center;" colspan="2">
<!-- 										<a class="btn btn-mini btn-primary" onclick="save();">保存</a> -->
<!-- 										<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a> -->
										<input type="submit" value="提交"/>
									</td>
								</tr>
							</table>
							</div>
							<div id="zhongxin2" class="center" style="display:none"><br/><br/><br/><br/><br/><img src="static/images/jiazai.gif" /><br/><h4 class="lighter block green">提交中...</h4></div>
						</form>
						</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.page-content -->
		</div>
	</div>
	<!-- /.main-content -->
</div>
<!-- /.main-container -->

<!-- basic scripts -->
<!-- 页面底部js¨ -->
<%@ include file="../../system/index/foot.jsp"%>
<!-- ace scripts -->
<script src="static/ace/js/ace/ace.js"></script>
<!-- 上传控件 -->
<script src="static/ace/js/ace/elements.fileinput.js"></script>
<!--提示框-->
<script type="text/javascript" src="static/js/jquery.tips.js"></script>			

<script type="text/javascript">
		$(top.hangge());
		$(function() {
			//上传
			$('#tp').ace_file_input({
				no_file:'请选择图片 ...',
				btn_choose:'选择',
				btn_change:'更改',
				droppable:false,
				onchange:null,
				thumbnail:false, //| true | large
				whitelist:'gif|png|jpg|jpeg',
				//blacklist:'gif|png|jpg|jpeg'
				//onchange:''
				//
			});
		});
	
	//保存
	function save(){
			if($("#TITLE").val()==""){
			$("#TITLE").tips({
				side:3,
	            msg:'请输入标题',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#TITLE").focus();
			return false;
		}
		if(typeof($("#tpz").val()) == "undefined"){
			if($("#tp").val()=="" || document.getElementById("tp").files[0] =='请选择图片'){
				
				$("#tp").tips({
					side:3,
		            msg:'请选图片',
		            bg:'#AE81FF',
		            time:3
		        });
				return false;
			}
		}
		
		if($("#MASTER_ID").val()==""){
			$("#MASTER_ID").tips({
				side:3,
	            msg:'请输入属于',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#MASTER_ID").focus();
			return false;
		}
		if($("#BZ").val()==""){
			$("#BZ").tips({
				side:3,
	            msg:'请输入备注',
	            bg:'#AE81FF',
	            time:2
	        });
			$("#BZ").focus();
			return false;
		}
		$("#Form").submit();
		$("#zhongxin").hide();
		$("#zhongxin2").show();
	}
	
	//过滤类型
	function fileType(obj){
		var fileType=obj.value.substr(obj.value.lastIndexOf(".")).toLowerCase();//获得文件后缀名
	    if(fileType != '.gif' && fileType != '.png' && fileType != '.jpg' && fileType != '.jpeg'){
	    	$("#tp").tips({
				side:3,
	            msg:'请上传图片格式的文件',
	            bg:'#AE81FF',
	            time:3
	        });
	    	$("#tp").val('');
	    	document.getElementById("tp").files[0] = '请选择图片';
	    }
	}
	
	//删除图片
	function delP(PATH,PICTURES_ID){
		 if(confirm("确定要删除图片？")){
			var url = "pictures/deltp.do?PATH="+PATH+"&PICTURES_ID="+PICTURES_ID+"&guid="+new Date().getTime();
			$.get(url,function(data){
				if(data=="success"){
					alert("删除成功!");
					document.location.reload();
				}
			});
		} 
	}
</script>
</body>
</html>