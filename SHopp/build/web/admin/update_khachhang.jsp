<%-- 
    Document   : update_khachhang
    Created on : 27-Feb-2018, 14:29:04
    Author     : Mỹ Dương
--%>

<%@page import="model.khachhangDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update khách hàng</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script src="<c:url value="/ckeditor/ckeditor.js" />"></script>

    </head>
    <body>
        <% khachhangDAO khd=new khachhangDAO();%>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>
            <form action="<%=request.getContextPath()%>/ManagerProductServlet" method="post">
                <div id="rightContent">
                    <h3>Thông tin khách hàng</h3>

                    <table width="95%">
                        <tr><td><b>Mã khách hàng</b></td><td>
                                <input type="text" class="sedang" name="id" value="${KHACHHANG.MaKH}" readonly></td></tr>
                        <tr><td><b>Tên khách hàng</b></td><td>
                                <input type="text" class="sedang" name="name" value="${KHACHHANG.TenKH}"></td></tr>
                        <tr><td><b>Địa chỉ</b></td><td>
                                <input type="text" class="sedang" name="diachi" value="${KHACHHANG.DiaChi}" ></td></tr>
                        <tr><td><b>SDT</b></td><td>
                                <input type="number" class="sedang" name="sdt" value="${KHACHHANG.SDT}"></td></tr>
                        <tr><td><b>Email</b></td><td>
                                <input type ="email" class="sedang" name="email" value="${KHACHHANG.Email}"></td></tr>
                        
<!--                        <tr><td><b>Ngày Sản Xuất</b></td><td>
                                <input type="date" class="form-control" placeholder="Enter Publishday:" name="publishday" class="sedang" value=""></td></tr>-->
                     
                        <tr><td></td><td>
                                <input type="hidden" class="button" name="action" value="update">
                                <input type="submit" class="button" value="Luu">
                                
                            </td></tr>
                    </table>
                </div>
                                </form>
                <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>


    </body>
</html>
