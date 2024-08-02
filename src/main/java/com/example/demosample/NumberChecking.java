package com.example.demosample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/number")
public class NumberChecking extends HttpServlet {
    int num = 2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*System.out.println("static num: "+num);

        int newNum = Integer.parseInt(req.getParameter("number"));
        System.out.println("new value: "+ newNum);

        PrintWriter writer = resp.getWriter();
        int sum = 0;

        sum = num+newNum;
        System.out.println("sum: "+sum);

        if (sum%2 == 0){
            writer.println("Even");
        }else {
            writer.println("Odd");
        }*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("static num: "+num);

        int newNum = Integer.parseInt(req.getParameter("number"));
        System.out.println("new value: "+ newNum);

        PrintWriter writer = resp.getWriter();
        int sum = 0;

        sum = num+newNum;
        System.out.println("sum: "+sum);

        if (sum%2 == 0){
            writer.println("Even");
        }else {
            writer.println("Odd");
        }
    }
}
