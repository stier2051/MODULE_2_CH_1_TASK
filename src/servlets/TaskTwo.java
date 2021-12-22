package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/taskTwo")
public class TaskTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/taskTwo.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("gender");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (fullName != null && sex.equals("male") && age >= 18) {
            out.print("<h2>Hello Dear Mister " + fullName + "!</h2>");
        } else if (fullName != null && sex.equals("male") && age < 18) {
            out.print("<h2>Hello Dude " + fullName + "!</h2>");
        } else if (fullName != null && sex.equals("female") && age >= 18) {
            out.print("<h2>Hello Dear Missis " + fullName + "!</h2>");
        } else if (fullName != null && sex.equals("female") && age < 18) {
            out.print("<h2>Hello Dude Miss " + fullName + "!</h2>");
        } else {
            out.print("<h3>Please, enter the Name</h3>");
        }
    }
}
