package hu.schonherz.training.summer.poc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by ikant on 2016. 09. 06..
 */
@WebFilter(urlPatterns = "/*")
public class SecurityFilter implements Filter {

    public static final String ADDED = "ADDED";
    public static final String VALUE = "value";
    public static final String RECEIVER_SERVLET_PATH = "/servlet";
    public static final String RECEIVER_CONTEXT_PATH = "/receiver";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setAttribute(ADDED, VALUE);
        servletRequest.getServletContext().getContext(RECEIVER_CONTEXT_PATH)
                .getRequestDispatcher(RECEIVER_SERVLET_PATH).forward(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
