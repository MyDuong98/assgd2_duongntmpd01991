


<%@page import="model.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống kê</title>


        <link href=" <%=request.getContextPath()%>/css/mos-style.css" rel='stylesheet' type='text/css' />

    </head>
    <body>


        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">

            <jsp:include page="menu.jsp"></jsp:include>
                <form action="../ManagerCategoryServlet" method="post">
                    <div id="rightContent">
                        <h3>Thống kê</h3>

                        <a href=" <%=request.getContextPath()%>/admin/insert_category.jsp">Thêm  </a>

                    <table class="data">

                        <tr class="data">

                            <th class="data" > Danh mục</th>
                            <th class="data">Mã sản phẩm</th>
                            <th class="data">Tên sản phẩm</th>
                            <th class="data">Số lượng </th>
                            <th class="data">số lượng hàng còn</th>
                            <th class="data">Số lượng bán</th>
                            <th class="data">Ngày thống kê</th>
                          
                        </tr>
                            <tr>
                               
                                    <td>Đồ nữ</td>
                                    <td>md123</td> 
                                    <td>Áo thun nữ</td>
                                    <td>60</td>
                                    <td>50</td>
                                    <td>10</td>
                                    <td>1-2-2017</td>
                                </tr>
                             <tr>
                                    <td>Đồ nam</td>
                                    <td>md132</td> 
                                    <td>Quần kaki</td>
                                    <td>40</td>
                                    <td>24</td>
                                    <td>16</td>
                                     <td>24-5-2017</td>
                               </tr>
                            <tr>
                                    <td>Áo khoác</td>
                                    <td>md141</td> 
                                    <td>Áo da</td>
                                    <td>20</td>
                                    <td>15</td>
                                    <td>5</td>
                                    <td>6-1-2018</td>
                                </tr>

                    </table>

                </div>
                <div class="clear"></div>
            </form>

            <jsp:include page="footer.jsp"></jsp:include>

        </div>

    </body>
</html>
