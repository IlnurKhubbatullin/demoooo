package com.example.demoooo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LibraryServlet2", value = "/library2")
public class LibraryServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Util.printPage(response, "id", "quantity");
    }
}