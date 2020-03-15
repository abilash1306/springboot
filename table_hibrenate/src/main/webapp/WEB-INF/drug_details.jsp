<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ page import="com.example.demo.entity.Drug,java.util.List" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
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

<h1>"${drugName} details"</h1>
   <table class="table">
   
     <c:forEach var = "drug" items = "${drugList}">
       <tr>
       <th>Drug Name</th>
       <td>${drug.getDrugName()}</td>
     </tr>
     <tr>
       <th>Drug Type</th>
       <td>${drug.getDrugType()}</td>
     </tr>
     <tr>
       <th>Used to Treat Diseases</th>
       <td>${drug.getUsedToTreatDiseases()}</td>
     </tr>
     <tr>
       <th>Targets</th>
       <td>${drug.getTargets()}</td>
     </tr>
     <tr>
       <th>Molecular weight</th>
        <td>${drug.getMolecularWeight()}</td>
      </tr>
      <tr>
        <th>Molecular Formula</th>
        <td>${drug.getMolecularFormula()}</td>
       </tr>
       <tr>
        <th>Therapeutic class</th>
        <td>${drug.getTherapeuticClass()}</td>
       </tr>
       <tr>
        <th>Drug Use In Cancer</th>
        <td>${drug.getDrugUsedInCancer()}</td>
       </tr>
     </c:forEach>
     
   </table>
   
</body>
</html>