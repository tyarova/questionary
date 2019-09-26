package ua.kiev.prog;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SaveStatistic", urlPatterns = "/savestatistic")
public class SaveStatistic extends HttpServlet {
    //private int[][] statisticTable = new int[2][2];

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int x = 0;

        String gender = request.getParameter("gender");
        String likeCats = request.getParameter("likecat");

        if(gender.equals("male")&&likeCats.equals("yes")) {
            response.getWriter().println("<html><h1>" + (x++) + "</h1></html>");
        }else {response.getWriter().println("<html><h1> Bye </h1></html>");}
    }
}
