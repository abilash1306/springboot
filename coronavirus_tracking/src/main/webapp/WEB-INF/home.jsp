<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "com.example.demo.model.LocationStats" %>
<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org">

  <head>
    <title>Coronavirus Tracker Application</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  </head>

  <body>
  <h3>Coronavirus Tracker Application</h3>
  <p>This application lists the current number of cases reported across the globe</p>
  
  <div class="jumbotron">
	  <h1 class="display-4" th:text="${totalReportedCases}"></h1>
	 
	  <p>Total number of cases as of today</p>
	</div>

 <div class = "container-fluid">
    <table class = "table">
      <tr>
        <th>State</th>
        <th>Country</th>
        <th>Latest Total Cases</th>
        <th>Changes since Last Day</th>
      </tr>
      <tr th:each="locationStat : ${locationStats}">
        <td th:text="${locationStat.getState()}">Onions</td>
        <td th:text="${locationStat.getRegion()}"></td>
        <td th:text="${locationStat.getTotalCases()}">0</td>
        <td th:text="${locationStat.getDiffFromPrevDay()}">0</td>
      </tr>
    </table>
 </div> 
  </body>

</html>