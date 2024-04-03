//package com.demo.demo.dao;
//
//import com.demo.demo.model.Book;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookListServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Book> bookList = new ArrayList<>();
//
//        // Thực hiện kết nối đến cơ sở dữ liệu và lấy danh sách sách
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password")) {
//            String query = "SELECT * FROM books";
//            PreparedStatement statement = conn.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                Book book = new Book();
//                book.setTitle(resultSet.getString("title"));
//                book.setAuthor(resultSet.getString("author"));
//                book.setYear(resultSet.getInt("year"));
//                bookList.add(book);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        // Lưu danh sách sách vào ServletContext
//        ServletContext context = getServletContext();
//        context.setAttribute("bookList", bookList);
//
//        // Chuyển hướng đến trang JSP để hiển thị danh sách sách
//        response.sendRedirect("bookList.jsp");
//    }
//}
