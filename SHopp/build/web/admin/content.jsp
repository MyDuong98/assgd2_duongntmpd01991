<%-- 
    Document   : content
    Created on : 19-May-2016, 7:21:25 PM
    Author     : TUNGDUONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
    </head>
    <body>

        <div id="rightContent">
            <h3>Dashboard</h3>
            <div class="welcome">
              <b>Welcome :</b><br>
                <i style="color: #5b5b5b;">"Welcome to our store"</i>
            </div>
            <div class="shortcutHome">
                <a href=""><img src=" <%=request.getContextPath() %>/img/posting.png"><br>PhucAn</a>
            </div>
            <div class="shortcutHome">
                <a href=""><img src=" <%=request.getContextPath() %>/img/photo.png"><br>Bomber DNA Basic</a>
            </div>
            <div class="shortcutHome">
                <a href=""><img src=" <%=request.getContextPath() %>/img/halaman.png"><br>M.Y.M</a>
            </div>
            <div class="shortcutHome">
                <a href=""><img src=" <%=request.getContextPath() %>/img/template.png"><br>ZigZag</a>
            </div>
            <div class="shortcutHome">
                <a href=""><img src=" <%=request.getContextPath() %>/img/quote.png"><br>The Cosmo</a>
            </div>
            <div class="shortcutHome">
                <a href=""><img src=" <%=request.getContextPath() %>/img/bukutamu.png"><br>Parka DNA Basic</a>
            </div>

            <div class="clear"></div>

            <div id="smallRight"><h3>Shirt manufacturers</h3>
                <table style="border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;">
                    <tr><td style="border: none;padding: 4px;">PhucAn</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">Bomber DNA Basic</td><td style="border: none;padding: 4px;"><b>10</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">M.Y.M</td><td style="border: none;padding: 4px;"><b>22</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">ZigZag</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">The Cosmo</td><td style="border: none;padding: 4px;"><b>2</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">Parka DNA Basic</td><td style="border: none;padding: 4px;"><b>12</b></td></tr>
                </table>
            </div>
            <div id="smallRight"><h3>Data</h3>

                <table style="border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;">
                    <tr><td style="border: none;padding: 4px;">Member</td><td style="border: none;padding: 4px;"><b>200</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">Online</td><td style="border: none;padding: 4px;"><b>30</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">New member</td><td style="border: none;padding: 4px;"><b>1</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">Current month</td><td style="border: none;padding: 4px;"><b>55</b></td></tr>
                    <tr><td style="border: none;padding: 4px;">Total visits</td><td style="border: none;padding: 4px;"><b>100</b></td></tr>
                </table>
            </div>
        </div>
        <div class="clear"></div>

    </body>
</html>
