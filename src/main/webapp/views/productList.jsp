<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/8/2026
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .box {
            border: 1px solid #ccc;
            padding: 10px 15px;
            max-width: 400px;
        }
        .box p {
            margin: 6px 0;
        }
    </style>
</head>
<body>
<div class="box">
    <p><strong>Thông báo:</strong> ${message}</p>
    <hr>
    <p><strong>Loại:</strong> ${category}</p>
    <p><strong>Số lượng hiển thị:</strong> ${limit} món</p>
</div>
</body>
</html>
