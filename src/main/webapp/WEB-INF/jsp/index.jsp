<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ERP商品入库</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/statics/css/index.css"/>
</head>

<body>

     <div class="container">
  <!--      <div style="color:#ff0000; ">保存成功！</div>-->
        <div class="left" style="height:500px;">
           
             <table border="1" cellspacing="0" cellpadding="0" >
              <tr>
                <td colspan="2">商品信息</td>
              
              </tr>
               <tr>   
                <td>商品编号</td>
                <td>商品名称</td>
              </tr>
            
            
              <tr>
       
              
                <td>TY000019</td>
                <td >矿泉水</td>
              </tr>
               
              <tr >
                
                <td>TY000020</td>
                <td>香烟</td>
              </tr>
              
                <tr>
            
                <td>TY000021</td>
                <td>小食品</td>
              </tr>
                <tr>
                
                <td>TY000022</td>
                <td>服装</td>
              </tr>
                <tr>
               
                <td>TY000023</td>
                <td>电视机</td>
              </tr>
                <tr>
                
                <td>TY000024</td>
                <td>冰箱</td>
              </tr>
               <tr>
               
                <td>TY000025</td>
                <td>空调</td>
              </tr>
               <tr>
               
                <td>TY000026</td>
                <td>手机</td>
              </tr>
               <tr>
                
                <td>TY000027</td>
                <td>面粉</td>
              </tr>
               <tr>
                
                <td>TY000028</td>
                <td>牙膏</td>
              </tr>
               <tr>
                
                <td>TY000029</td>
                <td>洗发水</td>
              </tr>
               <tr>
              
                <td>TY000030</td>
                <td>毛巾</td>
              </tr>
             
            </table>
           <div>
               <a href="#">首页</a>
               <a href="#">上一页</a>
               <a href="#">1</a>
               <a href="#">2</a>
               <a href="#">3</a>
               <a href="#">下一页</a>
               <a href="#">末页</a>
           </div>
        </div>
        <div class="right">
         <div style="border-bottom:1px solid #ccc; height:50px; line-height:50px;"> 
   商品入库
</div>
      <table  border="0" cellspacing="0" cellpadding="0">
  
  <tr>
    <td>入库编号</td>
    <td><input type="text"  /></td>
  </tr>
  <tr>
    <td>商品名称</td>
    <td><input type="text"  /></td>
  </tr>
    <tr>
    <td>供应商</td>
    <td><input type="text"  /></td>
  </tr>
  <tr>
    <td>商品规格</td>
    <td><input type="text"  /></td>
  </tr>
  <tr>
    <td>商品规格单位</td>
    <td><input type="text"  /></td>
  </tr>
    <tr>
    <td>数量</td>
    <td><input type="text"  /></td>
  </tr>
  <tr>
    <td>计量单位</td>
    <td>
       <select>
                <option>包</option>
                <option>箱</option>
                <option>件</option>
                <option>个</option>
                <option>瓶</option>
       </select>
    </td>
  </tr>

    <tr>
    <td>单价</td>
    <td><input type="text"  /></td>
  </tr>
<tr>
    <td>入库日期</td>
    <td><input type="text"  /></td>
  </tr>
<tr>
    <td>备注</td>
    <td> <textarea rows="5" cols="28"></textarea></td>
  </tr>
  
  
</table>
<div style="border-top:1px solid #ccc; height:50px; line-height:50px;"> 
    <input type="button" value="保存" style="margin-top:14px;" />
</div>
        </div>
     </div>
</body>
</html>
