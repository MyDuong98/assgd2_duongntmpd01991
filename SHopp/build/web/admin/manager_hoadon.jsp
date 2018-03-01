<%-- 
    Document   : manager_hoadon
    Created on : 13-Nov-2017, 15:41:42
    Author     : Mỹ Dương
--%>


<%@page import="java.text.SimpleDateFormat"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý hóa đơn</title>


        <link href=" <%=request.getContextPath()%>/css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
      
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>

                <div id="rightContent">
                    <h3>Quản lí Hóa đơn</h3>
                    <a href=" <%=request.getContextPath()%>/admin/insert_hoadon.jsp">Thêm Hóa đơn</a>
                          
                <table class="data">
                    <tr class="data">
                        <th class="data" width="30px">ID</th>
                        <th class="data">Tên</th>
                        <th class="data">Ngày mua</th>
                        <th class="data">Trạng thái</th>
<!--                        <th class="data">Ngày Sản Xuất</th>-->
                        <th class="data">Số lượng</th>
                        <th class="data">Giá</th>
                        <th class="data" width="75px">Tùy chọn</th>
                 


                   



                </table>
            </div>
            <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>


    </body>
</html>


