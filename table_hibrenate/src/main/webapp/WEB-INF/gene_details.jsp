<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ page import="com.example.demo.entity.Gene,java.util.List" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
   li{
         list-style-type:none;
         display:inline;
         margin: 20px;
   }
   
   ul{
            margin-top: 2%;
   }
   
   table{
           margin:25px;
   }
</style>
</head>
<body>

<div>
   <ul>
      <li><a href = "/">Home</a></li>
      <li><a href = "/gene_search">Search Gene</a></li>
      <li><a href = "/drug_search">Search Drug</a></li>
      <li><a href = "/contact">Contact</a></li>
   </ul>
</div>

<h1>"${gene} details"</h1>
   <table class="table">
     <tr>
       <th>Gene Name</th>
       <th>Gene Symbol</th>
       <th>Gene Type</th>
       <th>Organism</th>
       <th>Involvement In Disease</th>
       <th>Drug Used</th>
       <th>Uni Prot Id</th>
     </tr>
       
       <c:forEach var="gene" items="${geneList}">
        <td>${gene.getName()}</td>
         <td>${gene.getSymbols()}</td>
         <td>${gene.getType()}</td>
         <td>${gene.getOrganism()}</td>
         <td>${gene.getInvolvementInDisease()}</td>
         <td><a href = "${url}${gene.getDrugUsed()}">${gene.getDrugUsed()}</a></td>
         <td>${gene.getUniProtId()}</td>
       </c:forEach>
         
   </table>
   
</body>
</html>