<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
</head>
<body>
	<h1>列表页面</h1>
	<form action="list" method="post">
		<input type="hidden" name="pageNum">
		关键词：<input type="text" name="title" value="${vo.title }">
		排序：<select name="orderName">
				<option value="">--请选择--</option>
				<option value="score" ${vo.orderName=="score"?"selected":"" }>权重</option>
				<option value="created" ${vo.orderName=="created"?"selected":"" }>发布时间</option>
			</select>
			<select name="orderMethod">
				<option value="">--请选择--</option>
				<option value="asc" ${vo.orderMethod=="asc"?"selected":""  }>升序</option>
				<option value="desc" ${vo.orderMethod=="desc"?"selected":""  }>降序</option>
			</select>
		<input type="submit" value="查询">
	</form>
	<table>
	  <tr>
	    <th>ID</th>
	    <th>新闻标题</th>
	    <th>链接地址</th>
	    <th>权重</th>
	    <th>发布时间</th>
	  </tr>
	  <c:forEach items="${info.list }" var="n" varStatus="count">
		  <tr>
		    <td>${count.count }</td>
		    <td>${n.title }</td>
		    <td>${n.url }</td>
		    <td>${n.score }</td>
		    <td>${n.created }</td>
		  </tr>
	  </c:forEach>
	  <tr>
	  	<td colspan="100">
	  		第${info.pageNum }/${info.pages }条--共${info.total }条数据
	  		<input type="button" onclick="page(1)" value="首页">
	  		<input type="button" onclick="page(${info.prePage})" value="上一页">
	  		<input type="button" onclick="page(${info.nextPage})" value="下一页">
	  		<input type="button" onclick="page(${info.pages})" value="尾页">
	  	</td>
	  </tr>
	</table>
</body>
<script type="text/javascript">
	//分页
	function page(pageNum) {
		$("[name=pageNum]").val(pageNum)
		$("form").submit()
	}
</script>
</html>