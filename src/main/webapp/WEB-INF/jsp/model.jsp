<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王鹏飞
  Date: 2018/5/7
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<table border="1" cellspacing="0" cellpadding="0" >
    <tr>
        <td colspan="2">商品信息</td>

    </tr>
    <tr>
        <td>商品编号</td>
        <td>商品名称</td>
    </tr>

    <c:forEach items="${page.storages}" var="v">
        <tr class="ss" name="${v.warehouseno}">
            <td>TY00000${v.warehouseno}</td>
            <td>${v.commodityname}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <a onclick="page(1)">首页</a>
    <a onclick="page(${page.pageIndex-1})">上一页</a>

    <c:forEach begin="1" end="${page.pageTotal}" step="1" varStatus="vs">
        <a onclick="page(${vs.count})">${vs.count}</a>
    </c:forEach>

    <a onclick="page(${page.pageIndex+1})">下一页</a>
    <a onclick="page(${page.pageTotal})">末页</a>
</div>
