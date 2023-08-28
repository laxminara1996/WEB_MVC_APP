<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Book Details</h1>
<form action="book">
  Book Id : <input type="text" name="id"/>
  <input type="submit" value="search"/>
  </form>
  <hr/>
  
  
  Book Id : ${book.bookId}<br/>
  book Name : ${book.bookName } <br/>
  book price: ${book.bookPrice }<br/>
</body>
</html>