<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Costco Human Resources System Team Leader| Home Page</title>
</head>
<body>
    
    <div id="content" role="main">
	<div class="row">
		<div class="first">
			<h3>Display Tasks</h3>
		<p></p>
			<button type="button" class="btn btn-success">
				<g:link controller="task" action="create">Add/List Tasks</g:link>
			</button>
		</div>
		<div class="first">
			<h3>Emloyees</h3>
		<p></p>
			<button type="button" class="btn btn-success">
				<g:link controller="employee" action="create">List Employees</g:link>
			</button>
		</div>
		<div class="first">
			<h3>Teams</h3>
		<p></p>
			<button type="button" class="btn btn-success">
				<g:link controller="team" action="create">List Teams</g:link>
			</button>
		</div>
		<div class="first">
			<h3>TeamLeaders</h3>
		<p></p>
			<button type="button" class="btn btn-success">
				<g:link controller="teamLeader" action="create">List Teams</g:link>
			</button>
		</div>
		<div class="first">
			<h3>Managers</h3>
		<p></p>
			<button type="button" class="btn btn-success">
				<g:link controller="manager" action="create">List Teams</g:link>
			</button>
		</div>
		<div class="first">
			<h3>Shifts</h3>
		<p></p>
			<button type="button" class="btn btn-success">
				<g:link controller="shift" action="create">List Shifts</g:link>
			</button>
		</div>

		
	</div>
    </div>
</body>
</html>
