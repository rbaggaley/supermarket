<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Costco Human Resources System Manager| Home Page</title>
</head>
<body>
	<div class="row">
		<h1>Cosco Human Resources System</h1>
 		<h3>Advanced Results for Employees</h3>
		<p>Searched ${totalEmployees} records 
 			for employees matching <em>${term}</em>.
 			Found <strong>${employees.size()}</strong> employees.
 		</p>
		<ul>
 		<g:each var="employee" in="${employees}">
 			<li><g:link controller="employee" action="index"
id="${employee.employeeID}">${employee.fullName}</g:link></li>
 		</g:each>
 		</ul>
		<g:link action='advSearch'>Search Again</g:link>
	</div>
</body>
</html>
