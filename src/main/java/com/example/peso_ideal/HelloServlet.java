package com.example.peso_ideal;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String temporario;
        float peso = 0;
        float altura = 0;
        float imc = 0;
        String genero;

        temporario = req.getParameter("weight");
        peso = Float.parseFloat(temporario.replaceAll(",","."));

        temporario = req.getParameter("height");
        altura = Float.parseFloat(temporario.replaceAll(",","."));

        genero = req.getParameter("gender");

        if(genero.equals("H")){
            imc = (float) ((72.7 * altura) - 58);
        } else if (genero.equals("F")) {
            imc = (float) ((62.1 * altura) - 44.7);
        }


        req.setAttribute("imc", imc);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}