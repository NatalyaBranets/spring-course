package com.natali.servlet.servlet;

import com.natali.servlet.logic.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();

        Cart cart = (Cart)httpSession.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if(cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        httpSession.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

        /*
        Integer count = (Integer)httpSession.getAttribute("count");
        if(count==null) {
            httpSession.setAttribute("count", 1);
            count=1;
        } else {
            httpSession.setAttribute("count", count+1);
        }


        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Your count is: " + count + "</h1>");
        printWriter.println("</html>");

      //  RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
      //  dispatcher.forward(request, response);
*/

    }
}
