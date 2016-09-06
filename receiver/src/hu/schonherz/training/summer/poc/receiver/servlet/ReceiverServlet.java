package hu.schonherz.training.summer.poc.receiver.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ikant on 2016. 09. 06..
 */
@WebServlet(urlPatterns = "/servlet")
public class ReceiverServlet extends HttpServlet {

    public static final String ADDED = "ADDED";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Received stuff! payload:" + req.getAttribute(ADDED));
    }
}
