<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Costco Human Resources System Manager| Home Page</title>
</head>
<body>
	<div class="row">
		<h1>Cosco Human Resources System</h1>
 		<h3>Advanced Results for Tasks</h3>
		<p>Searched ${totalTasks} records 
 			for tasks matching <em>${term}</em>.
 			Found <strong>${tasks.size()}</strong> tasks.
 		</p>
		<ul>
 		<g:each var="task" in="${tasks}">
 			<li><g:link controller="task" action="index"
id="${task.taskName}">${task.taskName}</g:link></li>
 		</g:each>
 		</ul>
		<g:link action='advSearch'>Search Again</g:link>
	</div>
</body>
</html>
