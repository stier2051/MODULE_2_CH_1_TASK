package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/taskOne")
public class TaskOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/taskOne.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String userSurname = request.getParameter("userSurname");
        String typeOfFood = request.getParameter("typeOfFood");

        PrintWriter out = response.getWriter();
        if (userName != null) {
            String result = userName + " " + userSurname + " ordered " + typeOfFood;
            response.setContentType("text/html");
            out.print("<h3>" + result + "</h3>");
            out.print("<a href=\"/main\" class=\"btn\">all tasks</a>");
        } else {
            out.print("<h3>Please, enter the Name</h3>");
        }
    }
}
