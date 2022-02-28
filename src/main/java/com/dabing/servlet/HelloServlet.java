package com.dabing.servlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//its just a class
// make it a servlet you need to extends HttpServlet class
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //what is get method
        //when a user click the link or type url in the IE
        //request come here
        //we want to send hello to client
        //set type - later
        //u need to write Hello into response
       PrintWriter out= response.getWriter();//java io
        out.println("Hello World!!!");
        //that all here
    }
    //or use post or both
}
