<%@ page import="coforge.com.model.Customer" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page isELIgnored="false" %>

<html>

<head>

  <title>Title</title>

  <style>

    .myform{

      width: 30%;

      border: solid;

      margin-left: 300pt;

      margin-top: 100pt;

      padding: 20pt;

    }

  </style>

</head>

<body>

<div class="myform">

<h1>Customer Data</h1>

<div>

  Id is ${customer.id}

</div>

<div>

  Name is ${customer.name}

</div>

<div>

  Salary is ${customer.salary}

</div>

<div>

  Gender is

  <%

    Customer customer = (Customer) request.getAttribute("customer");

    for(String c: customer.getGender())

      out.println(c+", ");

  %>

</div>

<div>

  City is

  <%

    for(String c: customer.getCities())

      out.println(c+", ");

  %>

</div>

<div>

  Hobbies is

  <%

    for(String c: customer.getHobbies())

      out.println(c);

  %>

</div>

</div>

</body>

</html>