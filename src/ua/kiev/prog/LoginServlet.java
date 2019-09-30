package ua.kiev.prog;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "LoginServlet", urlPatterns = "/questions")
public class LoginServlet extends HttpServlet {
    public static Map<String, String> creds;

    static {
        creds = new HashMap<>();
        creds.put("admin", "qwerty");
        creds.put("user", "qwertyq1");
    }

    public boolean areValidCreds(String userLogin, String userPassword) {
        if (creds.containsKey("userLogin") && creds.get("userLogin").equals("userPassword")) {
            return true;
        } else return false;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session;
        if (areValidCreds(login, password)) {
            session = request.getSession(true);
            session.setAttribute("user_login", login);
        }else response.setStatus(500);
    }
}
