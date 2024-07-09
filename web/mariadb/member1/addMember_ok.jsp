<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="javax.naming.NamingException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");

    String id = request.getParameter("id");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String birthyy = request.getParameter("birthyy");
    String birthmm = request.getParameter("birthmm");
    String birthdd = request.getParameter("birthdd");
    String mail1 = request.getParameter("mail1");
    String mail2 = request.getParameter("mail2");
    String phone1 = request.getParameter("phone1");
    String phone2 = request.getParameter("phone2");
    String phone3 = request.getParameter("phone3");
    String zipcode1 = request.getParameter("zipcode1");
    String zipcode2 = request.getParameter("zipcode2");
    String address1 = request.getParameter("address1");
    String address2 = request.getParameter("address2");

    Connection conn = null;
    PreparedStatement pstmt = null;

    int flag = 1;
    try {
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");

        conn = dataSource.getConnection();

        String sql = "insert into member values(0,?,password(?),?,?,?,?,?,?,?,?, now() )";
        pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, id);
        pstmt.setString(2, password);
        pstmt.setString(3, name);
        pstmt.setString(4, gender);
        pstmt.setString(5, birthyy + birthmm + birthdd);
        pstmt.setString(6, mail1 + mail2);
        pstmt.setString(7, phone1 + phone2 + phone3);
        pstmt.setString(8, zipcode1 + zipcode2);
        pstmt.setString(9, address1);
        pstmt.setString(10, address2);
        pstmt.executeUpdate();

        if (pstmt.executeUpdate() == 1) {
            flag = 0;
        }

    } catch (NamingException e) {
        System.out.println("에러 : " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("에러 : " + e.getMessage());
    }finally {
        if(pstmt != null)pstmt.close();
        if(conn != null)conn.close();
    }

    out.println("<script type = 'text/javascript'>");
    if (flag == 0 ) {
        out.println("alert('회원가입 성공');");
        out.println("location.href = './resultMember.jsp';");
    } else {
        out.println("alert('회원가입 실패');");
        out.println("history.back();");
    }
    out.println("</script>");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="resultMember.jsp" method="post">

</form>
</body>
</html>
