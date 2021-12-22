package servlets;

import db.DBManager;
import model.Footballer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/taskThree")
public class TaskThree extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBManager dbManager = new DBManager();
        request.setAttribute("footballers", dbManager.getAllFootballers());
        request.getRequestDispatcher("/taskThree.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long playerId = 0;
        String playerName = request.getParameter("player-name");
        String playerSurname = request.getParameter("player-surname");
        int playerSalary = Integer.parseInt(request.getParameter("salary"));
        String playerClub = request.getParameter("foot-club");
        int transferPrice = Integer.parseInt(request.getParameter("transfer-price"));


        Footballer newPlayer = new Footballer(playerId, playerName, playerSurname, playerSalary, playerClub, transferPrice);

        DBManager.addFootballer(newPlayer);

        request.setAttribute("footballers",DBManager.getAllFootballers());
        request.getRequestDispatcher("/taskThree.jsp").forward(request, response);
    }
}
