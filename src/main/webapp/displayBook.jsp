<%@ page import="com.demo.demo.model.Book" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            margin-top: 20px;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ccc;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        a {
            display: block;
            width: 120px;
            margin: 20px auto;
            padding: 10px;
            text-align: center;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        a:hover {
            background-color: #45a049;
        }

        @media only screen and (max-width: 600px) {
            table {
                width: 90%;
            }

            .button {
                width: 80%;
            }
        }
    </style>
</head>
<body>
<h2>Book List</h2>
<table border="1">
    <thead>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Year</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Book> bookList = (List<Book>) request.getAttribute("bookList");
        if(bookList != null && !bookList.isEmpty() ){
            for (Book book : bookList) {
    %>
    <tr>
        <td><%= book.getTitle() %></td>
        <td><%= book.getAuthor() %></td>
        <td><%= book.getYear() %></td>
    </tr>
    <% }
    }%>
    </tbody>
</table>
<a href="addBook.jsp">Add book</a>
</body>
</html>
