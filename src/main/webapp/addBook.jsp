<!DOCTYPE html>
<html>
<head>
  <title>Add Book</title>
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

    form {
      width: 50%;
      margin: 20px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    input[type="text"], input[type="password"], input[type="submit"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      background-color: #4CAF50;
      color: white;
      border: none;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }

    @media only screen and (max-width: 600px) {
      form {
        width: 90%;
      }
    }
  </style>
</head>
<body>
<h2>Add Book</h2>
<form action="AddBookServlet" method="post">
  Title: <input type="text" name="title"><br>
  Author: <input type="text" name="author"><br>
  Year: <input type="text" name="year"><br>
  <input type="submit" value="Add Book">
</form>
</body>
</html>
