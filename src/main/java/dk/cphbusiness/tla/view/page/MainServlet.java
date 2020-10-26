package dk.cphbusiness.tla.view.page;

import dk.cphbusiness.tla.configurations.Shopping;
import dk.cphbusiness.tla.viewapi.ShoppingManager;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainServlet", urlPatterns = {"/main"})
public class MainServlet extends HttpServlet {
    @Inject @Shopping
    ShoppingManager manager;

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response
            ) throws ServletException, IOException {
        var out = response.getWriter();
        out.println("Hi There I'm "+getServletName());
        out.println(manager.sayHello(getServletName()));
        }

    }
