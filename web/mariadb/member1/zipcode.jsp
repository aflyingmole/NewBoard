<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException"%>
<%@ page import="javax.sql.DataSource"%>

<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="javax.naming.Context" %>
<%
    request.setCharacterEncoding("utf-8");

    StringBuilder sbHtml = new StringBuilder();
    if(request.getParameter("strdong")!= null){
        String strDong = request.getParameter("strdong");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;


        try{
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource dataSource = (DataSource)envCtx.lookup("jdbc/mariadb2");

            conn = dataSource.getConnection();

            String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, strDong + "%");
            rs = pstmt.executeQuery();

            sbHtml.append("<table border=1>");
            while(rs.next()){
                String address = String.format("[%s] %s %s %s %s %s",
                        rs.getString("zipcode"),rs.getString("sido"),rs.getString("gugun"),rs.getString("dong"),rs.getString("ri"),rs.getString("bunji"));
                sbHtml.append("<tr>");
                sbHtml.append("<td>"+address+"</td>");
                //closeWin('우편번호1','우편번호2','번지를 제외한 주소')
                String[] zipcode = rs.getString("zipcode").split("-");
                String address2 = rs.getNString("sido") + " " + rs.getString("gugun") + " " + rs.getString("dong") + " " + rs.getString("ri");
                sbHtml.append("<td><input type='button' value='주소넣기' onclick=\"closeWin('" + zipcode[0] + "','" + zipcode[1] + "', '"+ address2 + "')\"/></td>");
                sbHtml.append("</tr>");
            }
            sbHtml.append("</table>");
        }catch(NamingException e){
            System.out.println("[에러]" + e.getMessage());
        }catch (SQLException e) {
            System.out.println("[에러]"+e.getMessage());

        } finally{
            if(rs!=null)rs.close();
            if(pstmt != null)pstmt.close();
            if(conn != null)conn.close();
        }
    }
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function () {
            document.getElementById('zbtn').onclick = function () {
                // alert('버튼 클릭');
                if(document.zfrm.strdong.value.trim() == '') {
                    alert('동이름을 입력하세요.')
                    return;
                }
                document.zfrm.submit();
            };
        };

        const closeWin = function (zipcode1, zipcode2, address) {
            // alert('버튼 클릭 : ' + address);
            opener.document.wfrm.zipcode1.value = zipcode1;
            opener.document.wfrm.zipcode2.value = zipcode2;
            opener.document.wfrm.address1.value = address;


            self.close();
        };
    </script>
</head>
<body>

<form action="zipcode.jsp" method="post" name="zfrm">
    동이름 <input type="text" name="strdong" />
    <input type="button" id="zbtn" value="우편번호검색">
</form>

<hr/>

<%=sbHtml%>

</body>
</html>
