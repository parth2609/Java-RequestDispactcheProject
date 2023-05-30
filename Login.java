/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Login extends HttpServlet
{

    

    /**
     *
     * @param rq
     * @param rs
     */
    @Override
        public void doPost(HttpServletRequest rq, HttpServletResponse rs){
try
{

String username=rq.getParameter("u1");
String password=rq.getParameter("p1");
rs.setContentType("text/html");
PrintWriter out=rs.getWriter();
if(username.equals("admin")&&password.equals("admin"))
{
rs.sendRedirect("https://www.facebook.com");
}
else{
out.print("<html><center><h1>invalid username and password</h1></center></html>");
rq.getRequestDispatcher("index.html").include(rq,rs);
}
}
catch(IOException | ServletException e)
{

}
}

    /**
     *
     * @param rq
     * @param rs
     */
    @Override
    public void doGet(HttpServletRequest rq, HttpServletResponse rs)
{
try
{
doPost(rq,rs);
}
catch(Exception e)
{
}
}
}
