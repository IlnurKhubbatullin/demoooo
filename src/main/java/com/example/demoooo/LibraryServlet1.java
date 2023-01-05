package com.example.demoooo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LibraryServlet1", value = "/library1")
public class LibraryServlet1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Util.printPage(response, "title", "author");
    }
}
