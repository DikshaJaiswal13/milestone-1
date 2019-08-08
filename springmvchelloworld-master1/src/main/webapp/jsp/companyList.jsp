<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.stockspring.model.Company"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Company</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./jsp/companyListStyle.css" />
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="shortcut icon"
	href="http://www.brianshim.com/webtricks/wp-content/uploads/2012/11/stars_favicon.png"
	type="image/x-icon" />
</head>



<body>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>

<div class="header">
 <nav class="navbar navbar-inverse">
  <div class="container-fluid" style="background: black">
   <div class="navbar-header">
   <!--  <img alt="logo" src="logo.png"> -->
   </div>
   <div class="navbar-header">
    <a class="navbar-brand" href="#" style="color: white"><b>&nbsp;Stock
      Exchange Chart</b></a>
   </div>
   <ul class="nav navbar-nav">
    <li class="active"><a href="./importData.html">Import Data</a></li>
    <li class="dropdown"><a class="dropdown-toggle"
     data-toggle="dropdown" href="#">Manage Company<span
      class="caret"></span></a>
     <ul class="dropdown-menu">
      <li><a href="./addCompany.html" style="color: white;">Add Company</a></li>
      <li><a href="./updateCompanyPage.html" style="color: white;">Update Company</a></li>
      <li><a href="#" style="color: white;">List of all
        Companies</a></li>
     </ul></li>
    <li class="dropdown"><a class="dropdown-toggle"
     data-toggle="dropdown" href="#">Manage Exchange<span
      class="caret"></span></a>
     <ul class="dropdown-menu">
      <li><a href="importStockPage.html" style="color: white;">Register New Stock
        Exchange</a></li>
      <li><a href="./stockDetailsPage.html" style="color: white;">List Stock
        Exchange</a></li>
     </ul></li>
    <li><a href="./IPOregistration.html">Update IPO details</a></li>

   </ul>
   <div class="nav navbar-nav navbar-right" id="logout">
    <button class="btn navbar-btn btn-default" onclick="location.href = './logout.html';"><span class="glyphicon glyphicon-log-out"></span> Logout</button>
   </div>
  </div>
 </nav>
</div>
<div class="container">
 <!-- Code starts from here -->
	<h3>Table of  Company name</h3>
<br>
<br>

<table>
<thead>
 <tr>
  <th>Company Code</th>
  <th>Company Name</th>
  <th>Turnover</th>
  <th>CEO</th>
  <th>Board of Directors</th>
  <th>Sector Id</th>
  <th>Brief</th>
  <th>Stock Code</th>
 </tr>
</thead>

<tbody id="myTable">
<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>
<td><%= e.getCompanyId() %></td>
<td><%= e.getCompanyName() %></td>
<td><%= e.getTurnover() %></td>
<td><%= e.getCeo() %></td>
<td><%= e.getBoardOfDirectors() %></td>
<td><%= e.getSector().getSectorId()%></td>
<td><%= e.getSector().getBrief() %></td>
<td><%= e.getSector().getStockCode() %></td>
</tr>
<% }%>

</tbody>
</table>
 
 
 
 <!-- Code ends here -->
</div>
<div class="footer">
 <p>Copyright © 2019 Stock Exchange Chart-All Rights Reserved</p>
</div>

</body>
</html>
 
