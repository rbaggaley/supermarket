<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>taskSearch</title>
</head></head>
<body>
	<div class="row">
		<h1>Search Tasks</h1>
		<formset>
			<legend>Advanced search</legend>
			<table>
				<g:form action = "advResults">
				<tr>
					<td>Task Name</td>
					<td><g:textField name="name"/></td>
				</tr>
				<tr>
					<td>Task Section Name</td>
					<td><g:textField name="sectionname"/></td>
				</tr>
				<tr>
					<td>Number of People</td>
					<td><g:textField number="number"/></td>
				</tr>
				<tr>
					<td>Query Type</td>
					<td><g:radioGroup name="queryType" labels="['And','Or','Not']" values="['and','or','not']" value = "and">
					${it.radio} ${it.lable} 
					</g:radioGroup></td>
				</tr>
				<tr>
					<td><g:submitButton name="search" value="Search"/></td>
				</tr>
				</g:form>
			</table>
		</formset>
	</div>       						
				
</body>
</html>
