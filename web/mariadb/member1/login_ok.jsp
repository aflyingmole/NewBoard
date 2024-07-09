
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    int flag = 2;

    try{
        Context initCtx = new InitialContext();
        Context envCtx = (Context)initCtx.lookup("java:comp/env");
        DataSource dataSource = (DataSource)envCtx.lookup("jdbc/mariadb2");

        conn = dataSource.getConnection();

        //session 에 넣고싶은 항목 -id / name/ email /회원등급...
        String sql = "select name, mail from member where id=? and password=password(?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, password);

        rs = pstmt.executeQuery();
        flag = 1;
        if(rs.next()){
            flag = 0;

            session.setAttribute("sid", id);
            session.setAttribute("sname", rs.getString("name"));
            session.setAttribute("smail", rs.getString("mail"));
        }


    }catch (SQLException e) {
        System.out.println("[에러]" + e.getMessage());
    } catch (NamingException e) {
        System.out.println("[에러]" + e.getMessage());
    } finally {
        if (pstmt != null)  pstmt.close();
        if (conn != null) conn.close();
        if (rs != null)  rs.close();
    }

    out.println("<script type='text/javascript'>");
    if(flag == 0) {
        out.println( "alert('로그인에 성공했습니다.');" );
        out.println( "location.href='./index.jsp';" );
    } else if(flag == 1) {
        out.println( "alert('아이디나 비밀먼호가 오류.');" );
        out.println( "history.back();");
    } else {
        out.println( "alert('로그인 실패.');" );
        out.println( "history.back();");
    }
    out.println( "</script>" );
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

</body>
</html>