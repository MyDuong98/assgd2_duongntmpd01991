<%-- 
    Document   : khachhang
    Created on : 27-Feb-2018, 13:37:07
    Author     : Mỹ Dương
--%>

<%@page import="model.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Thêm khách hàng</title>

        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        <script src="<c:url value="/ckeditor/ckeditor.js" />"></script>
        <link href=" <%=request.getContextPath()%>/css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>
        <% CategoryDAO caedao=new CategoryDAO();%>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>
            <form action="../ManagerProductServlet" method="post">
                <div id="rightContent">
                    <h3>Thông tin khách hàng</h3>

                    <table width="95%">
                        <tr><td><b>Mã khách hàng</b></td><td>
                                <input type="number" class="sedang" name="id"></td></tr>
                        <tr><td><b>Tên khách hàng</b></td><td>
                                <input type="text" class="sedang" name="name"></td></tr>
                        <tr><td><b>Địa chỉ</b></td><td>
                                <input type="text" class="sedang" name="diachi" ></td></tr>
                        <tr><td><b>Số điện thoại</b></td><td>
                                <input type="number" class="sedang" name="sdt"></td></tr>
                        <tr><td><b>Email</b></td><td>
                                <input type="text" class="sedang" name="email"></td></tr>
                            <tr><td></td><td>

                                <input type="hidden" class="button" name="action" value="add">
                                <input type="submit" class="button" value="Thêm">
                                
                            </td></tr>
                    </table>
                </div>
                                </form>
                <div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>


    </body>
</html>

