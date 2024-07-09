<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();

    out.println("<script type='text/javascript'>");
    out.println("alert('로그아웃에 성공했습니다.');");
    out.println("location.href='./index.jsp';");
    out.println("</script>");
%>
