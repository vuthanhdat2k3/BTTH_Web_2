//package com.demo.demo.Servlet;
//
//import com.demo.demo.model.Book;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListBookServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Book> bookList = new ArrayList<Book>();
//        bookList.add(new Book("Toan", "Baba",2012));
//        bookList.add(new Book("Tieng Anh", "Baba",2012));
//        bookList.add(new Book("Tieng Viet", "Baba",2012));
//        bookList.add(new Book("Vat Ly", "Baba",2012));
//
//        request.setAttribute("bookList", bookList);
//
//        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/displayBook.jsp");
//        requestDispatcher.forward(request, response);
//    }
//}
