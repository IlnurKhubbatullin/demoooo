package com.example.demoooo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator", value = "/calculator")
public class Calculator extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Integer a = Integer.parseInt(request.getParameter("a"));
        Integer b = Integer.parseInt(request.getParameter("b"));
        String operation = request.getParameter("operation");
        double result = 0;

        switch (operation) {
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = (double) a / b;
                break;
        }
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Ответ = " + result + "</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}
