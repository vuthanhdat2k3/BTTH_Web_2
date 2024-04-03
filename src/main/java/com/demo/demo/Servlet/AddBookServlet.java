package com.demo.demo.Servlet;

import com.demo.demo.model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "AddBookServlet", urlPatterns = {"/AddBookServlet"})
public class AddBookServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Nhận thông tin sách từ form
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int year = Integer.parseInt(request.getParameter("year"));

        // Tạo đối tượng sách
        Book book = new Book(title, author, year);

        // Lấy danh sách sách từ ServletContext
        List<Book> bookList = (List<Book>) getServletContext().getAttribute("bookList");

        // Kiểm tra nếu danh sách sách chưa được khởi tạo
        if (bookList == null) {
            bookList = new ArrayList<>();
        }

        // Thêm sách vào danh sách
        bookList.add(book);

        // Cập nhật danh sách sách trong ServletContext
        getServletContext().setAttribute("bookList", bookList);
        request.setAttribute("bookList", bookList);

        // Chuyển hướng về trang hiển thị danh sách sách
        RequestDispatcher dispatcher = request.getRequestDispatcher("/displayBook.jsp");
        dispatcher.forward(request, response);
    }
}
