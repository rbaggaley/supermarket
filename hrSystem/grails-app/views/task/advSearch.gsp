<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>AdvSearch</title>
</head>
<body>
	<div class="row">
		<h1>Search Tasks</h1>
		<formset>
			<legend>Search for Tasks(Advanced)</legend>
			<table>			
			<g:form action="AdvResults">
				<tr>
 					<td>Task Name</td>
 					<td><g:textField name="taskName" /></td>
 				</tr>
				<tr>
 					<td>Section Name</td>
 					<td><g:textField name="sectionName" /></td>
 				</tr>
				<<tr>
 					<td>Number of People</td>
 					<td><g:textField name="numberOfPeople" /></td>
 				</tr>

				<tr>
					<td>Query Type:</td>
					<td><g:radioGroup name="queryType" labels="['And','Or','Not']"
values="['and','or','not']" value="and" >
${it.radio} ${it.label}
 			</g:radioGroup>
 				</td>
 					</tr>
					<tr>
 				<td/>
 				<td>
 					<g:submitButton name="search" value="Search"/></td>
 					</tr>
 			</g:form>
 			</table>
 		</formset>
	</div>
</body>
</html>
			
 	
		
