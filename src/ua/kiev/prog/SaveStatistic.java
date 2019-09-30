package ua.kiev.prog;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SaveStatistic", urlPatterns = "/statistic")
public class SaveStatistic extends HttpServlet {
    private static final String TEMPLATE = "<!DOCTYPE html><html lang = \"en\">" +
            "<head><title>Prog.kiev.ua</title></head>" +
            "<body><h1>%s</h1></body></html>";
    int x = 0;
    int y = 0;
    int n = 0;
    int z = 0;
    String gender;
    String likeCats;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        gender = request.getParameter("gender");
        likeCats = request.getParameter("likecat");
        if (gender.equalsIgnoreCase("null") && likeCats.equalsIgnoreCase("null")) {
            x = 0; y = 0; n = 0; z = 0;
            response.getWriter().println("<html><h1> Bye </h1></html>");
        } else if (gender.equals("male") && likeCats.equals("yes")) {
            x++;
            response.getWriter().println("<div> Male yes: </div>" +x +" times");
        } else if (gender.equals("female") && likeCats.equals("yes")) {
            y++;
            response.getWriter().println("<div> Male yes: </div>" +y +" times");
        } else if (gender.equals("male") && likeCats.equals("no")) {
            n++;
            response.getWriter().println("<div> Male no: </div>" +n +" times");
        } else if (gender.equals("female") && likeCats.equals("no")) {
           z++;
            response.getWriter().println("<div> Female no: </div>"+z +" times");
        } else {
            response.getWriter().println("<html><h1> Bye </h1></html>");
        }
    }
}
