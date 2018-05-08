<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ERP商品入库</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/index.css"/>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-1.8.3.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/index.js"></script>
</head>

<body>

     <div class="container">
  <!--      <div style="color:#ff0000; ">保存成功！</div>-->
        <div class="left" style="height:500px;" id="show">
           

        </div>
        <div class="right">
            <p style="color: red"></p>
         <div style="border-bottom:1px solid #ccc; height:50px; line-height:50px;"> 
   商品入库
</div>

      <form action="${pageContext.request.contextPath}/add" method="post">
      <table  border="0" cellspacing="0" cellpadding="0">
  
          <tr>
            <td>入库编号</td>
            <td><input type="text" id="warehouseno"  name="warehouseno" disabled/></td>
          </tr>
          <tr>
            <td>商品名称</td>
            <td><input type="text"  name="commodityname" required /></td>
          </tr>
            <tr>
            <td>供应商</td>
            <td><input type="text"  name="supplier"required/></td>
          </tr>
          <tr>
            <td>商品规格</td>
            <td><input type="text"  name="specifications"required/></td>
          </tr>
          <tr>
            <td>商品规格单位</td>
            <td><input type="text"  name="specificationunit"required/></td>
          </tr>
            <tr>
            <td>数量</td>
            <td><input type="text"  name="number"required/></td>
          </tr>
          <tr>
            <td>计量单位</td>
            <td>
               <select name="unit" id="unit">
                        <option value="包">包</option>
                        <option value="箱">箱</option>
                        <option value="件">件</option>
                        <option value="个">个</option>
                        <option value="瓶">瓶</option>
               </select>
            </td>
          </tr>

            <tr>
            <td>单价</td>
            <td><input type="text"  name="price"required/></td>
          </tr>
        <tr>
            <td>入库日期</td>
            <td><input type="text"  name="storagdate"required/></td>
          </tr>
        <tr>
            <td>备注</td>
            <td> <textarea rows="5" cols="28" name="remarks"></textarea></td>
          </tr>


        </table>

        <div style="border-top:1px solid #ccc; height:50px; line-height:50px;">
            <input type="button" value="保存" style="margin-top:14px;" onclick="add()"/>
        </div>

      </form>

        </div>
     </div>
</body>
</html>
