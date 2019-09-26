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
    int x = 0;
    int y = 0;
    int n = 0;
    int z = 0;
    String gender;
    String likeCats;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        gender = request.getParameter("gender");
        likeCats = request.getParameter("likecat");
        if(gender.equals("male")&&likeCats.equals("yes")) {
            response.getWriter().println("<html><h1>" + (x++) + "</h1></html>");
        }else if(gender.equals("female")&&likeCats.equals("yes")) {
            response.getWriter().println("<html><h1>" + (y++) + "</h1></html>");
        }else if(gender.equals("male")&&likeCats.equals("no")) {
            response.getWriter().println("<html><h1>" + (n++) + "</h1></html>");
        }else if(gender.equals("female")&&likeCats.equals("no")) {
            response.getWriter().println("<html><h1>" + (z++) + "</h1></html>");
        }else {response.getWriter().println("<html><h1> Bye </h1></html>");}
    }
}
