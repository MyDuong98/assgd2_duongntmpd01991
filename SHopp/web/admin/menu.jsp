<%-- 
    Document   : menu
    Created on : 19-May-2016, 7:20:57 PM
    Author     : TUNGDUONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
        
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        
    </head>
    <body>

        <div id="leftBar">
            <ul>
                <li><a href=" <%=request.getContextPath() %>/admin/index.jsp">Trang chủ</a></li>
                <li><a href=" <%=request.getContextPath() %>/admin/manager_category.jsp">Loại sản phẩm</a></li>
                <li><a href=" <%=request.getContextPath() %>/admin/manager_product.jsp">Sản phẩm</a></li>
                <li><a href=" <%=request.getContextPath() %>/admin/manager_hoadon.jsp">Hóa Đơn</a></li>
                <li><a href=" <%=request.getContextPath() %>/admin/manager_khachhang.jsp">Khách hàng</a></li>

                
            </ul>
        </div>

    </body>
</html>
