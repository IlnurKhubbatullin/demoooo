//package com.example.demoooo;
//
//import java.io.*;
//
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
//public class HelloServlet extends HttpServlet {
//    private String message;
//    private int a;
//    private int b;
//    int s = 0;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");

//        String name = request.getParameter("name");
//        String lastName = request.getParameter("lastName");
//        HttpSession session = request.getSession();
//
//        Integer count = (Integer) session.getAttribute("count");
//        if (count == null) {
//            count = 1;
//            session.setAttribute("count", count);
//        } else {
//            session.setAttribute("count", count + 1);
//        }
//        HttpSession session = request.getSession();
//        int s =0;
//        Integer operation = Integer.valueOf(request.getParameter("summ"));
//        Integer a = Integer.parseInt(request.getParameter("a"));
//        Integer b = Integer.parseInt(request.getParameter("b"));
//        Integer summ = a + b;
// Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> Hello, " + "</h1>");
//        out.println("</br>");
//        out.println("<h1>"  + "</h1>");
//        out.println("</body></html>");
//        Cart cart = (Cart) session.getAttribute("cart");

//        String name = request.getParameter("name");
//        int a = Integer.parseInt("110");
//        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart == null) {
//            cart = new Cart();
//
//            cart.setProduct(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/first-servlet.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            throw new RuntimeException(e);
//        }
//        response.sendRedirect("https://dzen.ru/?yredirect=true&clid=2270456&win=482");
//
//
//
//    }
//    public void destroy() {
//    }
//}